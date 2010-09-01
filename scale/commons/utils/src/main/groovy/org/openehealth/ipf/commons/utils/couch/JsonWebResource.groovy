package org.openehealth.ipf.commons.utils.couch

import com.sun.jersey.api.client.Client
import com.sun.jersey.api.client.ClientResponse

import com.sun.jersey.api.client.WebResource

import static javax.ws.rs.core.MediaType.APPLICATION_JSON

class JsonWebResource {
    def final WebResource resource
    def final Client client
    
    private JsonWebResource(Client client, WebResource resource) {
        this.client = client
        this.resource = resource
    }

    static JsonWebResource newResource(Client client, String path) { newResource(client, new URI(path)) }

    static JsonWebResource newResource(Client client, URI uri) {
        new JsonWebResource(client, client.resource(uri))
    }

    JsonWebResource sub(String relPath) {
        new JsonWebResource(client, client.resource("${resource.getURI()}/$relPath"))
    }

    JsonWebResource query(Map<String, String> params) {
        def newResource = (WebResource)params.inject(resource) { inject, it -> inject.queryParam(it.key, it.value) }
        new JsonWebResource(client, newResource)
    }


    JsonResponse putStream(String contentType, InputStream inputStream) {
        new JsonResponse(resource.type(contentType).put(ClientResponse.class, inputStream))
    }

    StreamResponse getStream() {
        new StreamResponse(resource.get(ClientResponse.class))
    }

    JsonResponse getJson() {
        new JsonResponse(resource.accept(APPLICATION_JSON).get(ClientResponse.class))
    }

    JsonResponse delete() {
        new JsonResponse(resource.delete(ClientResponse.class))
    }

    JsonResponse putJson(String json) {
        new JsonResponse(resource.type(APPLICATION_JSON).put(ClientResponse.class, json))
    }
}
