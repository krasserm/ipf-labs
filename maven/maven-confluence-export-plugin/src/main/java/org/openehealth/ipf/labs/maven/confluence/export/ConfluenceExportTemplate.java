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
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.maven.plugin.logging.Log;

/**
 * @author Mitko Kolev
 * 
 */
public abstract class ConfluenceExportTemplate {

    protected final URL confluenceBaseUrl;
    protected final String user;
    protected final String password;
    protected final Log log;

    public ConfluenceExportTemplate(URL confluenceBaseUrl, String user, String password, Log log) {
        this.confluenceBaseUrl = confluenceBaseUrl;
        this.user = user;
        this.password = password;
        this.log = log;
    }

    public void export(DefaultHttpClient httpClient,
                       List<ExportSpace> spaces,
                       boolean isVersion30AndAbove,
                       File outputFolder) {
        try {
            String sessionId = login(httpClient);
            for (ExportSpace space : spaces) {
                String exportedUrl = export(space, isVersion30AndAbove);
                store(exportedUrl,
                      httpClient,
                      sessionId,
                      new File(outputFolder, space.getOutputFileName()));
            }
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (IOException ioe){
            throw new RuntimeException(ioe);
        }
    }

    protected abstract String  export(ExportSpace space, boolean isVersion30AndAbove) throws java.rmi.RemoteException;

    protected String login(DefaultHttpClient client) throws IOException {
        HttpPost sessionIdRequest = new HttpPost(confluenceBaseUrl.toExternalForm()
                + "/login.action");
        HttpResponse response = null;
        try {
            log.debug("Executing login with HTTP client");
            StringEntity loginRequest = buildLoginRequestEntity();
            sessionIdRequest.setEntity(loginRequest);
            response = client.execute(sessionIdRequest);
            log.debug("Login finished with status code " + response.getStatusLine().getStatusCode());
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException(uee);
        } catch (ClientProtocolException cpe) {
            throw new RuntimeException(cpe);
        } finally{
            if (response != null){
                IOUtils.closeQuietly(response.getEntity().getContent());
            }
        }
        return extractSessionId(client);
    }

    public void store(String exportedSpaceUrl,
                      DefaultHttpClient client,
                      String sessionId,
                      File targetFile) {
        HttpGet get = new HttpGet(exportedSpaceUrl);
        get.addHeader("Cookie", "confluence.browse.space.cookie=space-pages; "
                + "confluence.list.pages.cookie=list-content-tree; " + "JSESSIONID=" + sessionId);
        get.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        get.addHeader("Accept-Encoding", "gzip, deflate");

        InputStream content = null;
        try {
            log.info("Retreiving " + exportedSpaceUrl);
            HttpResponse httpResponse = client.execute(get);
            log.info("Writing " + targetFile.getAbsolutePath());
            content = httpResponse.getEntity().getContent();
            download(content, targetFile);
            log.info("Finished " + targetFile.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            IOUtils.closeQuietly(content);
        }
    }

    private void download(InputStream content, File targetFile) {
        if (!targetFile.exists()) {
            try {
                targetFile.setWritable(true);
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
        log.debug("Downloading the content to " + targetFile.getAbsolutePath());
        try {
            targetStream = new BufferedOutputStream(new FileOutputStream(targetFile), 1024 * 4 );
            IOUtils.copy(content, targetStream);
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        } finally {
            IOUtils.closeQuietly(targetStream);
        }
    }

    /**
     * Extracts the JSESSIONID cookie from the HttpMethod
     * 
     * @param client
     * @return the value of the JSESSIONID cookie
     */
    private String extractSessionId(DefaultHttpClient client) {
        for (org.apache.http.cookie.Cookie cookie : client.getCookieStore().getCookies()) {
            if (cookie.getName().equals("JSESSIONID")) {
                return cookie.getValue();
            }
        }
        String msg = "No JSESSIONID found in Set-Cookie response header.";
        throw new IllegalStateException(msg);
    }

    private StringEntity buildLoginRequestEntity() throws UnsupportedEncodingException {
        StringBuilder content = new StringBuilder();
        content.append("os_username=").append(user);
        content.append("&os_password=").append(password);
        content.append("&login=Log+In&os_destination=");
        String contentType = "application/x-www-form-urlencoded";
        String encoding = "UTF-8";
        return new StringEntity(content.toString(), contentType, encoding);
    }

}
