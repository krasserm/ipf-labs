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

import org.apache.camel.model.ProcessorDefinition

class FlowExtension {
    def static initFlow(ProcessorDefinition self) {
        new BeginFlowDefinition(prev: self, interceptor: { it, next ->
            def parent = [flowId: it.in.headers.flowId, flow: it.in.headers.flow]
            def flow = store.createFlow(it.in.headers.msg, application, parent.flowId)
            it.in.headers.flowId = flow._id
            it.in.headers.flow = flow
            next(it).headers.putAll(parent)
        })
    }

    def static ackFlow(ProcessorDefinition self) {
        new FlowDefinition(prev: self, processor: {
            store.ackFlow(it.in.headers.flow)
        })
    }

    def static nakFlow(ProcessorDefinition self) {
        new FlowDefinition(prev: self, processor: {
            store.nakFlow(it.in.headers.flow)
        })
    }
}
