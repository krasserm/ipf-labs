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
package org.openehealth.ipf.commons.message.resources

import javax.annotation.Resource
import org.openehealth.ipf.commons.utils.json.JSONSupport
import org.openehealth.ipf.commons.message.MessageStore
import org.openehealth.ipf.commons.store.QueryRange
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import javax.ws.rs.*
import org.openehealth.ipf.commons.store.QueryIterator

@Component
@Scope('singleton')
@Path('/messages')
@Produces('text/plain')
class Messages {
    @Resource def MessageStore messageStore
    def final json = new JSONSupport()

    @GET
    def get(@QueryParam('application') String application,
            @QueryParam('start') String start,
            @QueryParam('limit') String limit,
            @QueryParam('pretty') boolean pretty) {

        def range = new QueryRange(
            start: start != null ? json.parse(start, QueryIterator.class) : null,
            limit: limit != null ? Integer.parseInt(limit) : null)

        def msgs = application != null ?
                    messageStore.getMessagesByApplication(application, range) :
                    messageStore.getAllMessages(range)

        json.make(msgs, pretty)
    }

    @GET @Path('{msg}')
    def get(@PathParam('msg') String msgId, @QueryParam('pretty') boolean pretty) {
        json.make(messageStore.getMessage(msgId), pretty)
    }

    @GET @Path('{msg}/metaData')
    def getMetaData(@PathParam('msg') String msgId,
                    @QueryParam('start') String start,
                    @QueryParam('limit') String limit,
                    @QueryParam('pretty') boolean pretty) {

        def range = new QueryRange(
            start: start != null ? json.parse(start, QueryIterator.class) : null,
            limit: limit != null ? Integer.parseInt(limit) : null)

        json.make(messageStore.getMetaDataForMessage(msgId, range), pretty)
    }

    @DELETE @Path('{msg}')
    void delete(@PathParam('msg') String msgId) {
        messageStore.deleteMessage(msgId)
    }
}
