package org.openehealth.ipf.commons.utils.couch

class Lucene {
    def final Database db
    def final JsonWebResource resource

    Lucene(Database db, String designDoc, String name) {
        this(db, '_fti', designDoc, name)
    }

    Lucene(Database db, String indexerName, String designDoc, String name) {
        this.db = db
        this.resource = db.resource.sub("$indexerName/$designDoc/$name")
    }
}
