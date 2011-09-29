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


import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.openehealth.ipf.labs.maven.confluence.export.service.impl.ConfluenceSoapServiceServiceLocator;
import org.openehealth.ipf.labs.maven.confluence.export.service.impl.ConfluenceserviceV1SoapBindingStub;
import org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException;

import java.io.*;

import static org.apache.commons.lang.Validate.notNull;

/**
 * Confluence export Mojo.
 * 
 * @author Boris Stanojevic
 * @author Mitko Kolev
 */
public class ConfluenceExportMojo extends AbstractConfluenceExportMojo {

    DefaultHttpClient client = new DefaultHttpClient();

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        enableProxy();
        configureClient();
        String sessionId = null;
        try {
            sessionId = executeSessionIdRequest();
        } catch (Exception e){
            throw new MojoExecutionException("Failure on sessionID request:" + e);
        }
        String exportUrl = exportConfluenceSpace();
        downloadExportedFile(sessionId, exportUrl);
    }

    private void configureClient(){
        client.getCredentialsProvider().setCredentials(
                new AuthScope(export.getUrl().getHost(), export.getUrl().getPort()),
                new UsernamePasswordCredentials(export.getUser(), export.getPassword()));
        if (hasProxy()){
            HttpHost proxy = new HttpHost(settings.getActiveProxy().getHost(),
                                          settings.getActiveProxy().getPort());

            if (defined(settings.getActiveProxy().getUsername())) {
                client.getCredentialsProvider().setCredentials(
                    new AuthScope(proxy.getHostName(), proxy.getPort()),
                    new UsernamePasswordCredentials(settings.getActiveProxy().getUsername(),
                                                    settings.getActiveProxy().getPassword()));
            }
            client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
        }
    }

    
    public String executeSessionIdRequest() throws Exception {
        getLog().info("Executing a sesion id request ...");
        HttpPost sessionIdRequest = new HttpPost(export.getUrl().toExternalForm() + "/login.action");
        String content = "os_username=" + export.getUser() + "&os_password=" + export.getPassword()
                + "&login=Log+In&os_destination=";
        String contentType = "application/x-www-form-urlencoded";
        String encoding = "UTF-8";
        sessionIdRequest.setEntity(new StringEntity(content, contentType, encoding));
        
        HttpResponse httpResponse = client.execute(sessionIdRequest);
        getLog().debug("Session id request has HTTP response code " + httpResponse.getStatusLine().getStatusCode());
        return extractSessionId(client);
    }


    public String exportConfluenceSpace(){
        ConfluenceserviceV1SoapBindingStub binding;

        try {
            ConfluenceSoapServiceServiceLocator locator = new ConfluenceSoapServiceServiceLocator();
            binding = (ConfluenceserviceV1SoapBindingStub) locator
                    .getConfluenceserviceV1();

        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new RuntimeException("JAX-RPC ServiceException caught: " + jre);
        }
        notNull(binding, "binding is null");

        // Time out after a minute
        binding.setTimeout(120000);

        String exportedSpaceUrl = null;
        try {
            String token = binding.login(export.getUser(), export.getPassword());
            exportedSpaceUrl = binding.exportSpace(token,
                                                   export.getSpace(),
                                                   "TYPE_HTML");
        } catch (Exception e1) {
            throw new RuntimeException("RemoteException Exception caught: " + e1);
        }
        return exportedSpaceUrl;
    }
    
    
    /**
     * Extracts the JSESSIONID cookie from the HttpMethod
     * @param client
     * @return the value of the JSESSIONID cookie
     */
    private String extractSessionId(DefaultHttpClient client) {
        getLog().debug("Extracting session id from the sesion id response from the cookie...");
        for (org.apache.http.cookie.Cookie cookie: client.getCookieStore().getCookies()){
            if (cookie.getName().equals("JSESSIONID")){
                return cookie.getValue();
            }
        }
        String msg = "No JSESSIONID found in Set-Cookie response header.";
        getLog().error(msg);
        throw new IllegalStateException(msg);
    }

    
    public StringEntity buildAuthenticationRequestEntity(String user, String password) throws Exception {
        String content = "os_username=" + user + "&os_password=" + password
                + "&login=Log+In&os_destination=";
        String contentType = "application/x-www-form-urlencoded";
        String encoding = "UTF-8";
        return new StringEntity(content, contentType, encoding);
    }

        public void downloadExportedFile(String sessionId, String exportedSpaceUri) {
        HttpGet get = new HttpGet(exportedSpaceUri);
        get.addHeader("Cookie",
                             "confluence.browse.space.cookie=space-pages; " +
                             "confluence.list.pages.cookie=list-content-tree; " +
                             "JSESSIONID=" + sessionId);
        get.addHeader("Accept",
                             "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        get.addHeader("Accept-Encoding", "gzip, deflate");

        HttpResponse httpResponse = null;
        try {
            httpResponse = client.execute(get);
            System.out.println(httpResponse.getStatusLine().getStatusCode());
            downloadStreamTo(httpResponse.getEntity().getContent(), "C:", "output.zip");
            System.out.println(exportedSpaceUri);
        } catch (Exception e){
            throw new RuntimeException(e);
        } finally {
            // Release the connection.
            try {
                if (httpResponse != null){
                    httpResponse.getEntity().getContent().close();
                }
            } catch(Exception e){
            }
        }
    }

    public void downloadStreamTo(InputStream zipFileInputStream,
                             String destinationDir,
                             String localFileName) {
        File targetFile = new File(destinationDir + File.separator
                + localFileName);
        if (!targetFile.exists()) {
            try {
                boolean created = targetFile.createNewFile();
                if (!created) {
                    throw new IllegalStateException("Unable to create file "
                            + targetFile.getAbsolutePath());
                }
            } catch (IOException ioe) {
                throw new RuntimeException(ioe);
            }
        }
        OutputStream targetStream = null;

        try {
            targetStream = new BufferedOutputStream(new FileOutputStream(targetFile));
            IOUtils.copyLarge(zipFileInputStream, targetStream);
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        } finally {
            IOUtils.closeQuietly(targetStream);
            IOUtils.closeQuietly(zipFileInputStream);
        }

    }
}
