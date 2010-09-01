package org.openehealth.ipf.commons.utils.couch;

public class ResultRow {
    private final JsonObject obj;

    public ResultRow(JsonObject obj) {
        this.obj = obj;
    }

    public <T> T get(String key, Class<T> type) {
        return obj.toJava(key, type); 
    }

    public String toString() {
        return obj.toString();
    }
}
