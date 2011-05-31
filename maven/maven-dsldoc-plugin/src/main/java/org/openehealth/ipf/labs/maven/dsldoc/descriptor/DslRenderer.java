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
import java.io.IOException;

import org.apache.maven.plugin.logging.Log;
import org.openehealth.ipf.labs.maven.dsldoc.domain.Documentation;

import com.thoughtworks.qdox.model.JavaClass;

/**
 * Render {@link Documentation} objects in a desired format and store the
 * content in the corresponding location for the format.
 * 
 * 
 * @author Mitko Kolev
 */
public interface DslRenderer {

    public static final String TAB = "    ";
    public static final String TWO_TABS = TAB + TAB;
    public static final String NEWLINE = "\r\n";

    /**
     * @return the DSL information as a String, based on the given
     *         <code>Documentation</code>.
     */
    String render(Documentation documentation);

    void writeToFile(Documentation doc, JavaClass cls, File outputDirectory,
            Log log) throws IOException;

}
