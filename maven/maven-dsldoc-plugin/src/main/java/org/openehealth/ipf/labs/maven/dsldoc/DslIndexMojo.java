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

import java.util.Arrays;

/**
 * Goal which builds a DSL index for a single module.
 *
 * @goal dslindex
 */
public class DslIndexMojo extends AbstractDocMojo {
    public void execute() throws MojoExecutionException {
        enableProxy();
        Types types = initTypes();

        try {
            getLog().info("Building DSL Index");
            if (sourceTrees == null || sourceTrees.length == 0) {
                sourceTrees = new String[] { javaDSLSourceDirectory, groovyDSLSourceDirectory };
            }
            getLog().info("Using source trees: " + Arrays.toString(sourceTrees));
            new Extractor(types).processDSLIndex(project.getName(), buildDirectory, sourceTrees, getLog());
        }
        catch (Exception e) {
            throw new MojoExecutionException("Error creating IPF DSL Documentation", e);
        }
    }
}
