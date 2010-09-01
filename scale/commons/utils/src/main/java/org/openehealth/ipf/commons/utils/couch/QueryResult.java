package org.openehealth.ipf.commons.utils.couch;

import java.util.ArrayList;
import java.util.List;

public class QueryResult<T extends ResultRow> {
    private final JsonObject result;
    private final ResultRowBuilder<T> resultRowBuilder;

    public QueryResult(JsonObject result, ResultRowBuilder<T> resultRowBuilder) {
        this.result = result;
        this.resultRowBuilder = resultRowBuilder;
    }

    public int getTotalRows() {
        return getParam("total_rows", Integer.class);
    }

    public int getOffset() {
        return getParam("offset", Integer.class);
    }

    public List<T> getRows() {
        List<JsonObject> objList = result.getArray("rows").toList();
        List<T> rowList = new ArrayList<T>(objList.size());
        for (JsonObject obj : objList) {
            rowList.add(resultRowBuilder.build(obj));
        }
        return rowList;
    }

    public <T> T getParam(String key, Class<T> type) {
        if (!result.hasKey(key)) {
            throw new IllegalArgumentException("Undefined parameter: $key");
        }
        return result.toJava(key, type);
    }

    public String toString() { return result.toString(); }
}
