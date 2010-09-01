package org.openehealth.ipf.commons.utils.couch;

public interface ResultRowBuilder<T extends ResultRow> {
    T build(JsonObject obj);
}
