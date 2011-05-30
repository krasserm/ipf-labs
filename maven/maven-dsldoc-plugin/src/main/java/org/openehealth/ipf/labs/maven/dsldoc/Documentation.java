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
package org.openehealth.ipf.labs.maven.dsldoc;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains information for each module in a report.
 */
public class Documentation {
    private final List<ModuleInfo> modules = new ArrayList<ModuleInfo>();
    private final Types types;

    /**
     * Constructs the documentation object.
     * @param types
     *          the type info object.
     */
    public Documentation(Types types) {
        this.types = types;
    }

    /**
     * @return the documentation for a DSL index as a String.
     */
    public String toStringDSLIndex() {
        StringBuilder builder = new StringBuilder();
        for (ModuleInfo moduleInfo : modules) {
            builder.append(moduleInfo.toStringDSLIndex());
        }

        return builder.toString();
    }

    /**
     * @return the GDSL as a String.
     */
    public String toStringGDSL() {
        StringBuilder str = new StringBuilder();
        for (ModuleInfo moduleInfo : modules) {
            str.append(moduleInfo.toStringGDSL());
        }
        return str.toString();
    }
    
    
    /**
     * @return the GDSL as a String.
     */
    public String toStringDSLD() {
        StringBuilder str = new StringBuilder();
        for (ModuleInfo moduleInfo : modules) {
            str.append(moduleInfo.toStringDSLD());
        }
        return str.toString();
    }

    /**
     * Adds a DSL method to the documentation.
     * @param module
     *          the module that contains the DSL method.
     * @param section
     *          the section that contains the DSL method.
     * @param info
     *          the method info.
     */
    public void addMethod(String module, String section, MethodInfo info) {
        addModuleAndSection(module, section);
        getModule(module).addMethod(section, info);
    }

    private void addModuleAndSection(String module, String section) {
        ModuleInfo moduleInfo = getModule(module);
        if (moduleInfo == null) {
            moduleInfo = new ModuleInfo(module, types);
            modules.add(moduleInfo);
        }
        
        moduleInfo.addSection(section);
    }

    private ModuleInfo getModule(String module) {
        for (ModuleInfo moduleInfo : modules) {
            if (moduleInfo.getName().equals(module)) {
                return moduleInfo;
            }
        }
        return null;
    }
}
