package org.openehealth.ipf.commons.store.couch

import org.openehealth.ipf.commons.utils.couch.AsyncDbDeleter
import org.openehealth.ipf.commons.utils.couch.Database
import org.openehealth.ipf.commons.utils.couch.spring.CouchDbFactory

class TestCouchDbFactory extends CouchDbFactory {
    def Database db

    Database create() {
        name = 'testdb' + UUID.randomUUID().toString().replaceAll('-', '')
        db = super.create()
        db
    }

    private def destroy() {
        def deleter = new AsyncDbDeleter()
        deleter.deleteDb(db)
        deleter.terminate()
    }
}

