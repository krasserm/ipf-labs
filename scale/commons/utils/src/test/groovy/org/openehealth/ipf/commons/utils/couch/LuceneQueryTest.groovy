package org.openehealth.ipf.commons.utils.couch

import org.openehealth.ipf.commons.utils.couch.impl.DefaultDocumentRepository
import org.openehealth.ipf.commons.utils.couch.impl.LuceneQuery
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.assertEquals

class LuceneQueryTest extends CouchTester {
    def Lucene lucene
    def DocumentRepository docRepo
    def Map doc1
    def Map doc2

    @Before
    void setUp() {
        docRepo = new DefaultDocumentRepository(db)
        lucene = new Lucene(db, 'lucene', 'testindex')

        doc1 = [key: 'value1', other: 500] as HashMap
        docRepo.create(doc1)

        doc2 = [key: 'value2', other: 501] as HashMap
        docRepo.create(doc2)
    }

    @Test
    void testQueryByValue() {
        docRepo.updateIfChanged(_id: '_design/lucene',
                fulltext:
                    [testindex: [index: ' function(doc) { var ret = new Document(); ret.add(doc.key); return ret }']])

        QueryResult<LuceneResultRow> queryResult = tryUntilOk { new LuceneQuery(lucene).q('value*').query() }
        assertEquals(2, queryResult.totalRows)

        List<LuceneResultRow> rows = queryResult.rows
        assertEquals(2, rows.size())
        assertEquals([doc1._id, doc2._id] as Set, rows*.id as Set)
        assertEquals(rows[0].score, rows[1].score, 0)
    }

    @Test
    void testQueryIncludeDocs() {
        docRepo.updateIfChanged(_id: '_design/lucene',
                fulltext:
                    [testindex: [index: ' function(doc) { var ret = new Document(); ret.add(doc.key); return ret }']])

        QueryResult<LuceneResultRow> queryResult = tryUntilOk { new LuceneQuery(lucene).q('value*').includeDocs().query() }
        assertEquals(2, queryResult.totalRows)

        List<LuceneResultRow> rows = queryResult.rows
        assertEquals(2, rows.size())
        final List docs = rows*.getDoc(Map)
        assertEquals([doc1, doc2] as Set, docs as Set)
    }

    @Test
    void testQueryWithLimit() {
        docRepo.updateIfChanged(_id: '_design/lucene',
                fulltext:
                    [testindex: [index: ' function(doc) { var ret = new Document(); ret.add(doc.key); return ret }']])

        QueryResult<LuceneResultRow> queryResult = tryUntilOk { new LuceneQuery(lucene).q('value*').limit(1).query() }
        assertEquals(2, queryResult.totalRows)

        List<LuceneResultRow> rows = queryResult.rows
        assertEquals(1, rows.size())
        assertEquals(doc1._id, rows[0].id)
    }

    @Test
    void testQueryWithSkip() {
        docRepo.updateIfChanged(_id: '_design/lucene',
                fulltext:
                    [testindex: [index: ' function(doc) { var ret = new Document(); ret.add(doc.key); return ret }']])

        QueryResult<LuceneResultRow> queryResult = tryUntilOk { new LuceneQuery(lucene).q('value*').skip(1).query() }
        assertEquals(2, queryResult.totalRows)

        List<LuceneResultRow> rows = queryResult.rows
        assertEquals(1, rows.size())
        assertEquals(doc2._id, rows[0].id)
    }

    @Test
    void testQueryWithSort() {
        docRepo.updateIfChanged(_id: '_design/lucene',
                fulltext:
                    [testindex: [index: ' function(doc) { var ret = new Document(); ret.add(doc.key, {"field":"key"}); return ret }']])

        QueryResult<LuceneResultRow> queryResult = tryUntilOk { new LuceneQuery(lucene).q('key:value*').sort('\\key').query() }
        println queryResult
        assertEquals(2, queryResult.totalRows)

        List<LuceneResultRow> rows = queryResult.rows
        assertEquals(2, rows.size())
        assertEquals(doc2._id, rows[0].id)
        assertEquals(doc1._id, rows[1].id)
    }

    def tryUntilOk(Closure closure) {
        for (idx in 1..60) {
            try {
                def results = closure()
                if (results.totalRows > 0) {
                    return results
                }
            }
            catch (WebRequestFailedException ignored) {}
            Thread.sleep(1000)
        }

        throw new AssertionError('Could not complete request')
    }
}
