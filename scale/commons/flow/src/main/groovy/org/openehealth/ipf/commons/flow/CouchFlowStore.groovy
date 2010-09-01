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

import org.openehealth.ipf.commons.utils.couch.Database
import org.openehealth.ipf.commons.utils.couch.View
import org.openehealth.ipf.commons.utils.couch.ViewResultRow
import org.openehealth.ipf.commons.utils.couch.impl.ViewQuery
import org.openehealth.ipf.commons.store.QueryIterator
import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.store.QueryResult
import static org.openehealth.ipf.commons.store.QueryUtils.createQueryResult

class CouchFlowStore extends FlowStoreBase {
    def Database database

    QueryResult getAllFlows(QueryRange range) {
        def query = new ViewQuery(new View(database, 'flow', 'getAllFlows'))
        query = range?.limit ? query.limit(range.limit + 1) : query
        def iterator = range?.start?.value
        query = iterator ? query.startKeyDocId(iterator.docId).startKey(iterator.key) : query
        def results = query.query().rows.collect { ViewResultRow it -> it.getValue(Flow) }
        createQueryResult(results, range) { it.creationDate }
    }

    QueryResult getAllApplications(QueryRange range) {
        def query = new ViewQuery(new View(database, 'flow', 'getAllApplications'))
        query = range?.limit ? query.limit(range.limit + 1) : query
        def iterator = range?.start?.value
        query = iterator ? query.startKey(iterator) : query
        def results = query.group().query().rows.collect { ViewResultRow it -> it.getKey(String) }
        if (results.size() - 1 == range?.limit) {
            def last = results.pop() 
            return new QueryResult(results: results, iterator: new QueryIterator(value: last))
        }
        new QueryResult(results: results)
    }

    QueryResult getFlowsByApp(String app, QueryRange range) {
        def query = new ViewQuery(new View(database, 'flow', 'getFlowsByApp'))
        query = range?.limit ? query.limit(range.limit + 1) : query
        def iterator = range?.start?.value
        query = iterator ?
            query.startKey([app, iterator.key]).startKeyDocId(iterator.docId) :
            query.startKey([app, null])
        query = query.endKey([app, new Object()])
        def results = query.query().rows.collect { ViewResultRow it -> it.getValue(Flow) }
        createQueryResult(results, range) { it.creationDate }
    }

    QueryResult getFlowsByMessage(String msgId, QueryRange range) {
        def query = new ViewQuery(new View(database, 'flow', 'getFlowsByMessage'))
        query = range?.limit ? query.limit(range.limit + 1) : query
        def iterator = range?.start?.value
        query = iterator ?
            query.startKey([msgId, iterator.key]).startKeyDocId(iterator.docId) :
            query.startKey([msgId, null])
        query = query.endKey([msgId, new Object()])
        def results = query.query().rows.collect { ViewResultRow it -> it.getValue(Flow) }
        createQueryResult(results, range) { it.creationDate }
    }
}
