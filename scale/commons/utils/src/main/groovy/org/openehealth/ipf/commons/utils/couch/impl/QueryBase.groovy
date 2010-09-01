package org.openehealth.ipf.commons.utils.couch.impl

import org.openehealth.ipf.commons.utils.couch.JsonParser
import org.openehealth.ipf.commons.utils.couch.JsonWebResource
import org.openehealth.ipf.commons.utils.couch.Query
import org.openehealth.ipf.commons.utils.couch.QueryResult
import org.openehealth.ipf.commons.utils.couch.ResultRow
import org.openehealth.ipf.commons.utils.couch.ResultRowBuilder
import static com.sun.jersey.api.client.ClientResponse.Status.OK

abstract class QueryBase<R extends ResultRow> implements Query<R> {
    def final JsonParser parser
    def final JsonWebResource resource
    def final Map<String, String> options
    def final ResultRowBuilder<R> resultRowBuilder

    protected QueryBase() {
        throw new UnsupportedOperationException('whatever ...')
    }

    protected QueryBase(JsonWebResource baseResource, JsonParser parser, ResultRowBuilder<R> resultRowBuilder) {
        this(baseResource, parser, resultRowBuilder, [:].asImmutable())
    }

    protected QueryBase(JsonWebResource baseResource, JsonParser parser, ResultRowBuilder<R> resultRowBuilder, Map<String, String> options) {
        this.resource = baseResource
        this.parser = parser
        this.options = options
        this.resultRowBuilder = resultRowBuilder
    }

    def abstract protected copyWithNewOptions(Map<String, String> options)

    def option(String name, String value) {
        def newOptions = options[name] == value ? options : createNewOptions(options, name, value)
        copyWithNewOptions(newOptions)
    }

    QueryResult<R> query() {
        def jsonResult = resource.query(options).json.match((OK): { it })
        def result = parser.toObj(jsonResult)
        new QueryResult<R>(result, resultRowBuilder)
    }

    private Map<String, String> createNewOptions(Map<String, String> old, String name, String value) {
        def newOptions = new HashMap<String, String>(old)
        newOptions[name] = value
        newOptions.asImmutable()
    }
}
