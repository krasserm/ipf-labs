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
package org.openehealth.ipf.labs.maven.confluence.export;

import java.net.URL;
import java.util.List;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.maven.artifact.versioning.DefaultArtifactVersion;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Confluence export Mojo.
 *
 * <configuration>
 *     <url></url>
 *     <user></user>
 *     <password></password>
 *     <confluenceVersion></confluenceVersion>
 *     <exportSpaces>
 *        <exportSpace>
 *            <key>your-space-key</key>
 *            <type>HTML/PDF/XML</type>
 *            <timeout></timeout> //0 means infinite
 *            <outputFileName></outputFileName>
 *        </exportSpace>
 *     </exportSpaces>
 * </configuration>
 *
 * @author Boris Stanojevic
 * @author Mitko Kolev
 *
 * @goal exportSpace
 */
public class ConfluenceExportMojo extends AbstractConfluenceExportMojo {

    private ConfluenceExportTemplate confluenceTemplate;

    /**
     * @parameter
     * @required
     */
    protected URL url;
    /**
     * @parameter
     * @required
     */
    protected String user;
    /**
     * @parameter
     * @required
     */
    protected String password;
    /**
     * @parameter default-value="2.4"
     */
    protected String confluenceVersion;
    /**
     * @parameter
     * @required
     */
    protected List<ExportSpace> exportSpaces;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        if (hasProxy()) {
            enableAxisProxy();
            configureHttpClientProxy();
        }
        initializeConfluenceTemplate();

        boolean isVersion30AndAbove = isConfluenceVersion30andAbove();
        try {
            confluenceTemplate.export(client, exportSpaces, isVersion30AndAbove, this.outputDirectory);
        }finally{
            client.getConnectionManager().shutdown();
        }
    }

    protected void initializeConfluenceTemplate() throws MojoExecutionException {
        confluenceTemplate = new ConfluenceV1ExportTemplate(url, user, password, getLog());
    }

   

    protected boolean isConfluenceVersion30andAbove() {
        DefaultArtifactVersion version = new DefaultArtifactVersion(confluenceVersion);
        if (version.compareTo(new DefaultArtifactVersion("3.0")) >= 0) {
            return true;
        } else {
            return false;
        }
    }

}
