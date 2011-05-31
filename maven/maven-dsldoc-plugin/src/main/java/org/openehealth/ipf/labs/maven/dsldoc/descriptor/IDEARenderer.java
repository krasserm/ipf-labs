/*
 * Copyright 2011 the original author or authors.
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
package org.openehealth.ipf.labs.maven.dsldoc.descriptor;

import java.io.File;

import org.openehealth.ipf.labs.maven.dsldoc.domain.MethodInfo;
import org.openehealth.ipf.labs.maven.dsldoc.domain.ParamInfo;
import org.openehealth.ipf.labs.maven.dsldoc.domain.SectionInfo;

import com.thoughtworks.qdox.model.JavaClass;

/**
 * Generates IDEA gdsl descriptors
 * 
 * @author Jens Riemschneider
 * @author Mitko Kolev
 */
public class IDEARenderer extends AbstractDslRenderer {

    public static final String gdsl = "gdsl";

    @Override
    public File getTargetFile(File parent, JavaClass cls) {
        // this was the old strategy in rendering IDEA files. No need to create
        // the dir there
        // return new File(parent, cls.getPackageName().replace(".", "/") + "/"
        // + cls.getName() + "." + gdsl);
        return new File(parent, gdsl + "/" + cls.getName() + "." + gdsl);
    }

    public String buildMethodDescriptor(MethodInfo info) {
        StringBuilder str = new StringBuilder();
        str.append(TAB + "method name: '");
        str.append(info.getMethodName());
        str.append("', type: '");
        str.append(info.getReturnParam().getTypeFull());
        str.append("'");
        if (!info.getParamInfos().isEmpty()) {
            str.append(", params: [");
            boolean first = true;
            for (ParamInfo paramInfo : info.getParamInfos()) {
                if (!first) {
                    str.append(", ");
                }
                str.append(paramInfo.getName());
                str.append(": '");
                str.append(paramInfo.getTypeFull());
                str.append("'");
                first = false;
            }
            str.append("]");
        }
        str.append(NEWLINE);
        return str.toString();

    }

    public String buildSectionDescriptor(SectionInfo section) {
        StringBuilder str = new StringBuilder();
        str.append("contributor([context(ctype: '");
        str.append(section.getName());
        str.append("')]) {").append(NEWLINE);
        for (MethodInfo method : section.getMethods()) {
            str.append(this.buildMethodDescriptor(method));
        }
        str.append("}");
        return str.toString();
    }

    public String toString() {
        return "IDEA " + gdsl;
    }

}
