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
package org.openehealth.ipf.platform.camel.message

import org.apache.camel.CamelContext
import org.apache.camel.EndpointInject
import org.apache.camel.Exchange
import org.apache.camel.ExchangePattern
import org.apache.camel.ProducerTemplate
import org.apache.camel.component.mock.MockEndpoint
import org.apache.camel.impl.DefaultExchange
import org.junit.After
import org.junit.Test
import org.junit.runner.RunWith
import org.openehealth.ipf.commons.message.Message
import org.openehealth.ipf.commons.message.MessageStoreBase
import org.openehealth.ipf.commons.store.DocumentNotFoundException
import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.store.Store
import org.openehealth.ipf.platform.camel.core.junit.DirtySpringContextJUnit4ClassRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNull
import static org.openehealth.ipf.platform.camel.core.util.Exchanges.resultMessage

@RunWith(DirtySpringContextJUnit4ClassRunner)
@ContextConfiguration(locations = ['/camel-test-message.xml', '/camel-test-message-jpa.xml'])
class MessageJpaTest {
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
    void testStoreAndFetchMsg() {
        def body = 'test'
        def exchange = send('direct:storeMsg', body, [foo: 'bar'])
        def msgId = (String)resultMessage(exchange).headers.msgId

        exchange = send('direct:fetchMsg', 'bla', [foofoo: 'barbar', msgId: msgId])

        assertEquals('test', resultMessage(exchange).body)
        assertEquals('bar', resultMessage(exchange).headers.foo)
        assertEquals(msgId, resultMessage(exchange).headers.msgId)
        assertNull(resultMessage(exchange).headers.foofoo)

        def msg = store.getDocument(org.openehealth.ipf.commons.message.Message.class, msgId)
        assertEquals('direct://storeMsg', msg.identifier)
    }

    @Test
    void testStoreMetaData() {
        def body = 'test'
        def exchange = send('direct:storeMessageMetaData', body, [:])
        def msgId = (String)resultMessage(exchange).headers.msgId
        def metaData = msgStore.getMetaDataForMessage(msgId, new QueryRange()).results
        assertEquals(2, metaData.size())
        assertEquals('testkey1', metaData[0].key)
        assertEquals('test', metaData[0].value)
        assertEquals('testkey2', metaData[1].key)
        assertEquals('testvalue2', metaData[1].value)
    }

    @Test
    void testStoreMsgWithIdentifier() {
        def body = 'test'
        def exchange = send('direct:storeMsgWithIdentifier', body, [foo: 'bar'])
        def msgId = (String)resultMessage(exchange).headers.msgId
        def msg = store.getDocument(Message.class, msgId)
        assertEquals('foo', msg.identifier)
    }

    @Test(expected = DocumentNotFoundException)
    void testDeleteMsg() {
        Exchange result = send('direct:storeMsg', 'test', [foo: 'bar'])
        def msgId = resultMessage(result).headers.msgId
        result = send('direct:deleteMsg', 'bla', [msgId: msgId])
        assertNull(resultMessage(result).headers.msgId)
        store.getDocument(Message, (String)msgId)
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
