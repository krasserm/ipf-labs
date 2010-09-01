package org.openehealth.ipf.commons.utils.couch.impl

import org.openehealth.ipf.commons.utils.couch.Lucene
import org.openehealth.ipf.commons.utils.couch.LuceneResultRow
import org.openehealth.ipf.commons.utils.couch.ResultRowBuilder

class LuceneQuery extends QueryBase<LuceneResultRow> {
    def final Lucene lucene

    private static final ResultRowBuilder LUCENE_RESULT_ROW_BUILDER = {
        return new LuceneResultRow(it)
    } as ResultRowBuilder<LuceneResultRow>

    LuceneQuery(Lucene lucene) {
        super(lucene.resource, lucene.db.parser, LUCENE_RESULT_ROW_BUILDER)
        this.lucene = lucene
    }

    protected LuceneQuery(Lucene lucene, Map<String, String> options) {
        super(lucene.resource, lucene.db.parser, LUCENE_RESULT_ROW_BUILDER, options)
        this.lucene = lucene
    }

    protected LuceneQuery copyWithNewOptions(Map<String, String> options) {
        new LuceneQuery(lucene, options)
    }

    LuceneQuery q(String query) { option('q', query) }
    LuceneQuery includeDocs(boolean includeDocs) { option('include_docs', Boolean.toString(includeDocs)) }
    LuceneQuery includeDocs() { includeDocs(true) }
    LuceneQuery debug(boolean debug) { option('debug', Boolean.toString(debug)) }
    LuceneQuery debug() { debug(true) }
    LuceneQuery limit(long limit) { option('limit', Long.toString(limit)) }
    LuceneQuery skip(long skip) { option('skip', Long.toString(skip)) }
    LuceneQuery stale() { option('stale', 'ok') }
    LuceneQuery sort(String sort) { option('sort', sort) }
    LuceneQuery callback(String callback) { option('callback', callback) }
}
