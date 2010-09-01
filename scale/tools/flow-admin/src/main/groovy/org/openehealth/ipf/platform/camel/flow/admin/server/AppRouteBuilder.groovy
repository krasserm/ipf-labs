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

import org.apache.camel.ExchangePattern
import org.apache.camel.spring.SpringRouteBuilder
import org.apache.commons.lang.math.RandomUtils
import org.openehealth.ipf.platform.camel.core.extend.CoreExtension
import org.openehealth.ipf.platform.camel.flow.FlowExtension
import org.openehealth.ipf.platform.camel.message.MessageExtension

class AppRouteBuilder extends SpringRouteBuilder {
    void configure() {
        int msgNumber = 0

        use(CoreExtension) {
            use(MessageExtension) {
                use (FlowExtension) {
                    errorHandler(noErrorHandler())

                    from('jetty:http://localhost:8081/app?matchOnUriPrefix=true')
                        .to(ExchangePattern.InOnly, 'seda:app')
                        .transform { 'accepted' }

                    from('seda:app')
                        .convertBodyTo(String)
                        .storeMsg().identifier('app-replay').application('TestApp')
                        .storeMetaData {
                            ['msgNumber': ++msgNumber]
                        }
                        .initFlow().application('TestApp')
                        .process {
                            println 'A message has arrived: ' + it.in.getBody(String)

                            if (RandomUtils.nextFloat() > 0.2) {
                                println 'Intentional Message Delivery Failure'
                                throw new RuntimeException('Intentional Message Delivery Failure')
                            }
                        }
                        .ackFlow()
                }
            }
        }
    }
}
