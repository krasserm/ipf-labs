package org.openehealth.ipf.commons.utils.couch;

public interface JsonParser {
    JsonObject toObj(String json);
    JsonArray toArray(String json);
    <T> T toBean(String json, Class<T> type);
    String toJson(Object obj);
}
