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

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.Proxy;
import org.apache.maven.settings.Settings;

/**
 * @author Mitko Kolev
 *
 */
public abstract class AbstractConfluenceExportMojo extends AbstractMojo {

    protected DefaultHttpClient client = new DefaultHttpClient();
    
    /**
     * The Maven Settings.
     * @parameter default-value="${settings}"
     * @required
     * @readonly
     */
    protected Settings settings;
    
    /**
     * Location of the output directory.
     * @parameter expression="${output.directory}" default-value="${project.build.outputDirectory}"
     * @required
     */
    protected File outputDirectory;

    /**
     * Location of the build directory.
     * @parameter expression="${build.directory}" default-value="${project.build.directory}"
     * @required
     */
    protected File buildDirectory;

    /**
     * @parameter default-value="${project}"
     * @required
     * @readonly
     */
    protected MavenProject project;
    
    /**
     * @parameter default-value="${project.name}"
     * @readonly
     */
    protected String projectName;
 

 
    
    /**
     * Enables a proxy server for http access if it is configured within the Maven settings.
     */
    protected void enableAxisProxy() {
        Proxy activeProxy = settings.getActiveProxy();
        String protocol = activeProxy.getProtocol().isEmpty() ? "" : activeProxy.getProtocol();

        if (defined(activeProxy.getHost())) {
            System.setProperty(protocol + ".proxyHost", activeProxy.getHost());
        }

        if (activeProxy.getPort() > 0) {
            System.setProperty(protocol + ".proxyPort", Integer.toString(activeProxy.getPort()));
        }

        if (defined(activeProxy.getNonProxyHosts())) {
            System.setProperty(protocol + ".nonProxyHosts", activeProxy.getNonProxyHosts());
        }

        if (defined(activeProxy.getUsername())) {
            System.setProperty(protocol + ".proxyUser", activeProxy.getUsername());

            if (defined(activeProxy.getPassword())) {
                System.setProperty(protocol + ".proxyPassword", activeProxy.getPassword());
            }
        }
    }

    protected void configureHttpClientProxy() {
        Proxy activeProxy = this.settings.getActiveProxy();
        HttpHost proxy = new HttpHost(activeProxy.getHost(), activeProxy.getPort());

        String proxyUserName = activeProxy.getUsername();
        if (defined(proxyUserName)) {
            String proxyPassword = activeProxy.getPassword();
            client.getCredentialsProvider()
                    .setCredentials(new AuthScope(proxy.getHostName(), proxy.getPort()),
                                    new UsernamePasswordCredentials(proxyUserName, proxyPassword));
        }
        System.out.println("PROXY HOST DEFINED: " + activeProxy.getHost()+":"+ activeProxy.getPort());
        client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
    }
    
    
    protected static boolean defined(String value) {
        return value != null && !value.isEmpty();
    }

    protected boolean hasProxy(){
        if (settings == null || settings.getActiveProxy() == null) {
            return false;
        }
        return true;
    }
}
