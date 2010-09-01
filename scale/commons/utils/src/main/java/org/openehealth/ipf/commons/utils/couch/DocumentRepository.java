package org.openehealth.ipf.commons.utils.couch;

public interface DocumentRepository {
    JsonWebResource getResource();
    JsonParser getParser();

    void create(Object doc);
    void update(Object doc);
    void updateIfChanged(Object doc);
    void delete(Object doc);

    <T> T get(String docId, Class<T> type);
}
