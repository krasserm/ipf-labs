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
package org.openehealth.ipf.platform.camel.store

import org.apache.camel.CamelContext
import org.apache.camel.EndpointInject
import org.apache.camel.ExchangePattern
import org.apache.camel.ProducerTemplate
import org.apache.camel.component.mock.MockEndpoint
import org.apache.camel.impl.DefaultExchange
import org.junit.After
import org.junit.Test
import org.junit.runner.RunWith
import org.openehealth.ipf.commons.store.DocumentNotFoundException
import org.openehealth.ipf.commons.store.Store
import org.openehealth.ipf.platform.camel.core.junit.DirtySpringContextJUnit4ClassRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import static org.junit.Assert.assertEquals
import static org.openehealth.ipf.platform.camel.core.util.Exchanges.resultMessage

@RunWith(DirtySpringContextJUnit4ClassRunner)
@ContextConfiguration(locations = ['/camel-test-store.xml', '/camel-test-store-jpa.xml'])
class StoreJpaTest {
    @Autowired CamelContext camelContext
    @Autowired ProducerTemplate producerTemplate
    @Autowired Store store

    @EndpointInject(uri="mock:test")
    MockEndpoint mock

    @After
    void tearDown() {
        mock.reset()
    }

    @Test
    void testStoreDoc() {
        def doc = new SomeTestEntity(foo: 'bar')
        send('direct:storeDoc', doc)
        def storedDoc = store.getDocument(SomeTestEntity, doc._id)
        assertEquals('bar', storedDoc.foo)
    }

    @Test
    void testFetchDoc() {
        def doc = new SomeTestEntity(foo: 'bar')
        send('direct:storeDoc', doc)
        def result = send('direct:fetchDoc', doc._id)
        assertEquals('bar', result.foo)
    }

    @Test
    void testUpdateDoc() {
        def doc = new SomeTestEntity(foo: 'bar')
        send('direct:storeDoc', doc)
        doc.foofoo = 'barbar'
        send('direct:storeDoc', doc)
        def storedDoc = store.getDocument(SomeTestEntity, doc._id)
        assertEquals('bar', storedDoc.foo)
        assertEquals('barbar', storedDoc.foofoo)
    }

    @Test(expected = DocumentNotFoundException)
    void testDeleteDoc() {
        def doc = new SomeTestEntity(foo: 'bar')
        send('direct:storeDoc', doc)
        send('direct:deleteDoc', doc._id)
        store.getDocument(SomeTestEntity, doc._id)
    }

    @Test
    void testStoreDocNoDatabaseSpecified() {
        def doc = new SomeTestEntity(foo: 'bar')
        send('direct:storeDoc_nodb', doc)
        def storedDoc = store.getDocument(SomeTestEntity, doc._id)
        assertEquals('bar', storedDoc.foo)
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
}
