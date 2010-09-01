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
package org.openehealth.ipf.platform.camel.flow

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
import org.openehealth.ipf.commons.flow.FlowStoreBase
import org.openehealth.ipf.commons.message.MessageStoreBase
import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.store.Store
import org.openehealth.ipf.platform.camel.core.junit.DirtySpringContextJUnit4ClassRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull
import static org.junit.Assert.assertNull
import static org.openehealth.ipf.platform.camel.core.util.Exchanges.resultMessage

@RunWith(DirtySpringContextJUnit4ClassRunner)
@ContextConfiguration(locations = ['/camel-test-flow.xml', '/camel-test-flow-jpa.xml'])
class FlowJpaTest {
    @Autowired CamelContext camelContext
    @Autowired ProducerTemplate producerTemplate
    @Autowired Store store
    @Autowired FlowStoreBase flowStore
    @Autowired MessageStoreBase msgStore

    @EndpointInject(uri="mock:test")
    MockEndpoint mock

    @After
    void tearDown() {
        mock.reset()
    }

    @Test
    void testFlowWithAck() {
        def result = send('direct:flow-test-ack', 'test', [foo: 'bar'])
        def headers = resultMessage(result).headers
        def msgId = headers.msgId
        assertNull(headers.flowId)
        def flows = flowStore.getFlowsByApp('test-ack', new QueryRange()).results
        assertEquals(1, flows.size())
        def flow = flows[0]
        assertEquals(msgId, flow.msgId)
        assertEquals(true, flow.ack)
        assertEquals(false, flow.nak)
    }

    @Test
    void testFlowWithNoAck() {
        def result = send('direct:flow-test-no-ack', 'test', [foo: 'bar'])
        def headers = resultMessage(result).headers
        def msgId = headers.msgId
        assertNotNull(msgId)
        assertNull(headers.flowId)
        def flows = flowStore.getFlowsByApp('test-no-ack', new QueryRange()).results
        assertEquals(1, flows.size())
        def flow = flows[0]
        assertEquals(msgId, flow.msgId)
        assertEquals(false, flow.ack)
        assertEquals(false, flow.nak)
    }

    @Test
    void testFlowWithNak() {
        def result = send('direct:flow-test-nak', 'test', [foo: 'bar'])
        def headers = resultMessage(result).headers
        def msgId = headers.msgId
        assertNull(headers.flowId)
        def flows = flowStore.getFlowsByApp('test-nak', new QueryRange()).results
        assertEquals(1, flows.size())
        def flow = flows[0]
        assertEquals(msgId, flow.msgId)
        assertEquals(false, flow.ack)
        assertEquals(true, flow.nak)
    }

    @Test
    void testReplay() {
        def result = send('direct:test-replay', 'test', [foo: 'bar'])
        def headers = resultMessage(result).headers
        def msgId = (String)headers.msgId
        msgStore.replayMessage(msgId)
        def flows = flowStore.getFlowsByApp('test-replay', new QueryRange()).results
        assertEquals(2, flows.size())
        assertNotNull(flows.find { it.nak && !it.ack })
        assertNotNull(flows.find { it.ack && !it.nak })
    }

    @Test
    void testMulticastFlow() {
        send('direct:flow-test-multicast', 'test', [:])
        def flows = flowStore.getFlowsByApp('test-multicast', new QueryRange()).results
        assertEquals(3, flows.size())
        assertNotNull(flows.find { it.parentFlowId == null && it.ack && !it.nak })
        assertNotNull(flows.find { it.parentFlowId != null && it.ack && !it.nak })
        assertNotNull(flows.find { it.parentFlowId != null && !it.ack && it.nak })
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
