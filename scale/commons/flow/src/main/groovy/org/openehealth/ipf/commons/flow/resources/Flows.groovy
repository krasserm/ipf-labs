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
package org.openehealth.ipf.commons.flow.resources

import javax.annotation.Resource
import org.openehealth.ipf.commons.flow.FlowStore
import org.openehealth.ipf.commons.utils.json.JSONSupport
import org.openehealth.ipf.commons.store.QueryRange
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import javax.ws.rs.*
import org.openehealth.ipf.commons.store.QueryIterator

@Component
@Scope('singleton')
@Path('/flows')
@Produces('text/plain')
class Flows {
    @Resource def FlowStore flowStore
    def json = new JSONSupport()

    @GET
    def get(@QueryParam('application') String application,
            @QueryParam('message') String msgId,
            @QueryParam('start') String start,
            @QueryParam('limit') String limit,
            @QueryParam('pretty') boolean pretty) {

        def range = new QueryRange(
            start: start != null ? json.parse(start, QueryIterator.class) : null,
            limit: limit != null ? Integer.parseInt(limit) : null)

        def flows = msgId != null ? flowStore.getFlowsByMessage(msgId, range) :
                    application != null ? flowStore.getFlowsByApp(application, range) :
                    flowStore.getAllFlows(range)

        json.make(flows, pretty)
    }

    @GET @Path('{flow}')
    def get(@PathParam('flow') String flowId, @QueryParam('pretty') boolean pretty) {
        json.make(flowStore.getFlow(flowId), pretty)
    }
    
    @DELETE @Path('{flow}')
    void delete(@PathParam('flow') String flowId) {
        flowStore.deleteFlow(flowId)
    }
}
