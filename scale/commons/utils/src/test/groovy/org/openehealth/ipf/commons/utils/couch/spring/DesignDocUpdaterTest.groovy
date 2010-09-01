package org.openehealth.ipf.commons.utils.couch.spring

import org.openehealth.ipf.commons.utils.couch.CouchTester

import org.openehealth.ipf.commons.utils.couch.impl.DefaultDocumentRepository

import org.junit.Test
import static org.junit.Assert.assertEquals

class DesignDocUpdaterTest extends CouchTester {
    @Test
    void testUpdate() {
        def docRepo = new DefaultDocumentRepository(db)

        def updater1 = new DesignDocUpdater(db: db, designDocId: '_design/test',
                resources: ['views/testview/map': 'testmap1.js', 'views/testview/reduce': 'testreduce.js'])
        updater1.update()

        def designDoc1 = docRepo.get('_design/test', Map.class)
        assertEquals(' function(doc) { emit(doc.key, 1); }', designDoc1.views.testview.map)
        assertEquals(' function(key, values) { return sum(values) }', designDoc1.views.testview.reduce)

        updater1.update()

        def designDoc2 = docRepo.get('_design/test', Map.class)
        assertEquals(designDoc1._rev, designDoc2._rev)

        def updater2 = new DesignDocUpdater(db: db, designDocId: '_design/test',
                resources: ['views/testview/map': 'testmap2.js', 'views/testview/reduce': 'testreduce.js'])
        updater2.update()

        def designDoc3 = docRepo.get('_design/test', Map.class)
        assertEquals(true, designDoc1._rev != designDoc3._rev)
        assertEquals(' function(doc) { emit(doc.key, 2); }', designDoc3.views.testview.map)
        assertEquals(' function(key, values) { return sum(values) }', designDoc3.views.testview.reduce)
    }
}
