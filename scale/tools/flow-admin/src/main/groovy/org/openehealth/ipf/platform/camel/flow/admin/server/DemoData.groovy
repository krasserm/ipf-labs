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
package org.openehealth.ipf.platform.camel.flow.admin.server

import org.openehealth.ipf.commons.flow.FlowStoreBase
import org.springframework.beans.factory.InitializingBean
import org.openehealth.ipf.commons.message.MessageStoreBase

class DemoData implements InitializingBean {
    def FlowStoreBase flowStore
    def MessageStoreBase msgStore

    void afterPropertiesSet() {
        (1..5).each {
            flowStore.createFlow(msgStore.createMessage('id1', 'app1', 'Message Content 1'), 'app1', null)
            flowStore.createFlow(msgStore.createMessage('id2', 'app2', 'Message Content 2'), 'app2', null)
            flowStore.createFlow(msgStore.createMessage('id3', 'app3', 'Message Content 3'), 'app3', null)
        }
    }
}
