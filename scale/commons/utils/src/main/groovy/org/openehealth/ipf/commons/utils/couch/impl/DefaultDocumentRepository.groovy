package org.openehealth.ipf.commons.utils.couch.impl

import org.openehealth.ipf.commons.utils.couch.Database
import org.openehealth.ipf.commons.utils.couch.DocumentRepository
import org.openehealth.ipf.commons.utils.couch.JsonParser
import org.openehealth.ipf.commons.utils.couch.JsonWebResource
import static com.sun.jersey.api.client.ClientResponse.Status.CONFLICT
import static com.sun.jersey.api.client.ClientResponse.Status.CREATED
import static com.sun.jersey.api.client.ClientResponse.Status.NOT_FOUND
import static com.sun.jersey.api.client.ClientResponse.Status.OK

class DefaultDocumentRepository implements DocumentRepository {
    def final JsonWebResource resource
    def final JsonParser parser

    def final RETURN_REV = { String it -> parser.toObj(it).toJava('rev', String) }

    DefaultDocumentRepository(Database database) {
        this.resource = database.resource
        this.parser = database.parser
    }

    void create(doc) {
        putDocument(doc, UUID.randomUUID().toString(), doc.getClass())
    }

    void update(doc) {
        putDocument(doc, doc._id, doc.getClass())
    }

    void updateIfChanged(doc) {
        def existingJson = resource.sub(doc._id).json.match((OK): { it }, (NOT_FOUND): { null })
        def existingJsonParsedInSameWay = parser.toJson(parser.toBean(existingJson, Map))
        def newJsonParsedInSameWay = parser.toJson(parser.toBean(parser.toJson(doc), Map))
        if (!newJsonParsedInSameWay.equals(existingJsonParsedInSameWay)) {
            putDocument(doc, doc._id, doc.getClass())
        }
    }

    void delete(Object doc) {
        resource.sub(doc._id).query(rev: doc._rev).delete().match((OK): {})
    }

    def get(String docId, Class type) {
        resource.sub(docId).json.match((OK): { parser.toBean(it, type) }, (NOT_FOUND): { null })
    }

    private void putDocument(doc, String docId, Class type) {
        def json = parser.toJson(doc)
        def docInfo = resource.sub(docId).putJson(json).match(
                (CREATED): { [_id: docId, _rev: RETURN_REV(it)] },
                (CONFLICT): { throw new ConflictException(docId) })

        docInfo.each { key, value -> doc[key] = value }
    }
}
