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

import org.apache.camel.CamelContext
import org.apache.camel.Exchange
import org.apache.camel.ExchangePattern
import org.apache.camel.Message
import org.apache.camel.impl.DefaultExchange
import static org.openehealth.ipf.commons.message.Converter.*

class ExchangeConversion {
    def CamelContext camelContext

    InputStream convertToStream(Exchange msg) {
        join(convertToStream(msg.properties),
            convertToStream(msg.in),
            convertToStream(msg.hasOut() ? msg.out : (Message)null),
            convertToStream(msg.exception),
            convertToStream(msg.exchangeId),
            convertToStream(msg.pattern))
    }

    Exchange convertToMsg(InputStream inputStream, Exchange dummy) {
        def exchange = new DefaultExchange(camelContext)
        exchange.properties = convertToMsg(inputStream, Map.class)
        exchange.in = convertToMsg(inputStream, Message.class)
        exchange.out = convertToMsg(inputStream, Message.class)
        exchange.exception = convertToMsg(inputStream, Exception.class)
        exchange.exchangeId = convertToMsg(inputStream, String.class)
        exchange.pattern = convertToMsg(inputStream, ExchangePattern.class)

        exchange
    }
}
