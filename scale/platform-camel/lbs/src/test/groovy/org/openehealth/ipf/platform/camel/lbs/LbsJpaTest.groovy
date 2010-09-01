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
package org.openehealth.ipf.platform.camel.lbs

import javax.activation.DataSource
import org.apache.camel.component.mock.MockEndpoint
import org.apache.camel.impl.DefaultExchange
import org.apache.commons.httpclient.HttpClient
import org.apache.commons.httpclient.methods.PostMethod
import org.apache.commons.httpclient.methods.StringRequestEntity
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity
import org.apache.commons.httpclient.methods.multipart.Part
import org.apache.commons.httpclient.methods.multipart.StringPart
import org.apache.commons.io.IOUtils
import org.junit.After
import org.junit.Test
import org.junit.runner.RunWith
import org.openehealth.ipf.commons.lbs.LbsContext
import org.openehealth.ipf.commons.lbs.LbsDocument
import org.openehealth.ipf.commons.lbs.MultipartHelper
import org.openehealth.ipf.commons.lbs.StoreDataSource
import org.openehealth.ipf.commons.message.MessageStoreBase
import org.openehealth.ipf.commons.store.Store
import org.openehealth.ipf.platform.camel.core.junit.DirtySpringContextJUnit4ClassRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.apache.camel.*
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertSame
import static org.openehealth.ipf.platform.camel.core.util.Exchanges.resultMessage

@RunWith(DirtySpringContextJUnit4ClassRunner)
@ContextConfiguration(locations = ['/camel-test-lbs.xml', '/camel-test-lbs-jpa.xml'])
class LbsJpaTest {
    @Autowired CamelContext camelContext
    @Autowired ProducerTemplate producerTemplate
    @Autowired Store store
    @Autowired MessageStoreBase msgStore

    @EndpointInject(uri="mock:test")
    MockEndpoint mock

    @After
    void tearDown() {
        mock.reset()
    }

    @Test
    void testStoreAndFetchMsgWithRefStream() {
        def doc = new LbsDocument()
        store.createDocument(doc)
        store.createAttachment(doc, 'part', 'application/octet-stream', IOUtils.toInputStream('test'))
        def body = new StoreDataSource(
            docId: doc._id,
            store: store,
            name: 'part',
            contentType: 'application/octet-stream')

        def exchange = send('direct:storeMsg', body, [:])
        assertSame(StoreDataSource, resultMessage(exchange).body.class)
        def resultBody = (StoreDataSource)resultMessage(exchange).body
        assertEquals('test', IOUtils.toString(resultBody.inputStream))
        def msgId = resultMessage(exchange).headers.msgId

        exchange = send('direct:fetchMsg', 'bla', [msgId: msgId])
        def stream = resultMessage(exchange).body.inputStream
        try {
            assertEquals('test', IOUtils.toString(stream))
        }
        finally {
            stream.close()
        }
    }

    @Test
    void testStoreLbsSinglePart() {
        def client = new HttpClient()
        def method = new PostMethod('http://localhost:8080/lbs')
        method.requestEntity = new StringRequestEntity('foo')
        try {
            assertEquals(200, client.executeMethod(method))
            assertEquals('foo', method.responseBodyAsString)
        }
        finally {
            method.releaseConnection()
        }
    }

    @Test
    void testStoreLbsMultiPart() {
        def client = new HttpClient()
        def method = new PostMethod('http://localhost:8080/lbs')
        Part[] parts = [ new StringPart("part1", "foo"), new StringPart("part2", "bar") ]
        method.requestEntity = new MultipartRequestEntity(parts, method.params)
        try {
            assertEquals(200, client.executeMethod(method))
            def contentType = method.requestEntity.contentType
            def stream = method.responseBodyAsStream
            def results = []
            MultipartHelper.toDataSources(new LbsContext(inputStream: stream, contentType: contentType)) { inputStream, name, ct ->
                results += IOUtils.toString(inputStream)
            }
            assertEquals(2, results.size())
            assertEquals('foo', results[0])
            assertEquals('bar', results[1])
        }
        finally {
            method.releaseConnection()
        }
    }

    @Test
    void testMultipart() {
        def dataSources = (DataSource[])send('direct:multipart', 'foo')
        assertEquals(2, dataSources.length)
        assertEquals('foo', IOUtils.toString(dataSources[0].inputStream))
        assertEquals('bar', IOUtils.toString(dataSources[1].inputStream))
    }

    private Object send(String endpointUri, Object body) {
        def endpoint = camelContext.getEndpoint(endpointUri)
        def exchange = new DefaultExchange(endpoint, ExchangePattern.InOut)
        exchange.in.body = body
        def result = producerTemplate.send(endpoint, exchange)
        if (result.exception != null) {
            throw result.exception
        }
        resultMessage(result).body
    }

    private Exchange send(String endpointUri, Object body, Map headers) {
        def endpoint = camelContext.getEndpoint(endpointUri)
        def exchange = new DefaultExchange(endpoint, ExchangePattern.InOut)
        exchange.in.body = body
        exchange.in.headers = headers
        def result = producerTemplate.send(endpoint, exchange)
        if (result.exception != null) {
            throw result.exception
        }
        result
    }
}
