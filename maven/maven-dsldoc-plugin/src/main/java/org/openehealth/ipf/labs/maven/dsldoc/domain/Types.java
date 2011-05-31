/*
 * Copyright 2010 the original author or authors.
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
package org.openehealth.ipf.labs.maven.dsldoc.domain;

import java.util.Map;

/**
 * Type information to resolve API links.
 * 
 * @author Jens Riemschneider
 */
public class Types {
    private final Map<String, String> apiLinks;

    /**
     * Constructs the type info.
     * @param apiLinks
     *          the API links.
     */
    public Types(Map<String, String> apiLinks) {
        this.apiLinks = apiLinks;
    }

    /**
     * Extracts the type name without package info.
     * @param typeFull
     *          the fully qualified type.
     * @return the (not fully qualified) type.
     */
    public String getTypeName(String typeFull) {
        int idx = typeFull.lastIndexOf(".");
        return idx < 0 ? typeFull : typeFull.substring(idx + 1);
    }

    /**
     * Determines the API link for a given type.
     * @param typeFull
     *          the fully qualified type.
     * @return the API link, or an empty String if no link was found.
     */
    public String resolveLink(String typeFull) {
        for (Map.Entry<String, String> apiLink : apiLinks.entrySet()) {
            if (typeFull.startsWith(apiLink.getKey())) {
                String packageAsPath = typeFull.substring(apiLink.getKey().length()).replace(".", "/") + ".html";
                return apiLink.getValue() + packageAsPath;
            }
        }
        return "";
    }
}
