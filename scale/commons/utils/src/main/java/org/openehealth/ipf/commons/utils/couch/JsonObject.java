package org.openehealth.ipf.commons.utils.couch;

public interface JsonObject {
    JsonArray getArray(String key);
    <T> T toJava(String key, Class<T> type);
    boolean hasKey(String key);
}
