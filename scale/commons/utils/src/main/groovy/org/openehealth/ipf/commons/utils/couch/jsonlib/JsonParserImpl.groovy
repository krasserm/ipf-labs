package org.openehealth.ipf.commons.utils.couch.jsonlib

import net.sf.json.JSONArray
import net.sf.json.JSONObject
import net.sf.json.JSONSerializer
import net.sf.json.JsonConfig
import net.sf.json.util.JSONUtils
import net.sf.json.util.PropertyFilter
import org.openehealth.ipf.commons.utils.couch.JsonArray
import org.openehealth.ipf.commons.utils.couch.JsonObject
import org.openehealth.ipf.commons.utils.couch.JsonParser

class JsonParserImpl implements JsonParser {
    def final JsonConfig config = new JsonConfig()
    def final boolean pretty

    JsonParserImpl() { this(false) }

    JsonParserImpl(boolean pretty) {
        this.pretty = pretty
        config.jsonPropertyFilter = { source, String name, value -> value == null } as PropertyFilter
    }

    JsonObject toObj(String json) {
        new JsonObjectImpl(JSONObject.fromObject(json, config), config)
    }

    JsonArray toArray(String json) {
        new JsonArrayImpl(JSONArray.fromObject(json, config), config)
    }

    def toBean(String json, Class type) {
        type.cast(JSONObject.toBean(JSONObject.fromObject(json, config), type))
    }

    String toJson(Object obj) {
        if (obj instanceof String || obj instanceof Number) {
            pretty ?
                JSONUtils.valueToString(obj, 2, 2) :
                JSONUtils.valueToString(obj)
        }
        else {
            pretty ?
                new JSONSerializer().toJSON(obj, config).toString(2, 2) :
                new JSONSerializer().toJSON(obj, config).toString()
        }
    }
}
