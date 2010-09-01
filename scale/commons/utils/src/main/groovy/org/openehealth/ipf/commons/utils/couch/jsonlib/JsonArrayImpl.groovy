package org.openehealth.ipf.commons.utils.couch.jsonlib

import net.sf.json.JSONArray
import net.sf.json.JSONObject
import net.sf.json.JsonConfig
import org.openehealth.ipf.commons.utils.couch.JsonArray
import org.openehealth.ipf.commons.utils.couch.JsonObject

class JsonArrayImpl implements JsonArray {
    def final JSONArray jsonLibArray
    def final JsonConfig config

    JsonArrayImpl(JSONArray jsonLibArray, JsonConfig config) {
        this.jsonLibArray = jsonLibArray
        this.config = config
    }

    JsonObject getObj(int idx) {
        new JsonObjectImpl(jsonLibArray.getJSONObject(idx), config)
    }

    JsonArray getArray(int idx) {
        new JsonArrayImpl(jsonLibArray.getJSONArray(idx), config)
    }

    List<JsonObject> toList() {
        jsonLibArray.collect { new JsonObjectImpl(JSONObject.fromObject(it, config), config) }
    }

    def <T> List<T> toList(Class<T> elementType) {
        def copiedConfig = config.copy()
        copiedConfig.collectionType = List
        copiedConfig.rootClass = elementType
        (List<T>)JSONArray.toCollection(jsonLibArray, copiedConfig)
    }
}
