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
package org.openehealth.ipf.commons.flow

import javax.annotation.Resource
import org.junit.After

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.openehealth.ipf.commons.message.Message
import org.openehealth.ipf.commons.message.MessageStoreBase
import org.openehealth.ipf.commons.store.DocumentNotFoundException
import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.utils.clock.MockClock
import org.openehealth.ipf.platform.camel.core.junit.DirtySpringContextJUnit4ClassRunner
import org.springframework.test.context.ContextConfiguration
import static org.junit.Assert.assertEquals

@RunWith(DirtySpringContextJUnit4ClassRunner)
@ContextConfiguration(locations = ['/commons-test-flow-jpa.xml'])
class FlowStoreImplJpaTest {
    @Resource FlowStoreBase flowStore
    @Resource MessageStoreBase msgStore

    Message msg1, msg2, msg3, msg4, msg5, msg6
    Flow flow1, flow2, flow3, flow4

    MockClock clock

    @Before
    void setUp() {
        clock = new MockClock()
        flowStore.clock = clock
        msgStore.clock = clock

        msg1 = clock.doAt(500) { msgStore.createMessage('id1', 'app1', 'msg1') }
        msg2 = clock.doAt(400) { msgStore.createMessage('id2', 'app1', 'msg2') }
        msg3 = clock.doAt(300) { msgStore.createMessage('id3', 'app2', 'msg3') }
        msg4 = clock.doAt(200) { msgStore.createMessage('id4', 'app2', 'msg4') }
        msg5 = clock.doAt(100) { msgStore.createMessage('id5', 'app2', 'msg5') }
        msg6 = clock.doAt(100) { msgStore.createMessage('id6', 'app3', 'msg6') }

        flow1 = clock.doAt(400) { flowStore.createFlow(msg1, 'app1', null) }
        flow2 = clock.doAt(300) { flowStore.createFlow(msg2, 'app1', null) }
        flow3 = clock.doAt(200) { flowStore.createFlow(msg3, 'app2', null) }
        flow4 = clock.doAt(100) { flowStore.createFlow(msg3, 'app2', null) }
    }

    @After
    void tearDown() {
        flowStore.getAllFlows(new QueryRange()).results.each {
            flowStore.deleteFlow(it._id)
        }

        msgStore.getAllMessages(new QueryRange()).results.each {
            msgStore.deleteMessage(it._id)
        }
    }

    @Test
    void getFlow() {
        assertEquals(flow1, flowStore.getFlow(flow1._id))
    }

    @Test(expected=DocumentNotFoundException)
    void deleteFlow() {
        def id = flow1._id
        flowStore.deleteFlow(id)
        flowStore.getFlow(id)
    }

    @Test
    void ack() {
        flowStore.ackFlow(flow1)
        assertEquals(true, flow1.ack)
        assertEquals(flow1, flowStore.getFlow(flow1._id))
    }

    @Test
    void nak() {
        flowStore.nakFlow(flow1)
        assertEquals(true, flow1.nak)
        assertEquals(flow1, flowStore.getFlow(flow1._id))
    }

    @Test
    void getAllFlows() {
        checkQuery([flow4, flow3, flow2, flow1]) { flowStore.getAllFlows(it) }
    }

    @Test
    void getAllApplications() {
        clock.doAt(0) { flowStore.createFlow(msg3, 'app3', null) }
        checkQuery(['app1', 'app2', 'app3']) { flowStore.getAllApplications(it) }
    }

    @Test
    void getFlowsByApp() {
        def flow5 = clock.doAt(200) { flowStore.createFlow(msg4, 'app1', null) }
        checkQuery([flow5, flow2, flow1]) { flowStore.getFlowsByApp('app1', it) }
        checkQuery([]) { flowStore.getFlowsByApp('bbb', it) }
    }

    @Test
    void getFlowsByMessage() {
        def flow5 = clock.doAt(0) { flowStore.createFlow(msg3, 'app3', null) }
        checkQuery([flow5, flow4, flow3]) { flowStore.getFlowsByMessage(msg3._id, it) }
        checkQuery([]) { flowStore.getFlowsByMessage('schnuff', it) }
    }

    private void checkQuery(List expected, Closure queryCall) {
        iterate(expected, null, queryCall)
        for (limit in (1..expected.size() + 1)) {
            iterate(expected, limit, queryCall)
        }
    }

    private void iterate(List expected, Integer limit, Closure queryCall) {
        def range = new QueryRange(limit: limit)
        def actual = []
        def done = false
        def iterations = 0
        while (!done) {
            def result = queryCall(range)
            actual += result.results
            range.start = result.iterator
            done = result.iterator == null
            ++iterations
        }
        def size = expected.size()
        def expectedIterations = limit && limit <= size ? ((int)((size - 1)/ limit) + 1) : 1
        def resolved = new ArrayList(actual)     // Resolves lazy loading
        assertEquals('Incorrect result list for limit: ' + limit, expected, resolved)
        assertEquals('Incorrect number of iterations for limit: ' + limit, expectedIterations, iterations)
    }
}
