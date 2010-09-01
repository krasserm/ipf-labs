package org.openehealth.ipf.commons.utils.couch.impl

import com.sun.jersey.api.client.Client
import org.openehealth.ipf.commons.utils.couch.Couch
import org.openehealth.ipf.commons.utils.couch.JsonParser
import org.openehealth.ipf.commons.utils.couch.JsonWebResource
import static com.sun.jersey.api.client.ClientResponse.Status.OK

class DefaultCouch implements Couch {
    def final URI location
    def final JsonParser parser
    def final JsonWebResource resource
    def final JsonWebResource allDbsResource

    DefaultCouch(URI location, JsonParser parser) {
        this.location = location
        this.parser = parser
        this.resource = JsonWebResource.newResource(Client.create(), location)
        this.allDbsResource = resource.sub('_all_dbs')
    }

    DefaultCouch(String location, JsonParser parser) {
        this(new URI(location), parser)
    }

    List<String> getDatabases() {
        parser.toArray(allDbsResource.json.match((OK): { it })).toList(String)
    }
}
