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
import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.store.QueryResult

interface FlowStore {
    def createFlow(Message msg, String application, String parentFlowId)
    void deleteFlow(String flowId)
    def getFlow(String flowId)
    void ackFlow(Flow flow)
    void nakFlow(Flow flow)

    QueryResult getAllFlows(QueryRange range)
    QueryResult getAllApplications(QueryRange range)
    QueryResult getFlowsByApp(String app, QueryRange range)
    QueryResult getFlowsByMessage(String msgId, QueryRange range)
}
