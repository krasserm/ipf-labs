package org.openehealth.ipf.commons.utils.couch.impl

import org.openehealth.ipf.commons.utils.couch.Couch
import org.openehealth.ipf.commons.utils.couch.Database
import org.openehealth.ipf.commons.utils.couch.JsonParser
import org.openehealth.ipf.commons.utils.couch.JsonWebResource
import static com.sun.jersey.api.client.ClientResponse.Status.CREATED
import static com.sun.jersey.api.client.ClientResponse.Status.NOT_FOUND
import static com.sun.jersey.api.client.ClientResponse.Status.OK
import static com.sun.jersey.api.client.ClientResponse.Status.PRECONDITION_FAILED

class DefaultDatabase implements Database {
    def final String name
    def final JsonWebResource resource
    def final JsonParser parser

    DefaultDatabase(Couch couch, String name) {
        this.name = name
        this.resource = couch.resource.sub(name)
        this.parser = couch.parser
    }

    boolean create() {
        resource.putJson('').match((CREATED): { true }, (PRECONDITION_FAILED): { false })
    }

    boolean delete() {
        resource.delete().match((OK): { true }, (NOT_FOUND): { false })
    }
}
