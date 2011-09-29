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

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.maven.plugin.logging.Log;
import org.openehealth.ipf.labs.maven.confluence.export.stubs.AuthenticationFailedException;
import org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException;

/**
 * @author Mitko Kolev
 *
 */
public class ConfluenceV2ExportTemplate extends ConfluenceExportTemplate {

    /* (non-Javadoc)
     * @see org.openehealth.ipf.labs.maven.confluence.export.ConfluenceExportTemplate#exportSpace(org.apache.http.impl.client.DefaultHttpClient, java.net.URL, java.lang.String, java.lang.String, org.openehealth.ipf.labs.maven.confluence.export.Space)
     */
    @Override
    public void exportSpace(DefaultHttpClient client,
                            URL url,
                            String user,
                            String passwrod,
                            Space space,  Log log) throws AuthenticationFailedException,
                                        RemoteException,
                                        java.rmi.RemoteException {
        // TODO Auto-generated method stub
        
    }

}
