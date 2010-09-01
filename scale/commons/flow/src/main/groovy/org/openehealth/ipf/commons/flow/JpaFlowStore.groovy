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

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.store.QueryResult
import static org.openehealth.ipf.commons.store.QueryUtils.addRange
import static org.openehealth.ipf.commons.store.QueryUtils.createQueryResult

class JpaFlowStore extends FlowStoreBase {
    @PersistenceContext
    def EntityManager em

    QueryResult getAllFlows(QueryRange range) {
        def query = em.createNamedQuery('flow/getAllFlows')
        addRange(range, query)
        createQueryResult(query.resultList, range)
    }

    QueryResult getAllApplications(QueryRange range) {
        def query = em.createNamedQuery('flow/getAllApplications')
        addRange(range, query)
        createQueryResult(query.resultList, range)
    }

    QueryResult getFlowsByApp(String app, QueryRange range) {
        def query = em.createNamedQuery('flow/getFlowsByApp')
        addRange(range, query)
        query.setParameter('key', app)
        createQueryResult(query.resultList, range)
    }

    QueryResult getFlowsByMessage(String msgId, QueryRange range) {
        def query = em.createNamedQuery('flow/getFlowsByMessage')
        addRange(range, query)
        query.setParameter('key', msgId)
        createQueryResult(query.resultList, range)
    }
}
