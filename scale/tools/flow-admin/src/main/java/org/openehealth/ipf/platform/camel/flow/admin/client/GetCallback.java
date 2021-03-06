/*
 * Copyright 2009 the original author or authors.
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
package org.openehealth.ipf.platform.camel.flow.admin.client;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.Response;

public abstract class GetCallback extends RestCallback {
    public void onResponseReceived(Request request, Response response) {
        int status = response.getStatusCode();
        if (status != 200) {
            showErrorDialog(SERVER_ERROR + status + "(GET)");
        }
        else {
            try {
                onSuccess(response);
            }
            catch (Throwable e) {
                onError(request, e);
            }
        }
    }

    protected abstract void onSuccess(Response response);
}
