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
package org.openehealth.ipf.commons.message

import javax.annotation.Resource
import org.openehealth.ipf.commons.utils.couch.WebRequestFailedException
import org.junit.After

import org.junit.Before

import org.junit.Test
import org.junit.runner.RunWith
import org.openehealth.ipf.commons.store.DocumentNotFoundException
import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.utils.clock.MockClock
import org.openehealth.ipf.platform.camel.core.junit.DirtySpringContextJUnit4ClassRunner
import org.springframework.test.context.ContextConfiguration
import static org.junit.Assert.assertEquals

@RunWith(DirtySpringContextJUnit4ClassRunner)
@ContextConfiguration(locations = ['/commons-test-message-jpa.xml'])
class MessageStoreImplJpaTest {
    @Resource MessageStoreBase msgStore

    MockClock clock
    Message msg1, msg2, msg3, msg4
    List<MessageMetaData> metaData

    @Before
    void setUp() {
        clock = new MockClock()
        msgStore.clock = clock

        msg1 = clock.doAt(500) { msgStore.createMessage('id1', 'app1', 'msg1') }
        msg2 = clock.doAt(400) { msgStore.createMessage('id2', 'app1', 'msg2') }
        msg3 = clock.doAt(300) { msgStore.createMessage('id3', 'app2', 'msg3') }
        msg4 = clock.doAt(200) { msgStore.createMessage('id4', 'app1', 'msg4') }

        metaData = clock.doAt(500) { msgStore.addMessageMetaData(msg1._id, [testkey2: 'testvalue2', testkey1: 'testvalue1']) }
        metaData += clock.doAt(400) { msgStore.addMessageMetaData(msg1._id, [testkey3: 'testvalue3', testkey4: 'testvalue4']) }
        metaData += clock.doAt(51) { msgStore.addMessageMetaData(msg2._id, [testkey3: 'testvalue5', testkey1: 'testvalue1']) }
        metaData += clock.doAt(10) { msgStore.addMessageMetaData(msg4._id, [testkey2: 'testvalue5', testkey1: 'testvalue1']) }
    }

    @After
    void tearDown() {
        msgStore.getAllMessages(new QueryRange()).results.each {
            msgStore.deleteMessage(it._id)
        }
    }

    @Test
    void getMessageContentById() {
        assertEquals('msg1', msgStore.getMessageContent(msg1._id))
    }
    
    @Test
    void getMessageContentByMessage() {
        assertEquals('msg1', msgStore.getMessageContent(msg1))
    }

    @Test
    void getMessage() {
        assertEquals(msg1, msgStore.getMessage(msg1._id))
    }

    @Test
    void getMessagesByApplication() {
        checkQuery([msg4, msg2, msg1]) { msgStore.getMessagesByApplication('app1', it) }
        checkQuery([]) { msgStore.getMessagesByApplication('bla', it) }
    }

    @Test
    void getMessagesByMetaData() {
        untilNotEmpty { msgStore.getMessagesByMetaData('testkey1', 'testvalue1', new QueryRange()).results }
        checkQuery([msg4._id, msg2._id, msg1._id]) { msgStore.getMessagesByMetaData('testkey1', 'testvalue1', it) }
        checkQuery([]) { msgStore.getMessagesByMetaData('testkey1', 'schnuff', it) }
    }

    @Test
    void getAllMessages() {
        checkQuery([msg4, msg3, msg2, msg1]) { msgStore.getAllMessages(it) }
    }

    @Test(expected = DocumentNotFoundException)
    void deleteMessage() {
        msgStore.deleteMessage(msg1._id)
        msgStore.getMessage(msg1._id)
    }

    @Test
    void replayMessage() {
        def replayed = false
        msgStore.registerReplayStrategy('id1') {
            replayed = true
        }
        
        msgStore.replayMessage(msg1._id)
        def msg = msgStore.getMessage(msg1._id)
        assertEquals(1, msg.replayCount)
        assertEquals(true, replayed)
    }

    @Test(expected = ReplayStrategyNotRegisteredException)
    void replayMessageNoReplayStrategy() {
        try {
            msgStore.replayMessage(msg2._id)
        }
        finally {
            assertEquals(0, msgStore.getMessage(msg2._id).replayCount)
        }
    }

    @Test
    void getMetaDataForMessage() {
        checkQuery([metaData[1], metaData[0], metaData[2], metaData[3]]) { msgStore.getMetaDataForMessage(msg1._id, it) }
        checkQuery([]) { msgStore.getMetaDataForMessage(msg3._id, it) }
    }

    def untilNotEmpty(Closure closure) {
        for (idx in 1..60) {
            try {
                def result = closure()
                if (!result.isEmpty()) {
                    return result
                }
            }
            catch (WebRequestFailedException ignored) {}
            Thread.sleep(1000)
        }

        throw new AssertionError('Could not complete request')
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
