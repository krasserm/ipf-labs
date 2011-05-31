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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.maven.plugin.logging.Log;
import org.openehealth.ipf.labs.maven.dsldoc.domain.Documentation;
import org.openehealth.ipf.labs.maven.dsldoc.domain.MethodInfo;
import org.openehealth.ipf.labs.maven.dsldoc.domain.ModuleInfo;
import org.openehealth.ipf.labs.maven.dsldoc.domain.SectionInfo;

import com.thoughtworks.qdox.model.JavaClass;
/**
 * Abstract class for {@link DslRenderer}
 * 
 * @author Mitko Kolev
 */
public abstract class AbstractDslRenderer implements DslRenderer {

  
    abstract File getTargetFile(File parent, JavaClass cls);
    
    abstract String buildMethodDescriptor(MethodInfo info);
    
    abstract String buildSectionDescriptor(SectionInfo sectionEntry);
    
    @Override
    public String render(Documentation documentation) {
        StringBuilder builder = new StringBuilder();
        for (ModuleInfo module: documentation.getModules()) {
            builder.append(this.buildModuleDescriptor(module));
        }
        return builder.toString();
    }
    
    public String buildModuleDescriptor(ModuleInfo module) {
        StringBuilder str = new StringBuilder();
        for (SectionInfo sectionEntry : module.getSections()) {
            str.append(buildSectionDescriptor(sectionEntry));
            str.append(NEWLINE);
        }
        return str.toString();
    }
   
    protected String escape(String key, String value){
        //escaped the contained " and '
        String valueEscaped = value.replaceAll("\'", "\"").replaceAll("\"", "\\'"); 
        return keyValue(key, "\'" + valueEscaped + "\'");
    }
    protected String keyValue(String key, String value){
        StringBuilder str = new StringBuilder();
        str.append(key);
        str.append(" : ");
        str.append(value);
        return str.toString();
    }
    
    protected void writeFile(File output, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        try {
            writer.write(content);
        }
        finally {
            writer.close();
        }
    }
    
    protected File createTargetDescriptorFile(JavaClass cls, File outputDirectory, Log log) {
        File target = getTargetFile(outputDirectory, cls);
        if (!target.getParentFile().exists()){
            boolean created = target.getParentFile().mkdirs();
            if (!created){
                log.error("Unable to create the directory structure for DSL metadata " + target.getParentFile().getAbsolutePath());
            }
        }
        return target;
    }
    
    public void writeToFile(Documentation doc, JavaClass cls, File outputDirectory, Log log) throws IOException {
        File file = createTargetDescriptorFile(cls, outputDirectory, log);
        log.info("Writing " + this.toString() + " (" + file.getAbsolutePath() + ")" );
        String descriptorContent = render(doc);
        writeFile(file, descriptorContent);
    }
}
