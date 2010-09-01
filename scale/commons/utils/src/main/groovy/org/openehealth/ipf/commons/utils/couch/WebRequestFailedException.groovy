package org.openehealth.ipf.commons.utils.couch

import com.sun.jersey.api.client.ClientResponse

class WebRequestFailedException extends RuntimeException {
    def final ClientResponse clientResponse

    def WebRequestFailedException(ClientResponse clientResponse) {
        super('Unexpected web service status code: ' + clientResponse.status)
        this.clientResponse = clientResponse
    }
}
