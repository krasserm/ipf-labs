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

import javax.xml.rpc.ServiceException;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.maven.plugin.logging.Log;

/**
 * @author Mitko Kolev
 * 
 */
public abstract class AbstractConfluenceExportTemplate {

    protected final URL confluenceBaseUrl;
    protected final String user;
    protected final String password;
    protected final Log log;

    public AbstractConfluenceExportTemplate(URL confluenceBaseUrl, String user, String password, Log log) {
        this.confluenceBaseUrl = confluenceBaseUrl;
        this.user = user;
        this.password = password;
        this.log = log;
    }

    public void export(DefaultHttpClient httpClient,
                       List<ExportSpace> spaces,
                       boolean isVersion30AndAbove,
                       File outputFolder) throws IOException, 
                                                 RemoteException, 
                                                 ServiceException,
                                                 HttpException {
        String sessionId = login(httpClient);
        
        for (ExportSpace space : spaces) {
            long started = System.currentTimeMillis();
            log.info("Starting a Confluence export for space: " + space);
            log.info("Please wait for the Confluence export process to finish.");
            log.info("This could take a few minutes ...");
            
            String exportedUrl = export(space, isVersion30AndAbove);
            long finished = System.currentTimeMillis();
            log.info(space.getKey() + " (" + space.getType() + ") -> " + exportedUrl);
            log.info(took("Confluence export process for " + space.getKey(), finished - started));
            
            String fileName = fileName(exportedUrl, space);
            log.info("Downloading " + exportedUrl);
            long downloadStarted = System.currentTimeMillis();
            File target =  new File(outputFolder, fileName);
            
            store(exportedUrl, httpClient, sessionId, target);
            log.info(took("Downloading " + target.getName(), System.currentTimeMillis() - downloadStarted));
            log.info(space.getKey() + " (" + space.getType() + ") -> " + target.getAbsolutePath());
            log.info("-----------");
        }
        logout(httpClient);
    }

    protected abstract String
            export(ExportSpace space, boolean isVersion30AndAbove) throws RemoteException, javax.xml.rpc.ServiceException;


    public void store(String exportedSpaceUrl,
                      DefaultHttpClient client,
                      String sessionId,
                      File targetFile) throws IOException {

        HttpGet get = new HttpGet(exportedSpaceUrl);
        get.addHeader("Cookie", "confluence.browse.space.cookie=space-pages; "
                + "confluence.list.pages.cookie=list-content-tree; " + "JSESSIONID=" + sessionId);
        get.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        get.addHeader("Accept-Encoding", "gzip, deflate");

        InputStream content = null;
        try {
            HttpResponse httpResponse = client.execute(get);
            content = httpResponse.getEntity().getContent();
            download(content, targetFile);
        } finally {
            IOUtils.closeQuietly(content);
        }
    }

    
    private void download(InputStream content, File targetFile) throws IOException {
        if (!targetFile.exists()) {
            targetFile.setWritable(true);
            targetFile.getParentFile().mkdirs();
            boolean created = targetFile.createNewFile();
            if (!created) {
                throw new IOException("Unable to create file " + targetFile.getAbsolutePath());
            }
        }
        OutputStream targetStream = null;
        try {
            targetStream = new BufferedOutputStream(new FileOutputStream(targetFile), 1024 * 4);
            IOUtils.copy(content, targetStream);
        } finally {
            IOUtils.closeQuietly(targetStream);
        }
    }

    private String fileName(String exportedUrl, ExportSpace space) {
        if (space.getOutputFileName() == null) {
            String[] splits = exportedUrl.split("/");
            if (splits.length > 0) {
                return splits[splits.length - 1];
            } else {
                throw new IllegalArgumentException("Unable to split the url " + exportedUrl);
            }
        } else {
            return space.getOutputFileName();
        }
    }

    protected String login(DefaultHttpClient client) throws IOException, HttpException {
        HttpPost loginRequest = new HttpPost(confluenceBaseUrl.toExternalForm() + "/login.action");
        HttpResponse response = null;
        try {
            log.debug("Loggin " + user);
            loginRequest.setEntity(buildLoginRequestEntity());
            response = client.execute(loginRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            log.debug("Login finished with status code " + statusCode);
            if (response.getStatusLine().getStatusCode() > 400){
                throw new HttpException("Unable to login to Confluence: " + IOUtils.toString(response.getEntity().getContent()));
            }
        } finally {
            if (response != null) {
               IOUtils.closeQuietly(response.getEntity().getContent());
            }
        }
        String seessionId =  extractSessionId(client);
        log.debug("Got session id " + seessionId);
        return seessionId;
    }
    
    protected boolean logout(DefaultHttpClient client) throws IOException {
        HttpGet logoutRequest = new HttpGet(confluenceBaseUrl.toExternalForm()+ "/logout.action");
        HttpResponse response = null;
        try {
            log.debug("Logging out " + user);
            response = client.execute(logoutRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            log.debug("Logout finished with status code " + statusCode);
            if (response.getStatusLine().getStatusCode() > 400){
                return false;
            }
        } finally {
            if (response != null) {
               IOUtils.closeQuietly(response.getEntity().getContent());
            }
        }
        return true;
    }
    
    /**
     * Extracts the JSESSIONID cookie from the HttpMethod
     * 
     * @param client
     * @return the value of the JSESSIONID cookie
     */
    private String extractSessionId(DefaultHttpClient client) throws HttpException {
        for (org.apache.http.cookie.Cookie cookie : client.getCookieStore().getCookies()) {
            if (cookie.getName().equals("JSESSIONID")) {
                return cookie.getValue();
            }
        }
        throw new HttpException("No JSESSIONID found in Set-Cookie response header.");
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

    protected String took(String prefix, long millis){
        int seconds = (int) (millis / 1000) % 60 ;
        int minutes = (int) ((millis / (1000*60)) % 60);
        int hours   = (int) ((millis / (1000*60*60)) % 24);
        
        StringBuilder took = new StringBuilder(prefix + " took ");
        if (hours != 0){
            took.append((hours + "h "));
            took.append((minutes + "min "));
        } else {
            if (minutes != 0){
                took.append((minutes + "min "));
            }
        }
        took.append(seconds + "seconds");
        
        return took.toString(); 
    }
    
   
}
