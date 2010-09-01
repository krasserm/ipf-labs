package org.openehealth.ipf.commons.utils.couch.impl

import org.openehealth.ipf.commons.utils.couch.ResultRowBuilder
import org.openehealth.ipf.commons.utils.couch.View
import org.openehealth.ipf.commons.utils.couch.ViewResultRow

class ViewQuery extends QueryBase<ViewResultRow> {
    def final View view

    private static final VIEW_RESULT_ROW_BUILDER = {
        return new ViewResultRow(it)
    } as ResultRowBuilder<ViewResultRow>

    protected ViewQuery(View view) {
        super(view.resource, view.db.parser, VIEW_RESULT_ROW_BUILDER)
        this.view = view
    }

    protected ViewQuery(View view, Map<String, String> options) {
        super(view.resource, view.db.parser, VIEW_RESULT_ROW_BUILDER, options)
        this.view = view
    }

    protected ViewQuery copyWithNewOptions(Map<String, String> newOptions) {
        new ViewQuery(view, newOptions)
    }

    ViewQuery key(Object key) { option('key', parser.toJson(key)) }
    ViewQuery startKey(Object key) { option('startkey', parser.toJson(key)) }
    ViewQuery startKeyDocId(Object key) { option('startkey_docid', parser.toJson(key)) }
    ViewQuery endKey(Object key) { option('endkey', parser.toJson(key)) }
    ViewQuery endKeyDocId(Object key) { option('endkey_docid', parser.toJson(key)) }
    ViewQuery limit(long limit) { option('limit', Long.toString(limit)) }
    ViewQuery descending(boolean descending) { option('descending', Boolean.toString(descending)) }
    ViewQuery descending() { descending(true) }
    ViewQuery skip(long skip) { option('skip', Long.toString(skip)) }
    ViewQuery group(boolean group)  { option('group', Boolean.toString(group)) }
    ViewQuery group() { group(true) }
    ViewQuery groupLevel(int level) { option('group_level', Integer.toString(level)) }
    ViewQuery reduce(boolean reduce) { option('reduce', Boolean.toString(reduce)) }
    ViewQuery noReduce() { reduce(false) }
    ViewQuery includeDocs(boolean includeDocs) { option('include_docs', Boolean.toString(includeDocs)) }
    ViewQuery includeDocs() { includeDocs(true) }
    ViewQuery inclusiveEnd(boolean inclusiveEnd) { option('inclusive_end', Boolean.toString(inclusiveEnd)) }
    ViewQuery inclusiveEnd() { inclusiveEnd(true) }
    ViewQuery stale() { option('stale', 'ok') }
}
