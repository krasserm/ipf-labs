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
package org.openehealth.ipf.labs.maven.dsldoc.descriptor;

import java.io.File;

import org.openehealth.ipf.labs.maven.dsldoc.domain.MethodInfo;
import org.openehealth.ipf.labs.maven.dsldoc.domain.ParamInfo;
import org.openehealth.ipf.labs.maven.dsldoc.domain.SectionInfo;

import com.thoughtworks.qdox.model.JavaClass;
/**
 * Generates Eclipse gdsd descriptors
 * 
 * @author Mitko Kolev
 */
public class EclipseRenderer extends AbstractDslRenderer {

    public static final String dsld = "dsld";

    @Override
    public File getTargetFile(File parent, JavaClass cls) {
        return new File(parent, dsld + "/" + cls.getName() + "." + dsld);

    }
    public String buildSectionDescriptor(SectionInfo section) {

        StringBuilder str = new StringBuilder();
        str.append(" currentType(subType(");
        str.append("'").append(section.getName()).append("'");
        str.append(")).accept {").append(NEWLINE);
        for (MethodInfo method : section.getMethods()) {
            str.append(this.buildMethodDescriptor(method));
        }
        str.append("}");
        return str.toString();
    }

    public String buildMethodDescriptor(MethodInfo info) {
        StringBuilder str = new StringBuilder();
        str.append(TAB + "method ");

        str.append(escape("name", info.getMethodName()));
        str.append(", ");
        str.append(escape("type", info.getReturnParam().getTypeFull()));
        if (!info.getParamInfos().isEmpty()) {
            str.append(", params: [");
            boolean first = true;
            for (ParamInfo paramInfo : info.getParamInfos()) {
                if (!first) {
                    str.append(", ");
                }
                str.append(escape(paramInfo.getName(), paramInfo.getTypeFull()));
                first = false;
            }
            str.append("]");
        }
        String comment = info.getComment();
        if (comment != null && !"".equals(comment)) {
            str.append(", ");
            str.append(escapeDoc("doc", comment));
        }
        str.append(NEWLINE);
        return str.toString();
    }

    private String escapeDoc(String key, String comment) {
        String valueEscaped = comment.replaceAll("\'", "\"")
                .replaceAll("\"", "\\\\\"");
        String newLinesEscaped = valueEscaped.replaceAll(NEWLINE, TWO_TABS
                + NEWLINE);
        // separate the doc
        StringBuilder wrapped = new StringBuilder();
        wrapped.append("\"\"\"" + NEWLINE);
        wrapped.append(TWO_TABS ).append("\"").append(newLinesEscaped).append("\"").append(NEWLINE);
        wrapped.append(TWO_TABS).append("\"\"\"");
        return keyValue(key, wrapped.toString());
    }

    public String toString(){
        return "Eclipse "  + dsld;
    }
   
}
