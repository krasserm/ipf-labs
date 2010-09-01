package org.openehealth.ipf.commons.store

import javax.persistence.Query

class QueryUtils {
    static QueryResult createQueryResult(List results, QueryRange range) {
        def realSize = results.size() - 1
        if (realSize != range?.limit) {
            return new QueryResult(results: results)
        }

        def iterator = range?.start?.value ? range?.start?.value + realSize : realSize
        new QueryResult(results: new ArrayList(results).subList(0, realSize), iterator: new QueryIterator(value: iterator))
    }

    static QueryResult createQueryResult(List results, QueryRange range, Closure keyGetter) {
        if (results.size() - 1 == range?.limit) {
            def last = results.pop()
            def iterator = new QueryIterator(value: [key: keyGetter(last), docId: last._id])
            return new QueryResult(results: results, iterator: iterator)
        }
        new QueryResult(results: results)
    }

    static def addRange(QueryRange range, Query query) {
        if (range?.start?.value) {
            query.firstResult = range.start.value
        }
        if (range?.limit) {
            query.maxResults = range.limit + 1
        }
    }
}
