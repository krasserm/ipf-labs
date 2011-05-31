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

import org.apache.maven.plugin.MojoExecutionException;
import org.openehealth.ipf.labs.maven.dsldoc.domain.Types;

/**
 * Goal which builds DSL descriptors for IntelliJ IDEA and Eclipse.
 *
 * @goal dsld
 */
public class DslDescriptorsMojo extends AbstractDocMojo {
    
    public void execute() throws MojoExecutionException {
        Types types = initTypes();
        enableProxy();

        try {
            getLog().info("Building DSL metadata for Eclipse and IDEA for files with extensions " + descriptorFileExtensions);
            if (sourceTrees == null || sourceTrees.length == 0) {
                sourceTrees = new String[] { javaDSLSourceDirectory, groovyDSLSourceDirectory };
            }
            new Extractor(types, descriptorFileExtensions).generateDSLDescriptors(project.getName(), outputDirectory, sourceTrees, getLog());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
