package org.openehealth.ipf.commons.message

import org.openehealth.ipf.commons.utils.couch.impl.LuceneQuery
import org.openehealth.ipf.commons.utils.couch.impl.ViewQuery
import org.openehealth.ipf.commons.store.QueryRange
import org.openehealth.ipf.commons.store.QueryResult
import org.openehealth.ipf.commons.utils.couch.*
import org.openehealth.ipf.commons.store.QueryIterator
import static org.openehealth.ipf.commons.store.QueryUtils.*

class CouchMessageStore extends MessageStoreBase {
    def Database database

    QueryResult getMetaDataForMessage(String msgId, QueryRange range) {
        def query = new ViewQuery(new View(database, 'msgMetaData', 'getMetaDataByMsgId'))
        query = range?.limit ? query.limit(range.limit + 1) : query
        def iterator = range?.start?.value
        query = iterator ?
            query.startKey([msgId, iterator.key]).startKeyDocId(iterator.docId) :
            query.startKey([msgId, null])
        query = query.endKey([msgId, new Object()])
        def results = query.query().rows.collect {ViewResultRow it -> it.getValue(MessageMetaData) }
        createQueryResult(results, range) { it.key }
    }

    QueryResult getMessagesByMetaData(String key, String value, QueryRange range) {
        def query = new LuceneQuery(new Lucene(database, 'lucene', 'msgMetaDataByValue'))
        query = query.q("key:$key AND value:$value")
        query = range?.limit ? query.limit(range.limit + 1) : query
        def iterator = range?.start?.value
        query = iterator ? query.skip(iterator) : query
        query = query.sort('order').includeDocs()
        def results = query.query().rows.collect { LuceneResultRow it -> it.getDoc(MessageMetaData) }

        def realSize = results.size() - 1
        if (realSize == range?.limit) {
            iterator = iterator != null ? iterator + realSize : realSize
            return new QueryResult(results: results.subList(0, realSize)*.msgId, iterator: new QueryIterator(value: iterator))
        }
        new QueryResult(results: results*.msgId)
    }

    QueryResult getMessagesByApplication(String application, QueryRange range) {
        def query = new ViewQuery(new View(database, 'msg', 'getMsgByApp'))
        query = range?.limit ? query.limit(range.limit + 1) : query
        def iterator = range?.start?.value
        query = iterator ?
            query.startKey([application, iterator.key]).startKeyDocId(iterator.docId) :
            query.startKey([application, null])
        query = query.endKey([application, new Object()])
        def results = query.query().rows.collect { ViewResultRow it -> it.getValue(Message) }
        createQueryResult(results, range) { it.creationDate }
    }

    QueryResult getAllMessages(QueryRange range) {
        def query = new ViewQuery(new View(database, 'msg', 'getAllMessages'))
        query = range?.limit ? query.limit(range.limit + 1) : query
        def iterator = range?.start?.value
        query = iterator ? query.startKeyDocId(iterator.docId).startKey(iterator.key) : query
        def results = query.query().rows.collect { ViewResultRow it -> it.getValue(Message) }
        createQueryResult(results, range) { it.creationDate }
    }
}
