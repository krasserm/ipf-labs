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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.maven.plugin.logging.Log;
import org.openehealth.ipf.labs.maven.confluence.export.html.v1.AuthenticationFailedException;
import org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException;

/**
 * @author Mitko Kolev
 * 
 */
public abstract class ConfluenceExportTemplate {

    public HttpResponse executeSessionIdRequest(DefaultHttpClient client, 
                                          URL url,
                                          String user,
                                          String password) throws Exception {
        HttpPost sessionIdRequest = new HttpPost(url.toExternalForm() + "/login.action");

        StringBuilder content = new StringBuilder();
        content.append("os_username=").append(user);
        content.append("&os_password=").append(password);
        content.append("&login=Log+In&os_destination=");

        String contentType = "application/x-www-form-urlencoded";
        String encoding = "UTF-8";
        sessionIdRequest.setEntity(new StringEntity(content.toString(), contentType, encoding));
        return client.execute(sessionIdRequest);
    }

    /**
     * Extracts the JSESSIONID cookie from the HttpMethod
     * 
     * @param client
     * @return the value of the JSESSIONID cookie
     */
    public String extractSessionId(DefaultHttpClient client) {
        for (org.apache.http.cookie.Cookie cookie : client.getCookieStore().getCookies()) {
            if (cookie.getName().equals("JSESSIONID")) {
                return cookie.getValue();
            }
        }
        String msg = "No JSESSIONID found in Set-Cookie response header.";
        throw new IllegalStateException(msg);
    }

    public StringEntity buildAuthenticationRequestEntity(String user, String password) throws Exception {
        StringBuilder content = new StringBuilder();
        content.append("os_username=").append(user);
        content.append("&os_password=").append(password);
        content.append("&login=Log+In&os_destination=");
        String contentType = "application/x-www-form-urlencoded";
        String encoding = "UTF-8";
        return new StringEntity(content.toString(), contentType, encoding);
    }

    public abstract void exportSpace(DefaultHttpClient client, URL url, String user, String passwrod, Space space, Log log) throws AuthenticationFailedException, RemoteException, java.rmi.RemoteException;
    
    
    
    public void downloadExportedFile(DefaultHttpClient client, String sessionId, String exportedSpaceUri) {
        HttpGet get = new HttpGet(exportedSpaceUri);
        get.addHeader("Cookie", "confluence.browse.space.cookie=space-pages; "
                + "confluence.list.pages.cookie=list-content-tree; " + "JSESSIONID=" + sessionId);
        get.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        get.addHeader("Accept-Encoding", "gzip, deflate");

        HttpResponse httpResponse = null;
        try {
            httpResponse = client.execute(get);
            System.out.println(httpResponse.getStatusLine().getStatusCode());
            downloadStreamTo(httpResponse.getEntity().getContent(), "C:", "output.zip");
            System.out.println(exportedSpaceUri);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            // Release the connection.
            try {
                if (httpResponse != null) {
                    httpResponse.getEntity().getContent().close();
                }
            } catch (Exception e) {
            }
        }
    }

    public void downloadStreamTo(InputStream zipFileInputStream,
                                 String destinationDir,
                                 String localFileName) {
        File targetFile = new File(destinationDir + File.separator + localFileName);
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
