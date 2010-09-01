package org.openehealth.ipf.commons.utils.couch

import org.openehealth.ipf.commons.utils.couch.impl.DefaultDocumentRepository
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.assertEquals
import org.openehealth.ipf.commons.utils.couch.impl.ViewQuery

class ViewQueryTest extends CouchTester {
    def DocumentRepository docRepo
    def View view

    @Before
    void setUp() {
        docRepo = new DefaultDocumentRepository(db)
        view = new View(db, 'test', 'testview')
    }

    @Test
    void queryViewWithMap() {
        def doc1 = [key1: 'value1', key2: 500]
        docRepo.create(doc1)
        def doc2 = [key1: 'value2', key2: 501]
        docRepo.create(doc2)

        docRepo.updateIfChanged(_id: '_design/test',
                views: [testview: [map: ' function(doc) { emit(null, doc); }']])

        def result = new ViewQuery(view).query()
        assertEquals(2, result.totalRows)
        assertEquals(0, result.offset)

        List<ViewResultRow> rows = result.rows
        assertEquals(2, rows.size())
        assertEquals([null] as Set, rows*.getKey(Object) as Set)
        assertEquals(['value1', 'value2'] as Set, rows*.getValue(Map).key1 as Set)
        assertEquals([500, 501] as Set, rows*.getValue(Map).key2 as Set)
    }

    @Test
    void queryViewWithObj() {
        def doc1 = new MyObj()
        docRepo.create(doc1)
        def doc2 = new MyObj(key: 'value2')
        docRepo.create(doc2)

        docRepo.updateIfChanged(_id: '_design/test',
                views: [testview: [map: ' function(doc) { emit(null, doc); }']])

        def queryResult = new ViewQuery(view).query()
        assertEquals(2, queryResult.totalRows)
        assertEquals(0, queryResult.offset)

        List<ViewResultRow> rows = queryResult.rows
        assertEquals(2, rows.size())
        assertEquals([null] as Set, rows*.getKey(Object) as Set)
        assertEquals([doc1, doc2] as Set, rows*.getValue(MyObj) as Set)
    }

    @Test
    void queryViewWithStartAndEndKey() {
        def doc1 = new MyObj()
        docRepo.create(doc1)
        def doc2 = new MyObj(key: 'value2')
        docRepo.create(doc2)

        docRepo.updateIfChanged(_id: '_design/test',
                views: [testview: [map: ' function(doc) { emit(doc.key, doc); }']])

        def queryResult = new ViewQuery(view).startKey('value2').endKey('value2').query()
        assertEquals(2, queryResult.totalRows)
        assertEquals(1, queryResult.offset)
        
        List<ViewResultRow> rows = queryResult.rows
        assertEquals(1, rows.size())
        assertEquals('value2', rows[0].getKey(String))
        assertEquals(doc2, rows[0].getValue(MyObj))
    }

    @Test
    void queryViewWithKey() {
        def doc1 = new MyObj()
        docRepo.create(doc1)
        def doc2 = new MyObj(key: 'value2')
        docRepo.create(doc2)

        docRepo.updateIfChanged(_id: '_design/test',
                views: [testview: [map: ' function(doc) { emit(doc.key, doc); }']])

        def queryResult = new ViewQuery(view).key('value2').query()
        assertEquals(2, queryResult.totalRows)
        assertEquals(1, queryResult.offset)

        List<ViewResultRow> rows = queryResult.rows
        assertEquals(1, rows.size())
        assertEquals('value2', rows[0].getKey(String))
        assertEquals(doc2, rows[0].getValue(MyObj))
    }

    @Test
    void queryViewWithKeyDescending() {
        def doc1 = new MyObj()
        docRepo.create(doc1)
        def doc2 = new MyObj(key: 'value2')
        docRepo.create(doc2)

        docRepo.updateIfChanged(_id: '_design/test',
                views: [testview: [map: ' function(doc) { emit(doc.key, doc); }']])

        def queryResult = new ViewQuery(view).key('value2').descending().query()
        assertEquals(2, queryResult.totalRows)
        assertEquals(0, queryResult.offset)

        List<ViewResultRow> rows = queryResult.rows
        assertEquals(1, rows.size())
        assertEquals('value2', rows[0].getKey(String))
        assertEquals(doc2, rows[0].getValue(MyObj))
    }

    @Test
    void queryViewWithLimit() {
        def doc1 = new MyObj()
        docRepo.create(doc1)
        def doc2 = new MyObj(key: 'value2')
        docRepo.create(doc2)

        docRepo.updateIfChanged(_id: '_design/test',
                views: [testview: [map: ' function(doc) { emit(doc.key, doc); }']])

        def queryResult = new ViewQuery(view).limit(1).query()
        assertEquals(2, queryResult.totalRows)
        assertEquals(0, queryResult.offset)

        List<ViewResultRow> rows = queryResult.rows
        assertEquals(1, rows.size())
        assertEquals('value1', rows[0].getKey(String))
        assertEquals(doc1, rows[0].getValue(MyObj))
    }

    @Test
    void queryViewWithSkip() {
        def doc1 = new MyObj()
        docRepo.create(doc1)
        def doc2 = new MyObj(key: 'value2')
        docRepo.create(doc2)

        docRepo.updateIfChanged(_id: '_design/test',
                views: [testview: [map: ' function(doc) { emit(doc.key, doc); }']])

        def queryResult = new ViewQuery(view).skip(1).query()
        assertEquals(2, queryResult.totalRows)
        assertEquals(1, queryResult.offset)
        
        List<ViewResultRow> rows = queryResult.rows
        assertEquals(1, rows.size())
        assertEquals('value2', rows[0].getKey(String))
        assertEquals(doc2, rows[0].getValue(MyObj))
    }

    @Test
    void queryViewWithGroup() {
        def doc1 = new MyObj()
        docRepo.create(doc1)
        def doc2 = new MyObj()
        docRepo.create(doc2)

        docRepo.updateIfChanged(_id: '_design/test',
                views: [testview: [
                            map: ' function(doc) { emit(doc.key, 1); }',
                            reduce: ' function(key, values) { return sum(values) }']])

        def queryResult = new ViewQuery(view).group().query()

        List<ViewResultRow> rows = queryResult.rows
        assertEquals(1, rows.size())
        assertEquals('value1', rows[0].getKey(String))
        assertEquals(2, rows[0].getValue(Integer))
    }

    @Test
    void queryViewWithNoReduce() {
        def doc1 = new MyObj()
        docRepo.create(doc1)
        def doc2 = new MyObj()
        docRepo.create(doc2)

        docRepo.updateIfChanged(_id: '_design/test',
                views: [testview: [
                            map: ' function(doc) { emit(doc.key, 1); }',
                            reduce: ' function(key, values) { return sum(values) }']])

        def queryResult = new ViewQuery(view).noReduce().query()
        assertEquals(2, queryResult.totalRows)
        assertEquals(0, queryResult.offset)

        List<ViewResultRow> rows = queryResult.rows
        assertEquals(2, rows.size())
        assertEquals('value1', rows[0].getKey(String))
        assertEquals(1, rows[0].getValue(Integer))
    }
}
