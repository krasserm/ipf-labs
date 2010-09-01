/*
 * Copyright 2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.platform.camel.flow.admin.client;

import com.google.gwt.json.client.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONUtil {
    private JSONUtil() {}

    public static List<Map<String, ?>> parseToMapList(String json) {
        return toMapList(JSONParser.parse(json));
    }

    public static List<Map<String, ?>> toMapList(JSONValue jsonArray) {
        JSONArray array = jsonArray.isArray();
        if (array == null) {
            throw new AssertionError("JSON value is not an array");
        }
        List<Map<String, ?>> list = new ArrayList<Map<String, ?>>();
        for (int idx = 0; idx < array.size(); ++idx) {
            JSONValue jsonValue = array.get(idx);
            JSONObject jsonObject = jsonValue.isObject();
            if (jsonObject == null) {
                throw new AssertionError("JSON value is not an object");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            for (String key : jsonObject.keySet()) {
                JSONValue value = jsonObject.get(key);
                map.put(key, value);
            }
            list.add(map);
        }

        return list;
    }

    public static List<String> toStringList(JSONArray array) {
        List<String> list = new ArrayList<String>(array.size());
        for (int idx = 0; idx < array.size(); ++idx) {
            JSONValue jsonValue = array.get(idx);
            JSONString jsonString = jsonValue.isString();
            if (jsonString == null) {
                throw new AssertionError("JSON value is not a string");
            }
            list.add(jsonString.stringValue());
        }
        return list;
    }
}
