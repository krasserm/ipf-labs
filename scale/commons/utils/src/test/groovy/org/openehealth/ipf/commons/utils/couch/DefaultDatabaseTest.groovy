package org.openehealth.ipf.commons.utils.couch

import org.junit.Test
import static org.junit.Assert.assertEquals

class DefaultDatabaseTest extends CouchTester {
    @Test
    void getDatabases() {
        assertEquals(true, couch.databases.contains(dbName))
    }
}
