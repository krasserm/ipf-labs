package org.openehealth.ipf.commons.utils.couch

class ViewResultRow extends ResultRow {
    ViewResultRow(JsonObject obj) { super(obj) }

    def getKey(Class type) { get('key', type) }
    def getValue(Class type) { get('value', type) }
}
