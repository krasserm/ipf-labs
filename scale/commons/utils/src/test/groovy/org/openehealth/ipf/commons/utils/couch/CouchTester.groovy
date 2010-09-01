package org.openehealth.ipf.commons.utils.couch

import org.openehealth.ipf.commons.utils.couch.impl.DefaultCouch
import org.openehealth.ipf.commons.utils.couch.impl.DefaultDatabase
import org.openehealth.ipf.commons.utils.couch.jsonlib.JsonParserImpl
import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import static org.junit.Assert.assertEquals

abstract class CouchTester {
    private static deleter

    def JsonParser parser
    def Couch couch
    def Database db
    def String dbName

    @BeforeClass
    static void setUpBeforeClass() {
        deleter = new AsyncDbDeleter()
    }

    @Before
    void setUpDatabase() {
        parser = new JsonParserImpl()
        couch = new DefaultCouch('http://localhost:5984', parser)
        dbName = 'testdb' + UUID.randomUUID().toString().replaceAll('-', '')
        db = new DefaultDatabase(couch, dbName)

        assertEquals(true, db.create())
    }

    @After void tearDownDatabase() { deleter.deleteDb(db) }
    @AfterClass static void tearDownAfterClass() { deleter.terminate() }
}
