package org.openehealth.ipf.commons.utils.couch

import org.openehealth.ipf.commons.utils.couch.impl.DefaultAttachmentRepository
import org.openehealth.ipf.commons.utils.couch.impl.DefaultDocumentRepository
import org.apache.commons.io.IOUtils
import org.junit.Before
import org.junit.Test
import org.openehealth.ipf.commons.utils.stream.Use
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull

class DefaultAttachmentRepositoryTest extends CouchTester {
    def DocumentRepository docRepo
    def AttachmentRepository attRepo
    def MyObj doc

    @Before
    void setUp() {
        docRepo = new DefaultDocumentRepository(db)
        attRepo = new DefaultAttachmentRepository(db)

        doc = new MyObj()
        docRepo.create(doc)
    }

    @Test
    void addAndGetAttachment() {
        def newRev = Use.use(IOUtils.toInputStream('testgarbage')) { InputStream it ->
            attRepo.set(doc._id, doc._rev, 'test', 'text/plain', it)
        }
        assertNotNull(newRev)

        def retrieved = Use.use(attRepo.get(doc._id, 'test')) { IOUtils.toString(it) }
        assertEquals('testgarbage', retrieved)
    }

    @Test
    void updateAttachment() {
        String rev1 = Use.use(IOUtils.toInputStream('testgarbage1')) { InputStream it ->
            attRepo.set(doc._id, doc._rev, 'test', 'text/plain', it)
        }

        String rev2 = Use.use(IOUtils.toInputStream('testgarbage2')) { InputStream it ->
            attRepo.set(doc._id, rev1, 'test', 'text/plain', it)
        }

        assertEquals(true, rev1 != rev2)

        def retrieved = Use.use(attRepo.get(doc._id, rev2, 'test')) { IOUtils.toString(it) }
        assertEquals('testgarbage2', retrieved)
    }

    @Test
    void getSpecificRevAttachment() {
        String rev1 = Use.use(IOUtils.toInputStream('testgarbage1')) { InputStream it ->
            attRepo.set(doc._id, doc._rev, 'test', 'text/plain', it)
        }

        String rev2 = Use.use(IOUtils.toInputStream('testgarbage2')) { InputStream it ->
            attRepo.set(doc._id, rev1, 'test', 'text/plain', it)
        }

        def retrieved1 = Use.use(attRepo.get(doc._id, rev1, 'test')) { IOUtils.toString(it) }
        assertEquals('testgarbage1', retrieved1)

        def retrieved2 = Use.use(attRepo.get(doc._id, rev2, 'test')) { IOUtils.toString(it) }
        assertEquals('testgarbage2', retrieved2)

        Use.use(attRepo.get(doc._id, doc._rev, 'test')) { assertEquals(null, it) }
    }

    @Test
    void deleteAttachment() {
        String rev1 = Use.use(IOUtils.toInputStream('testgarbage')) { InputStream it ->
            attRepo.set(doc._id, doc._rev, 'test', 'text/plain', it)
        }

        String rev2 = attRepo.delete(doc._id, rev1, 'test')
        assertNotNull(rev2)
        assertEquals(true, rev1 != rev2)

        Use.use(attRepo.get(doc._id, 'test')) { assertEquals(null, it) }
    }

    @Test
    void attachmentIsKeptWhenUpdatingDocument() {
        def newRev = Use.use(IOUtils.toInputStream('testgarbage')) { InputStream it ->
            attRepo.set(doc._id, doc._rev, 'test', 'text/plain', it)
        }
        assertNotNull(newRev)

        def doc2 = docRepo.get(doc._id, MyObj.class)
        doc2.key = 'updated'
        docRepo.update(doc2)

        def retrieved = Use.use(attRepo.get(doc._id, 'test')) { IOUtils.toString(it) }
        assertEquals('testgarbage', retrieved)
    }
}
