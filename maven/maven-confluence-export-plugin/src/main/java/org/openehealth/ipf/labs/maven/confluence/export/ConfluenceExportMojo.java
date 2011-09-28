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

import org.apache.commons.httpclient.HeaderElement;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Confluence export Mojo.
 * 
 * @author Boris Stanojevic
 */
public class ConfluenceExportMojo extends AbstractConfluenceExportMojo {
   
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        //do the Confluence Extraction Logic
    }
    
    public String executeSessionIdRequest(HttpClient client, String page, String user, String password) throws Exception {
        getLog().info("Executing a sesion id request ...");
        PostMethod sessionIdRequest = new PostMethod(page + "/login.action");
        String content = "os_username=" + user + "&os_password=" + password
                + "&login=Log+In&os_destination=";
        String contentType = "application/x-www-form-urlencoded";
        String encoding = "UTF-8";
        sessionIdRequest.setRequestEntity(new StringRequestEntity(content, contentType, encoding));
        
        int responseCode = client.executeMethod(sessionIdRequest);
        getLog().debug("Sesion id request has HTTP response code " + responseCode);
        return extractSessionId(sessionIdRequest);
    }
    
    
    /**
     * Extracts the JSESSIONID cookie from the HttpMethod
     * @param confluenceRequest
     * @return the value of the JSESSIONID cookie
     */
    private String extractSessionId(HttpMethodBase confluenceRequest) {
        getLog().debug("Extracting session id from the sesion id response from the cookie...");
        HeaderElement[] elements = confluenceRequest.getResponseHeader("Set-Cookie").getElements();
        for (HeaderElement element : elements) {
            if ("JSESSIONID".equals(element.getName())) {
                return element.getValue();
            }
        }
        String msg = "No JSESSIONID found in Set-Cookie response header.";
        getLog().error(msg);
        throw new IllegalStateException(msg);
    }
    
    public RequestEntity buildAuthenticationRequestEntity(String user, String password) throws Exception {
        String content = "os_username=" + user + "&os_password=" + password
                + "&login=Log+In&os_destination=";
        String contentType = "application/x-www-form-urlencoded";
        String encoding = "UTF-8";
        return new StringRequestEntity(content, contentType, encoding);
    }
}
