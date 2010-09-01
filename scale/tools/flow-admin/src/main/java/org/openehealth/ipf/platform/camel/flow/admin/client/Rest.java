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

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;

public class Rest {
    private final String url;

    public Rest(String url) {
        this.url = url;
    }

    public void get(RequestCallback callback) {
        try {
            RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, url);
            builder.setHeader("Cache-Control", "no-cache");
            builder.sendRequest(null, callback);
        }
        catch (RequestException e) {
            callback.onError(null, e);
        }
    }

    public void post(String content, RequestCallback callback) {
        try {
            RequestBuilder builder = new RequestBuilder(RequestBuilder.POST, url);
            builder.setHeader("Cache-Control", "no-cache");
            builder.setHeader("Content-Type", "application/json");
            builder.sendRequest(content, callback);
        }
        catch (RequestException e) {
            callback.onError(null, e);
        }
    }

    public void delete(RequestCallback callback) {
        try {
            RequestBuilder builder = new WorkaroundRequestBuilder("delete", url);
            builder.setHeader("Cache-Control", "no-cache");
            builder.sendRequest(null, callback);
        }
        catch (RequestException e) {
            callback.onError(null, e);
        }
    }

    private static class WorkaroundRequestBuilder extends RequestBuilder {
        private WorkaroundRequestBuilder(String method, String url) {
            super(method, url);
        }
    }
}
