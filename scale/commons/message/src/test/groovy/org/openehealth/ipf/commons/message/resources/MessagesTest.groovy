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
import org.openehealth.ipf.commons.message.Message
import org.openehealth.ipf.commons.message.MessageMetaData
import org.openehealth.ipf.commons.message.MessageStore
import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.store.QueryResult
import org.openehealth.ipf.commons.utils.http.HttpHelper
import org.openehealth.ipf.commons.utils.json.JSONSupport
import static org.junit.Assert.assertEquals
import org.openehealth.ipf.commons.store.QueryIterator

class MessagesTest {
    HttpHelper http
    Map msgStore
    Message msg1, msg2
    MessageMetaData meta1, meta2
    JSONSupport json = new JSONSupport()

    @Before
    void setUp() {
        msg1 = new Message(application: 'app1', creationDate: 1)
        msg2 = new Message(application: 'app2', creationDate: 2)
        meta1 = new MessageMetaData(key: 'key1', value: 'value1', creationDate: 1)
        meta2 = new MessageMetaData(key: 'key2', value: 'value2', creationDate: 2)
        http = new HttpHelper()
        msgStore = [:]
        http.start('http://localhost:8123/rest', [new Messages(messageStore: msgStore as MessageStore)])
    }

    @After
    void tearDown() {
        http.stop()
    }

    @Test
    void getByApplication() {
        def result = new QueryResult(results: [msg1], iterator: new QueryIterator(value: 12))
        msgStore.getMessagesByApplication = {application, range ->
            assertEquals('app1', application)
            assertEquals(new QueryRange(), range)
            result
        }
        assertEquals(result, query('messages?application=app1', Message))
    }

    @Test
    void getAll() {
        def result = new QueryResult(results: [msg1, msg2], iterator: new QueryIterator(value: 12))
        msgStore.getAllMessages = { QueryRange range ->
            assertEquals(new QueryRange(), range)
            result
        }
        assertEquals(result, query('messages', Message))
    }

    @Test
    void getAllRanged() {
        def result = new QueryResult(results: [msg2], iterator: new QueryIterator(value: 12))
        msgStore.getAllMessages = { QueryRange range ->
            assertEquals(new QueryRange(start: new QueryIterator(value: 123), limit: 2), range)
            result
        }
        assertEquals(result, query('messages?start=%7Bvalue:123%7D&limit=2', Message))
    }

    @Test
    void getMessage() {
        msgStore.getMessage = { String msgId ->
            assertEquals('1', msgId)
            msg1
        }
        assertEquals(msg1, http.get(Message, 'messages/1'))
    }

    @Test
    void deleteMessage() {
        def called = false
        msgStore.deleteMessage = { String msgId ->
            assertEquals('1', msgId)
            called = true
        }
        http.delete('messages/1')
        assertEquals(true, called)
    }

    @Test
    void getMetaData() {
        def result = new QueryResult(results: [meta1, meta2], iterator: new QueryIterator(value: 12))
        msgStore.getMetaDataForMessage = { String msgId, QueryRange range ->
            assertEquals('1', msgId)
            assertEquals(new QueryRange(), range)
            result
        }
        assertEquals(result, query('messages/1/metaData', MessageMetaData))
    }

    @Test
    void getMetaDataRanged() {
        def result = new QueryResult(results: [meta1, meta2], iterator: new QueryIterator(value: 12))
        msgStore.getMetaDataForMessage = { String msgId, QueryRange range ->
            assertEquals(new QueryRange(start: new QueryIterator(value: 123), limit: 2), range)
            assertEquals('1', msgId)
            result
        }
        assertEquals(result, query('messages/1/metaData?start=%7Bvalue:123%7D&limit=2', MessageMetaData))
    }

    private QueryResult query(String uri, Class<?> elementType) {
        def obj = json.parse(http.get(uri))
        new QueryResult(
                results: obj.getArray('results').toList(elementType), 
                iterator: obj.toJava('iterator', QueryIterator.class))
    }
}
