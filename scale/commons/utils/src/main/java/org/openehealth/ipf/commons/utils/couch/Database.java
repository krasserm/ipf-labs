package org.openehealth.ipf.commons.utils.couch;

public interface Database {
    JsonWebResource getResource();
    JsonParser getParser();

    boolean create();
    boolean delete();
}
