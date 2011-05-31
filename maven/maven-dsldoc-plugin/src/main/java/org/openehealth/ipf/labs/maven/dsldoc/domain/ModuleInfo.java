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
 * Information about a module in the documentation.
 * 
 * @author Jens Riemschneider
 */
public class ModuleInfo {
    private final String name;
    private final List<SectionInfo> sections = new ArrayList<SectionInfo>();
    private final Types types;

    /**
     * Constructs a module info.
     * @param name
     *          the name of the module.
     * @param types
     *          the type info.
     */
    public ModuleInfo(String name, Types types) {
        this.name = name;
        this.types = types;
    }

    /**
     * @return the name of the module.
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a new section to this module.
     * @param section
     *          the name of the new section.
     */
    public void addSection(String section) {
        SectionInfo sectionInfo = getSection(section);
        if (sectionInfo == null) {
            sectionInfo = new SectionInfo(section, types);
            sections.add(sectionInfo);
        }
    }

    /**
     * Adds a method to a section of this module
     * @param section
     *          the name of the section.
     * @param info
     *          the method info.
     */
    public void addMethod(String section, MethodInfo info) {
        getSection(section).addMethod(info);
    }

    private SectionInfo getSection(String section) {
        for (SectionInfo sectionInfo : sections) {
            if (sectionInfo.getName().equals(section)) {
                return sectionInfo;
            }
        }
        return null;
    }

    public List<SectionInfo> getSections() {
        return sections;
    }

    public Types getTypes() {
        return types;
    }
}
