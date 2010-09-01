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
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import org.openehealth.ipf.commons.flow.FlowStore
import org.openehealth.ipf.commons.utils.json.JSONSupport
import org.openehealth.ipf.commons.store.QueryRange
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import org.openehealth.ipf.commons.store.QueryIterator

@Component
@Scope('singleton')
@Path('/applications')
@Produces('text/plain')
class Applications {
    @Resource def FlowStore flowStore
    def json = new JSONSupport()

    @GET
    def get(@QueryParam('start') String start,
            @QueryParam('limit') String limit,
            @QueryParam('pretty') boolean pretty) {
        def range = new QueryRange(
            start: start != null ? json.parse(start, QueryIterator.class) : null,
            limit: limit != null ? Integer.parseInt(limit) : null)

        def apps = flowStore.getAllApplications(range)
        json.make(apps, pretty)
    }
}
