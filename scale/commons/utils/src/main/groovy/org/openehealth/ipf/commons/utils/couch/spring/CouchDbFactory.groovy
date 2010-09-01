package org.openehealth.ipf.commons.utils.couch.spring

import org.openehealth.ipf.commons.utils.couch.impl.DefaultCouch
import org.openehealth.ipf.commons.utils.couch.impl.DefaultDatabase
import org.openehealth.ipf.commons.utils.couch.jsonlib.JsonParserImpl
import org.openehealth.ipf.commons.utils.couch.Database

class CouchDbFactory {
    def String uri
    def String name

    Database create() {
        def parser = new JsonParserImpl()
        def couch = new DefaultCouch(uri, parser)
        def db = new DefaultDatabase(couch, name)
        db.create()
        db
    }
}
