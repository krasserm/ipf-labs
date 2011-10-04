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

import static org.openehealth.ipf.labs.maven.confluence.export.ExportSpace.EXPORT_TYPE.HTML;
import static org.openehealth.ipf.labs.maven.confluence.export.ExportSpace.EXPORT_TYPE.PDF;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import org.apache.maven.settings.Proxy;
import org.apache.maven.settings.Settings;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Mitko Kolev
 *
 */
public class ConfluenceExportMojoTest {

    private ConfluenceExportMojo mojo;
    private String user = "exporter";
    private String password = "confluence";
    private String url = "http://repo.openehealth.org/confluence";
    private String proxyHost = "proxy.proxy.intercomponentware.com";
    private int proxyPort = 3128;
    
    @Before
    public void setUp() throws Exception {
        mojo = new ConfluenceExportMojo();
        mojo.confluenceVersion = "2.4";
        mojo.user = user;
        mojo.password = password;
        mojo.url = new URL(url);
        mojo.outputDirectory = new File("target");
        withProxy();

    }
    private void withProxy(){
      Settings settings = new Settings();
      settings.getProxies().add(new Proxy());
      settings.getActiveProxy().setHost(proxyHost);
      settings.getActiveProxy().setPort(proxyPort);
      mojo.settings = settings; 
    }
    @Test
    @Ignore
    public void testExportHtml() throws Exception {
        mojo.exportSpaces = new ArrayList<ExportSpace>();
        configureExportHTML();
        mojo.execute();
    }
    
    @Test
    @Ignore
    public void testExportPDF() throws Exception {
        mojo.exportSpaces = new ArrayList<ExportSpace>();
        configureExportPDF();
        mojo.execute();
    }
    
    @Test
    public void testExportHTMLandPDF() throws Exception {
        mojo.exportSpaces = new ArrayList<ExportSpace>();
        
        configureExportHTML();
        configureExportPDF();
        
        mojo.execute();
    }
    
    private void configureExportPDF(){
        ExportSpace html = new ExportSpace();
        html.setType(PDF.toString());
        html.setKey("ipf2export");
        mojo.exportSpaces.add(html);
    }
    
    private void configureExportHTML(){
        ExportSpace html = new ExportSpace();
        html.setType(HTML.toString());
        html.setKey("ipf2export");
        mojo.exportSpaces.add(html);
    }
}
