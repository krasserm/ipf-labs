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

import java.net.URL;
import java.util.Map;

/**
 * @author Mitko Kolev
 * 
 */
public class Export {

    protected long exportTimeout = 120000;

    protected URL url;

    protected String space;

    private String user;

    private String password;

    private String [] exportFormats;

    public long getExportTimeout() {
        return exportTimeout;
    }

    public void setExportTimeout(long exportTimeout) {
        this.exportTimeout = exportTimeout;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getExportFormats() {
        return exportFormats;
    }

    public void setExportFormats(String[] exportFormats) {
        this.exportFormats = exportFormats;
    }

    public void validate(){
        StringBuilder validationFailureMsg = new StringBuilder();
        if (space == null || space.length() == 0){
            validationFailureMsg.append("The confluence space to export is not set. Configure <space> ... </space> to configure it.\n");
        }
        if (url == null){
            validationFailureMsg.append("The confluence URL is not set. Configure <url> ... </url> to configure it.\n");
        }
        if (user == null || user.length() == 0){
            validationFailureMsg.append("The confluence export user is not set. Configure the <user> ... </user> element!\n");
        }
        if (password == null || password.length() == 0){
            validationFailureMsg.append("The confluence export user password is not set. Configure <password>${secret}</password> to configure it.");
            validationFailureMsg.append("Do not hard-code the password in the pom. Use a system property!\n");
        }
        if (exportFormats == null || exportFormats.length == 0){
            validationFailureMsg.append("The export formats are not set. Configure exportFormats with one of xml, pdf, html. For example <exportFormats><param>html</param><param>pdf</param><param>xml</param></exportFormats>");
        }
        if (!validationFailureMsg.toString().isEmpty()){
            throw new RuntimeException("Invalid export configuration: " + validationFailureMsg.toString());
        }
    }
}
