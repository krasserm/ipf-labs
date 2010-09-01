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

import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.store.Store
import org.openehealth.ipf.commons.utils.clock.Clock
import org.openehealth.ipf.commons.utils.clock.StandardClock
import org.openehealth.ipf.commons.utils.stream.Use

abstract class MessageStoreBase implements MessageStore {
    def Store store
    def replayStrategies = [:]
    def Clock clock = new StandardClock()

    Message createMessage(String identifier, String application, Object msgContent) {
        def msg = new Message(
            creationDate: clock.now(),
            msgType: msgContent.getClass(),
            identifier: identifier,
            application: application)

        store.createDocument(msg)
        Use.use(Converter.convertToStream(msgContent)) { InputStream it ->
            store.createAttachment(msg, 'packet', 'application/octet-stream', it)
        }

        msg
    }

    List<MessageMetaData> addMessageMetaData(String msgId, Map<String, String> metaData) {
        def now = clock.now()
        metaData.collect { key, value ->
            def messageMetaData = new MessageMetaData(msgId: msgId, key: key, value: value, creationDate: now)
            store.createDocument(messageMetaData)
            messageMetaData
        }
    }

    Object getMessageContent(String msgId) {
        getMessageContent(getMessage(msgId))
    }

    Object getMessageContent(Message doc) {
        Use.use(store.getAttachment(doc._id, 'packet')) { InputStream it ->
            Converter.convertToMsg(it, doc.msgType)
        }
    }

    Message getMessage(String msgId) {
        store.getDocument(Message.class, msgId)
    }

    void deleteMessage(String msgId) {
        getMetaDataForMessage(msgId, new QueryRange()).results.each { store.deleteDocument(it) }
        store.deleteDocument(store.getDocument(Message, msgId))
    }

    void registerReplayStrategy(String identifier, Closure replayStrategy) {
        replayStrategies[identifier] = replayStrategy
    }

    void replayMessage(String msgId) {
        def msg = store.getDocument(Message.class, msgId)
        def replayStrategy = replayStrategies[msg.identifier]
        if (replayStrategy == null) {
            throw new ReplayStrategyNotRegisteredException(msg.identifier)
        }
        msg.replayCount += 1
        store.updateDocument(msg)
        replayStrategy(msg)
    }
}
