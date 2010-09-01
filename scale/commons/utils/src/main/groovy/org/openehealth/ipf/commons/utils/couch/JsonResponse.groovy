package org.openehealth.ipf.commons.utils.couch

import com.sun.jersey.api.client.ClientResponse
import javax.ws.rs.core.Response.Status
import org.apache.commons.io.IOUtils
import org.openehealth.ipf.commons.utils.stream.Use

class JsonResponse {
    def final ClientResponse response

    JsonResponse(ClientResponse response) {
        this.response = response
    }

    def match(Map<Status, Closure> match) {
        try {
            def status = response.clientResponseStatus
            if (match.containsKey(status)) {
                final json = Use.use(response.entityInputStream) { IOUtils.toString(it) }
                return match[status](json)
            }
            throw new WebRequestFailedException(response)
        }
        finally {
            response.close()
        }
    }
}
