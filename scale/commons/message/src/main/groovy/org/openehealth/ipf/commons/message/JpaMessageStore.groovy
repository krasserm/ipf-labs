package org.openehealth.ipf.commons.message

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.store.QueryResult
import static org.openehealth.ipf.commons.store.QueryUtils.addRange
import static org.openehealth.ipf.commons.store.QueryUtils.createQueryResult

class JpaMessageStore extends MessageStoreBase {
    @PersistenceContext
    def EntityManager em

    QueryResult getMetaDataForMessage(String msgId, QueryRange range) {
        def query = em.createNamedQuery('msgMetaData/getMetaDataByMsgId')
        addRange(range, query)
        query.setParameter('key', msgId)
        createQueryResult(query.resultList, range)
    }

    QueryResult getMessagesByMetaData(String key, String value, QueryRange range) {
        def query = em.createNamedQuery('lucene/msgMetaDataByValue')
        addRange(range, query)
        query.setParameter('key', key)
        query.setParameter('value', value.toUpperCase())
        createQueryResult(query.resultList*.msgId, range)
    }

    QueryResult getMessagesByApplication(String application, QueryRange range) {
        def query = em.createNamedQuery('msg/getMsgByApp')
        addRange(range, query)
        query.setParameter('key', application)
        createQueryResult(query.resultList, range)
    }

    QueryResult getAllMessages(QueryRange range) {
        def query = em.createNamedQuery('msg/getAllMessages')
        addRange(range, query)
        createQueryResult(query.resultList, range)
    }
}
