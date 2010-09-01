/*
 * Copyright 2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.commons.utils.http

import com.sun.jersey.api.container.httpserver.HttpServerFactory
import com.sun.jersey.api.core.ClassNamesResourceConfig
import com.sun.net.httpserver.HttpServer
import org.apache.commons.httpclient.HttpClient
import org.apache.commons.httpclient.methods.DeleteMethod
import org.apache.commons.httpclient.methods.GetMethod
import org.apache.commons.httpclient.methods.PostMethod
import org.apache.commons.httpclient.methods.StringRequestEntity
import org.openehealth.ipf.commons.utils.json.JSONSupport
import static org.junit.Assert.assertEquals

class HttpHelper {
    def json = new JSONSupport()
    def client = new HttpClient()
    def baseUrl

    HttpServer server

    def start(String baseUrl, List resources) {
        this.baseUrl = baseUrl

        def classes = resources.collect { it.class }
        def config = new ClassNamesResourceConfig(classes.toArray(new Class<?>[classes.size()]) )

        config.singletons.addAll(resources)
        server = HttpServerFactory.create(baseUrl, config)
        server.start()
    }

    def stop() {
        if (server != null) {
            server.stop(0)
        }
    }

    String get(String url) {
        def method = new GetMethod("$baseUrl/$url")
        try {
            assertEquals(200, client.executeMethod(method))
            method.responseBodyAsString
        } finally {
            method.releaseConnection()
        }
    }

    def getList(Class<?> elementType, String url) {
        def method = new GetMethod("$baseUrl/$url")
        try {
            assertEquals(200, client.executeMethod(method))
            json.parseList(method.responseBodyAsString, elementType)
        } finally {
            method.releaseConnection()
        }
    }

    def get(Class<?> type, String url) {
        def method = new GetMethod("$baseUrl/$url")
        try {
            assertEquals(200, client.executeMethod(method))
            json.parse(method.responseBodyAsString, type)
        } finally {
            method.releaseConnection()
        }
    }

    def delete(String url) {
        def method = new DeleteMethod("$baseUrl/$url")
        try {
            assertEquals(204, client.executeMethod(method))
        } finally {
            method.releaseConnection()
        }
    }

    def post(String url, String request, String contentType) {
        def method = new PostMethod("$baseUrl/$url")
        method.requestEntity = new StringRequestEntity(request, contentType, 'utf8')
        try {
            assertEquals(204, client.executeMethod(method))
        } finally {
            method.releaseConnection()
        }
    }
}
