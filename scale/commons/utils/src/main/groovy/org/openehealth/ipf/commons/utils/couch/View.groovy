package org.openehealth.ipf.commons.utils.couch

class View {
    def final Database db
    def final JsonWebResource resource

    View(Database db, String designDoc, String name) {
        this.db = db
        this.resource = db.resource.sub("_design/$designDoc/_view/$name")
    }
}
