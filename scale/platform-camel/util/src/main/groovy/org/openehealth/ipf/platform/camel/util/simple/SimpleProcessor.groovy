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
package org.openehealth.ipf.platform.camel.util.simple

import org.apache.camel.Exchange
import org.apache.camel.processor.DelegateProcessor
import static org.openehealth.ipf.platform.camel.core.util.Exchanges.prepareResult
import static org.openehealth.ipf.platform.camel.core.util.Exchanges.resultMessage

class SimpleProcessor extends DelegateProcessor {
    def Closure processorLogic
    def Closure interceptorLogic

    protected void processNext(Exchange exchange) {
        if (processorLogic) {
            processorLogic(exchange)
            processWithNext(exchange)
        }
        else if (interceptorLogic) {
            interceptorLogic(exchange) { processWithNext(it) }
        }
    }

    private def processWithNext(Exchange exchange) {
        processor?.process(exchange)
        processor? resultMessage(exchange) : prepareResult(exchange)
    }
}
