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

package org.openehealth.ipf.platform.camel.store

import org.apache.camel.model.ProcessorDefinition

class StoreExtension {
    def static store(ProcessorDefinition self) {
        new StoreDefinition(prev: self, processor: {
            store.createOrUpdateDocument(it.in.body)
        })
    }

    def static fetch(ProcessorDefinition self) {
        new FetchDefinition(prev: self, processor: {
            it.in.body = store.getDocument(type, idExpression.call(it))
        })
    }

    def static delete(ProcessorDefinition self) {
        new FetchDefinition(prev: self, processor: {
            store.deleteDocument(store.getDocument(type, idExpression.call(it)))
        })
    }
}
