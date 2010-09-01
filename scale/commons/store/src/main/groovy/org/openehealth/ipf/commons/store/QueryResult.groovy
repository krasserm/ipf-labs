package org.openehealth.ipf.commons.store

import org.apache.commons.lang.builder.ToStringStyle
import org.apache.commons.lang.builder.ToStringBuilder

class QueryResult {
    def List results
    def QueryIterator iterator

    boolean equals(o) {
        if (this.is(o)) return true;

        if (!o || getClass() != o.class) return false;

        QueryResult that = (QueryResult) o;

        if (iterator ? !iterator.equals(that.iterator) : that.iterator != null) return false;
        if (results ? !results.equals(that.results) : that.results != null) return false;

        return true;
    }

    int hashCode() {
        int result;

        result = (results ? results.hashCode() : 0);
        result = 31 * result + (iterator ? iterator.hashCode() : 0);
        return result;
    }

    @Override
    String toString() {
        ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE)
    }
}
