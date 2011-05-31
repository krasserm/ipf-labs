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

import java.util.ArrayList;
import java.util.List;
/**
 * Information about a section in a module.
 * 
 * @author Jens Riemschneider
 */
public class SectionInfo {
    private final String name;
    private final List<MethodInfo> methods = new ArrayList<MethodInfo>();
    private final Types types;

    /**
     * Constructs a section.
     * @param name
     *          the name of the section.
     * @param types
     *          the type info.
     */
    public SectionInfo(String name, Types types) {
        this.name = name;
        this.types = types;
    }

    /**
     * @return the name of the section.
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a method to this section.
     * @param methodInfo
     *          the method info.
     */
    public void addMethod(MethodInfo methodInfo) {
        methods.add(methodInfo);
    }

    public List<MethodInfo> getMethods() {
        return methods;
    }

    public Types getTypes() {
        return types;
    }
}
