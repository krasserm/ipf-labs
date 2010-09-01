package org.openehealth.ipf.commons.utils.couch;

import java.util.List;

public interface JsonArray {
    JsonObject getObj(int idx);
    JsonArray getArray(int idx);

    List<JsonObject> toList();

    <T> List<T> toList(Class<T> elementType);
}
