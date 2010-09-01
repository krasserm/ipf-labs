package org.openehealth.ipf.commons.utils.couch.jsonlib

import net.sf.json.JSONObject
import net.sf.json.JsonConfig
import org.openehealth.ipf.commons.utils.couch.JsonArray
import org.openehealth.ipf.commons.utils.couch.JsonObject

class JsonObjectImpl implements JsonObject {
    def final JSONObject jsonLibObj
    def final JsonConfig config

    JsonObjectImpl(JSONObject jsonLibObj, JsonConfig config) {
        this.jsonLibObj = jsonLibObj
        this.config = config
    }

    JsonArray getArray(String key) {
        new JsonArrayImpl(jsonLibObj.getJSONArray(key), config)
    }

    def toJava(String key, Class type) {
        if (String.isAssignableFrom(type)) {
            type.cast(jsonLibObj.getString(key))
        }
        else if (Integer.isAssignableFrom(type)) {
            type.cast(jsonLibObj.getInt(key))
        }
        else if (Long.isAssignableFrom(type)) {
            type.cast(jsonLibObj.getLong(key))
        }
        else if (Boolean.isAssignableFrom(type)) {
            type.cast(jsonLibObj.getBoolean(key))
        }
        else if (Double.isAssignableFrom(type)) {
            type.cast(jsonLibObj.getDouble(key))
        }
        else {
            def copiedConfig = config.copy()
            copiedConfig.rootClass = type
            type.cast(JSONObject.toBean(jsonLibObj.getJSONObject(key), copiedConfig))
        }
    }

    boolean hasKey(String key) {
        jsonLibObj.has(key)
    }

    String toString() { jsonLibObj.toString() }
}
