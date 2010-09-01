package org.openehealth.ipf.commons.utils.couch;

import java.util.List;

public interface Couch {
    JsonWebResource getResource();
    JsonParser getParser();
    List<String> getDatabases();
}
