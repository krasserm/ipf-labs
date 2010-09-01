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
package org.openehealth.ipf.commons.utils.json

import org.openehealth.ipf.commons.utils.couch.jsonlib.JsonParserImpl

class JSONSupport {
    def make(obj, boolean pretty) {
        new JsonParserImpl(pretty).toJson(obj)
    }

    def make(obj) { make(obj, false) }

    def parse(String json) {
        new JsonParserImpl().toObj(json)
    }

    def parseList(String json, Class<?> expectedElementType) {
        new JsonParserImpl().toArray(json).toList(expectedElementType)
    }

    def parse(String json, Class expectedType) {
        new JsonParserImpl().toBean(json, expectedType)
    }
}
