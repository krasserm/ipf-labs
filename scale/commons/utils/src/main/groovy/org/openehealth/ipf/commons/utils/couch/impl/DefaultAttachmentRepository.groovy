package org.openehealth.ipf.commons.utils.couch.impl

import org.openehealth.ipf.commons.utils.couch.AttachmentRepository
import org.openehealth.ipf.commons.utils.couch.Database
import org.openehealth.ipf.commons.utils.couch.JsonParser
import org.openehealth.ipf.commons.utils.couch.JsonWebResource
import static com.sun.jersey.api.client.ClientResponse.Status.CREATED
import static com.sun.jersey.api.client.ClientResponse.Status.NOT_FOUND
import static com.sun.jersey.api.client.ClientResponse.Status.OK

class DefaultAttachmentRepository implements AttachmentRepository {
    def final JsonWebResource resource
    def final JsonParser parser

    def final RETURN_REV = { String it -> parser.toObj(it).toJava('rev', String) }

    DefaultAttachmentRepository(Database database) {
        this.resource = database.resource
        this.parser = database.parser
    }

    String set(String docId, String rev, String attId, String contentType, InputStream content) {
        resource.sub("$docId/$attId")
                .query(rev: rev).putStream(contentType, content).match((CREATED): RETURN_REV)
    }

    InputStream get(String docId, String attId) {
        resource.sub("$docId/$attId").stream.match((OK): { it }, (NOT_FOUND): { null })
    }

    InputStream get(String docId, String rev, String attId) {
        resource.sub("$docId/$attId").query(rev: rev).stream.match((OK): { it }, (NOT_FOUND): { null })
    }

    String delete(String docId, String rev, String attId) {
        resource.sub("$docId/$attId").query(rev: rev).delete().match((OK): RETURN_REV)
    }
}
