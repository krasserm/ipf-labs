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

import org.openehealth.ipf.commons.message.Message
import org.openehealth.ipf.commons.message.MessageStoreBase
import org.openehealth.ipf.commons.store.Store
import org.openehealth.ipf.commons.utils.clock.Clock
import org.openehealth.ipf.commons.utils.clock.StandardClock

abstract class FlowStoreBase implements FlowStore {
    def Store store
    def MessageStoreBase msgStore
    def Clock clock = new StandardClock()

    def createFlow(Message msg, String application, String parentFlowId) {
        def flow = new Flow(
            application: application,
            msgId: msg._id,
            parentFlowId: parentFlowId,
            creationDate: clock.now())

        store.createDocument(flow)
        flow
    }

    void deleteFlow(String flowId) {
        store.deleteDocument(store.getDocument(Flow.class, flowId))
    }

    def getFlow(String flowId) {
        store.getDocument(Flow.class, flowId)        
    }

    void ackFlow(Flow flow) {
        flow.ack = true
        store.updateDocument(flow)
    }

    void nakFlow(Flow flow) {
        flow.nak = true
        store.updateDocument(flow)
    }
}

