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

import org.apache.camel.Exchange
import org.apache.camel.model.ProcessorDefinition

class MessageExtension {
    def static storeMsg(ProcessorDefinition self) {
        new StoreMessageDefinition(prev: self, processor: {
            def msg = store.createMessage(identifier?:it.fromEndpoint.endpointUri, application, it)
            it.in.headers.msg = msg
            it.in.headers.msgId = msg._id
        })
    }

    def static fetchMsg(ProcessorDefinition self) {
        new MessageDefinition(prev: self, processor: {
            def msgId = it.in.headers.msgId
            fieldCopy(store.getMessageContent(msgId), it)
            it.in.headers.msgId = msgId
        })
    }

    def static deleteMsg(ProcessorDefinition self) {
        new MessageDefinition(prev: self, processor: {
            store.deleteMessage(it.in.headers.msgId)
            it.in.headers.msgId = null
        })
    }

    def static storeMetaData(ProcessorDefinition self, Closure expression) {
        new MessageDefinition(prev: self, processor: {
            store.addMessageMetaData(it.in.headers.msgId, expression(it))
        })
    }

    private static void fieldCopy(Exchange from, Exchange to) {
        to.properties = from.properties
        to.in.headers = from.in.headers
        to.in.body = from.in.body
        to.out.headers = from.out.headers
        to.out.body = from.out.body
        to.exception = from.exception
        to.pattern = from.pattern
        to.exchangeId = from.exchangeId
    }
}