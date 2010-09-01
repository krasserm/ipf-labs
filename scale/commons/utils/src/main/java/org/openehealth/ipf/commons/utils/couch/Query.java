package org.openehealth.ipf.commons.utils.couch;

public interface Query<T extends ResultRow> {
    QueryResult<T> query();
}
