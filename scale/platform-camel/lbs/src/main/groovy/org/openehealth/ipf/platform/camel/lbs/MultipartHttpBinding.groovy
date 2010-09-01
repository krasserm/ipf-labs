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
package org.openehealth.ipf.platform.camel.lbs

import javax.activation.DataSource
import javax.servlet.http.HttpServletResponse
import org.apache.camel.Exchange
import org.apache.camel.Message
import org.apache.camel.component.http.DefaultHttpBinding
import org.apache.camel.component.http.HttpMessage
import org.apache.commons.httpclient.methods.multipart.Part
import org.apache.commons.io.IOUtils
import org.openehealth.ipf.commons.lbs.ByteArrayDataSource
import org.openehealth.ipf.commons.lbs.DataSourcePart
import org.openehealth.ipf.commons.lbs.MultipartHelper

class MultipartHttpBinding extends DefaultHttpBinding {
    private static String CONTENT_TYPE = 'multipart/form-data'

    def Object parseBody(HttpMessage httpMessage) {
        MultipartHelper.toDataSources(httpMessage.request) { inputStream, name, contentType ->
            new ByteArrayDataSource(
                bytes: IOUtils.toByteArray(inputStream),
                name: name,
                contentType: contentType)
        } 
    }

    def void doWriteResponse(Message message, HttpServletResponse response, Exchange exchange) {
        if (message.body instanceof List) {
            response.contentType = CONTENT_TYPE
        }
        else if (message.body instanceof DataSource) {
            response.contentType = message.body.contentType
        }
        super.doWriteResponse(message, response, exchange)
    }

    protected void doWriteDirectResponse(Message message, HttpServletResponse response, Exchange exchange) {
        if (message.body instanceof List) {
            def boundary = MultipartHelper.getBoundary(response.contentType)
            def parts = message.body.collect { new DataSourcePart(dataSource: it) }
            Part.sendParts(response.outputStream, parts.toArray(new Part[parts.size()]), boundary.bytes)
        }
        else if (message.body instanceof DataSource) {
            message.body = message.body.inputStream
            super.doWriteDirectResponse(message, response, exchange)
        }
        else {
            super.doWriteDirectResponse(message, response, exchange)
        }
    }
}
