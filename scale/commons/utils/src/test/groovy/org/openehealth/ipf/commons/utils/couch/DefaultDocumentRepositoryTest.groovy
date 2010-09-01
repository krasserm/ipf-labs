package org.openehealth.ipf.commons.utils.couch

import org.openehealth.ipf.commons.utils.couch.impl.DefaultDocumentRepository
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull

class DefaultDocumentRepositoryTest extends CouchTester {
    def DocumentRepository docRepo

    @Before
    void setUp() {
        docRepo = new DefaultDocumentRepository(db)
    }

    @Test
    void getDatabases() {
        assertEquals(true, couch.databases.contains(dbName))
    }

    @Test
    void createDocumentViaMap() {
        def doc = [key1: 'value1', key2: 500]
        docRepo.create(doc)

        assertEquals(4, doc.size())
        assertEquals('value1', doc.key1)
        assertEquals(500, doc.key2)
        assertNotNull(doc._rev)
        assertNotNull(doc._id)
    }

    @Test
    void updateDocumentViaMap() {
        def doc = [key1: 'value1', key2: 500]
        docRepo.create(doc)
        def docId = doc._id
        def rev = doc._rev

        doc.key1 = 'value1new'
        docRepo.update(doc)
        assertEquals(4, doc.size())
        assertEquals('value1new', doc.key1)
        assertEquals(500, doc.key2)
        assertEquals(true, rev != doc._rev)
        assertEquals(docId, doc._id)
    }

    @Test
    void updateDocumentIfChangedViaMapNoChange() {
        def doc = [key1: 'value1', key2: 500]
        docRepo.create(doc)
        def rev = doc._rev

        docRepo.updateIfChanged(doc)
        assertEquals(rev, doc._rev)
    }

    @Test
    void updateDocumentIfChangedViaMapChanged() {
        def doc = [key1: 'value1', key2: 500]
        docRepo.create(doc)
        def docId = doc._id
        def rev = doc._rev

        doc.key1 = 'value1new'
        docRepo.updateIfChanged(doc)
        assertEquals(4, doc.size())
        assertEquals('value1new', doc.key1)
        assertEquals(500, doc.key2)
        assertEquals(true, rev != doc._rev)
        assertEquals(docId, doc._id)
    }

    @Test
    void getDocumentViaMap() {
        def doc = [key1: 'value1', key2: 500]
        docRepo.create(doc)
        String docId = doc._id

        def retrieved = docRepo.get(docId, Map)
        assertEquals(doc, retrieved)
    }

    @Test
    void createDocumentViaObj() {
        def doc = new MyObj()
        docRepo.create(doc)

        assertEquals('value1', doc.key)
        assertNotNull(doc._rev)
        assertNotNull(doc._id)
    }

    @Test
    void updateDocumentViaObj() {
        def doc = new MyObj()
        docRepo.create(doc)
        def docId = doc._id
        def rev = doc._rev

        doc.key = 'value1new'
        docRepo.update(doc)
        assertEquals('value1new', doc.key)
        assertEquals(true, rev != doc._rev)
        assertEquals(docId, doc._id)
    }

    @Test
    void updateDocumentIfChangedViaObjNoChange() {
        def doc = new MyObj()
        docRepo.create(doc)
        def rev = doc._rev

        docRepo.updateIfChanged(doc)
        assertEquals(rev, doc._rev)
    }

    @Test
    void updateDocumentIfChangedViaObjChanged() {
        def doc = new MyObj()
        docRepo.create(doc)
        def docId = doc._id
        def rev = doc._rev

        doc.key = 'value1new'
        docRepo.updateIfChanged(doc)
        assertEquals('value1new', doc.key)
        assertEquals(true, rev != doc._rev)
        assertEquals(docId, doc._id)
    }

    @Test
    void getDocumentViaObj() {
        def doc = new MyObj()
        docRepo.create(doc)

        def retrieved = docRepo.get(doc._id, MyObj)
        assertEquals(doc, retrieved)
    }

    @Test
    void deleteDocument() {
        def doc = new MyObj()
        docRepo.create(doc)
        docRepo.delete(doc)
        assertEquals(null, docRepo.get(doc._id, MyObj))
    }
}
