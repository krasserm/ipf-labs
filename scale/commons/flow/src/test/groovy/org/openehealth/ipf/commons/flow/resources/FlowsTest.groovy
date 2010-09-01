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
package org.openehealth.ipf.commons.flow.resources

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openehealth.ipf.commons.flow.Flow
import org.openehealth.ipf.commons.flow.FlowStore
import org.openehealth.ipf.commons.store.QueryRange
import static org.junit.Assert.assertEquals

import org.openehealth.ipf.commons.utils.http.HttpHelper
import org.openehealth.ipf.commons.utils.json.JSONSupport
import org.openehealth.ipf.commons.store.QueryResult
import org.openehealth.ipf.commons.store.QueryIterator

class FlowsTest {
    Map flowStore
    HttpHelper http
    Flow flow1, flow2
    JSONSupport json = new JSONSupport()

    @Before
    void setUp() {
        http = new HttpHelper()

        flow1 = new Flow(application: 'app1', ack: true, msgId: '1', parentFlowId: '6', creationDate: 1)
        flow2 = new Flow(application: 'app2', nak: true, msgId: '2', parentFlowId: '5', creationDate: 2)
        flowStore = [:]

        http.start('http://localhost:8123/rest', [new Flows(flowStore: flowStore as FlowStore)])
    }

    @After
    void tearDown() {
        http.stop()
    }

    @Test
    void getAll() {
        def result = new QueryResult(results: [flow1, flow2], iterator: new QueryIterator(value: 12))
        flowStore.getAllFlows = { QueryRange range ->
            assertEquals(new QueryRange(), range)
            result
        }
        assertEquals(result, query('flows', Flow))
    }
    
    @Test
    void getByApp() {
        def result = new QueryResult(results: [flow1], iterator: new QueryIterator(value: 12))
        flowStore.getFlowsByApp = { String app, QueryRange range ->
            assertEquals('app1', app)
            assertEquals(new QueryRange(), range)
            result
        }
        assertEquals(result, query('flows?application=app1', Flow))
    }

    @Test
    void getByMsg() {
        def result = new QueryResult(results: [flow2], iterator: new QueryIterator(value: 12))
        flowStore.getFlowsByMessage = { String msgId, QueryRange range ->
            assertEquals('2', msgId)
            assertEquals(new QueryRange(), range)
            result
        }
        assertEquals(result, query('flows?message=2', Flow))
    }

    @Test
    void getByRange() {
        def result = new QueryResult(results: [flow1], iterator: new QueryIterator(value: 12))
        flowStore.getAllFlows = { QueryRange range ->
            assertEquals(new QueryRange(start: new QueryIterator(value: 1234), limit: 1), range)
            result
        }
        assertEquals(result, query('flows?start=%7Bvalue:1234%7D&limit=1', Flow))
    }

    @Test
    void getFlow() {
        flowStore.getFlow = { String flowId ->
            assertEquals('1', flowId)
            flow1
        }
        assertEquals(flow1, http.get(Flow, 'flows/1'))
    }

    @Test
    void deleteFlow() {
        def called = false
        flowStore.deleteFlow = { String flowId ->
            assertEquals('2', flowId)
            called = true
        }
        http.delete('flows/2')
        assertEquals(true, called)
    }

    private QueryResult query(String uri, Class<?> elementType) {
        def obj = json.parse(http.get(uri))
        new QueryResult(
                results: obj.getArray('results').toList(elementType),
                iterator: obj.toJava('iterator', QueryIterator.class))
    }
}
