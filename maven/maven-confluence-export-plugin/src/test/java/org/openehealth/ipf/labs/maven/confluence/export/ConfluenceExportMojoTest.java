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
package org.openehealth.ipf.labs.maven.confluence.export;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Mitko Kolev
 *
 */
public class ConfluenceExportMojoTest {

    private ConfluenceExportMojo mojo;
    private String user = "mitko.kolev";
    private String password = "";
    private String url = "http://repo.openehealth.org/confluence";
    
    @Before
    public void setUp() throws Exception {
        mojo = new ConfluenceExportMojo();
        mojo.confluenceVersion = "2.4";
        mojo.user = user;
        mojo.password = password;
        mojo.url = new URL(url);
        mojo.outputDirectory = new File("./target");
        
    }
    @Test
    public void testExportHtml() throws Exception {
        
        mojo.exportSpaces = new ArrayList<ExportSpace>();

        ExportSpace html = new ExportSpace();
        html.setType(ExportSpace.HTML);
        html.setKey("ipftools");
        mojo.exportSpaces.add(html);
        
        mojo.execute();
    }
}
