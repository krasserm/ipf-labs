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
package org.openehealth.ipf.commons.message

import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.store.QueryResult

interface MessageStore {
    Message createMessage(String identifier, String application, Object msgContent)
    List<MessageMetaData> addMessageMetaData(String msgId, Map<String, String> metaData)
    Object getMessageContent(String msgId)
    Object getMessageContent(Message doc)
    Message getMessage(String msgId)
    void deleteMessage(String msgId)
    void replayMessage(String msgId)

    QueryResult getMetaDataForMessage(String msgId, QueryRange range)
    QueryResult getMessagesByMetaData(String key, String value, QueryRange range)
    QueryResult getMessagesByApplication(String application, QueryRange range)
    QueryResult getAllMessages(QueryRange range)
}
