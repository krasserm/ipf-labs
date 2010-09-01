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
package org.openehealth.ipf.commons.message.resources

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openehealth.ipf.commons.utils.json.JSONSupport
import org.openehealth.ipf.commons.message.Message
import org.openehealth.ipf.commons.message.MessageStore
import static org.junit.Assert.*

import org.openehealth.ipf.commons.utils.http.HttpHelper

class ReplayQueueTest {
    HttpHelper http
    Map msgStore
    Message msg1, msg2

    @Before
    void setUp() {
        msg1 = new Message(_id: '1', application: 'app1', creationDate: 1)
        msg2 = new Message(_id: '2', application: 'app2', creationDate: 2)
        http = new HttpHelper()
        msgStore = [:]
        http.start('http://localhost:8123/rest', [new ReplayQueue(messageStore: msgStore as MessageStore)])
    }

    @After
    void tearDown() {
        http.stop()
    }

    @Test
    void postSingleMessageForReplayViaText() {
        List replayed = []
        msgStore.replayMessage = { String msgId -> replayed.add(msgId) }
        http.post('replayQueue', '1', 'plain/text')
        assertEquals(['1'], replayed)
    }

    @Test
    void postMultipleMessagesForReplayViaJSON() {
        List replayed = []
        msgStore.replayMessage = { String msgId -> replayed.add(msgId) }
        def json = new JSONSupport().make(['1', '2'])
        http.post('replayQueue', json, 'application/json')
        assertEquals(['1', '2'], replayed)
    }
}
