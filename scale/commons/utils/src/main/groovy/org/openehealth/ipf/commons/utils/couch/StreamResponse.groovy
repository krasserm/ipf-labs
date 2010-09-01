package org.openehealth.ipf.commons.utils.couch

import com.sun.jersey.api.client.ClientResponse
import javax.ws.rs.core.Response.Status

class StreamResponse {
    def final ClientResponse response

    StreamResponse(ClientResponse response) {
        this.response = response
    }

    def match(Map<Status, Closure> match) {
        def status = response.clientResponseStatus
        if (match.containsKey(status)) {
            return match[status](response.entityInputStream)
        }
        throw new WebRequestFailedException(response)
    }
}
