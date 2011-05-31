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
import org.openehealth.ipf.labs.maven.dsldoc.domain.ModuleInfo;
import org.openehealth.ipf.labs.maven.dsldoc.domain.ParamInfo;
import org.openehealth.ipf.labs.maven.dsldoc.domain.SectionInfo;

import com.thoughtworks.qdox.model.JavaClass;

public class HTMLRenderer extends AbstractDslRenderer {

 
    @Override
    public File getTargetFile(File parent, JavaClass cls) {
        return new File(parent, "dslindex");
    }
    
    /**
     * @return the DSL index for this section.
     */
    public String buildModuleDescriptor(ModuleInfo module) {
        StringBuilder builder = new StringBuilder();
        builder.append("<h2><a name=\"")
                .append(module.getName())
                .append("\"></a>DSL Extensions provided by <tt>")
                .append(module.getName())
                .append("</tt></h2>");
        
        for (SectionInfo section : module.getSections()) {
            builder.append(buildSectionDescriptor(section));
        }
        return builder.toString();
    }

    
    
    public String buildMethodDescriptor(MethodInfo method) {
        
        StringBuilder str = new StringBuilder();
        str.append("<tr class=\"b\"><td><tt>");
        appendParam(str, method.getReturnParam());
        str.append("</tt> <tt><a href=\"");
        str.append(method.getLink());
        str.append("\">");
        str.append(method.getMethodName());
        str.append("</a>(");
        boolean first = true;
        for (ParamInfo paramInfo : method.getParamInfos()) {
            if (!first) {
                str.append(", ");
            }
            appendParam(str, paramInfo);
            str.append(" ");
            str.append(paramInfo.getName());
            first = false;
        }
        str.append(")</tt><br>");
        str.append(method.getComment());
        str.append("</td></tr>");
        
        return str.toString();
    }
    
    
    
    private void appendParam(StringBuilder str, ParamInfo paramInfo) {
        if (paramInfo.getLink().isEmpty()) {
            str.append(paramInfo.getType());
        }
        else {
            str.append("<a href=\"");
            str.append(paramInfo.getLink());
            str.append("\" title=\"");
            str.append(paramInfo.getTypeFull());
            str.append("\">");
            str.append(paramInfo.getType());
            str.append("</a>");
        }
    }
    
    
    public String buildSectionDescriptor(SectionInfo section) {
        String sectionName = section.getTypes().getTypeName(section.getName());
        StringBuilder str = new StringBuilder();
        str.append("<table class=\"bodyTable\"><tr class=\"a\"><th><a name=\"")
                .append(sectionName)
                .append("\"></a><tt>")
                .append(sectionName)
                .append("</tt><br clear=\"all\" /></th></tr>");
       
        for (MethodInfo method : section.getMethods()) {
            str.append(this.buildMethodDescriptor(method));
        }
        str.append("</table>");
        return str.toString();
    }
    
    public String toString(){
        return "DSL in HTML format";
    }

}
