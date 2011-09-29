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

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.openehealth.ipf.labs.maven.confluence.export.html.v1.AuthenticationFailedException;
import org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException;

/**
 * Confluence export Mojo.
 * 
 * @author Boris Stanojevic
 * @author Mitko Kolev
 */
public class ConfluenceExportMojo extends AbstractConfluenceExportMojo {
    
    private ConfluenceExportTemplate confluenceTemplate;
    private DefaultHttpClient client;

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
     * @parameter default-value="1"
     */
    protected int webApiVersion;
    /**
     * @parameter
     * @required
     */
    protected List<Space> spaces;

    
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        enableProxy();
        initializeHttpClient();
        initializeConfluenceTemplate();
        try {
            for (Space  space: spaces){
                confluenceTemplate.exportSpace(client, url, user, password, space, getLog());
            }
        } catch(AuthenticationFailedException afe){
            String msg = "confluence-export-plugin: Unable to authenticate user " + user + " on " + url;
            getLog().error(msg);
            throw new MojoExecutionException(msg, afe);
        } catch (RemoteException re){
            throw new MojoExecutionException("Confluence Remote exception", re);
        } catch (java.rmi.RemoteException e) {
            throw new MojoExecutionException("Remote exception", e);
        }

    }
   
    private void initializeConfluenceTemplate() throws MojoExecutionException {
        if (webApiVersion == 1){
            confluenceTemplate = new ConfluenceV1ExportTemplate();
        }
        if (webApiVersion == 2){
            confluenceTemplate = new ConfluenceV2ExportTemplate();
        }
        throw new MojoExecutionException("Unsupported Confluence web api version " + webApiVersion);
    }
    
    private void initializeHttpClient() {
        client = new DefaultHttpClient();
        AuthScope confluenceScope =  new AuthScope(url.getHost(), url.getPort());
        UsernamePasswordCredentials exportCredentials =  new UsernamePasswordCredentials(user, password);
        client.getCredentialsProvider().setCredentials(confluenceScope, exportCredentials);
        if (hasProxy()) {
            configureHttpProxyParams();
        }
    }
    
    private void configureHttpProxyParams() {
        HttpHost proxy = new HttpHost(settings.getActiveProxy().getHost(), settings
                .getActiveProxy().getPort());

        String proxyUserName = settings.getActiveProxy().getUsername();
        if (defined(proxyUserName)) {
            String proxyPassword = settings.getActiveProxy().getPassword();
            client.getCredentialsProvider().setCredentials(new AuthScope(proxy.getHostName(), proxy.getPort()), 
                                                           new UsernamePasswordCredentials(proxyUserName, proxyPassword));
        }
        client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
    }

}
