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

/**
 * Information about a documented DSL method parameter or return value.
 * 
 * @author Jens Riemschneider
 */
public class ParamInfo {
    private final String name;
    private final String typeFull;
    private final String link;

    /**
     * Constructs the parameter information.
     * @param typeFull
     *          the fully qualified type of the parameter.
     * @param name
     *          the name of the parameter.
     * @param link
     *          a link to detailed information about the type.
     */
    public ParamInfo(String typeFull, String name, String link) {
        this.typeFull = typeFull;
        this.name = name;
        this.link = link;
    }

    /**
     * @return the (not fully qualified) type of the parameter.
     */
    public String getType() {
        int idx = typeFull.lastIndexOf(".");
        return idx < 0 ? typeFull : typeFull.substring(idx + 1);
    }

    /**
     * @return the name of the parameter.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the fully qualified type of the parameter.
     */
    public String getTypeFull() {
        return typeFull;
    }

    /**
     * @return the API link for the parameter type.
     */
    public String getLink() {
        return link;
    }
}
