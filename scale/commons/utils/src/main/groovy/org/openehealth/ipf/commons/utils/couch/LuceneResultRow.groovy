package org.openehealth.ipf.commons.utils.couch

class LuceneResultRow extends ResultRow {
    LuceneResultRow(JsonObject obj) { super(obj) }

    String getId() { get('id', String.class) }
    double getScore() { get('score', Double.class) }
    def getDoc(Class type) { get('doc', type) }
}
