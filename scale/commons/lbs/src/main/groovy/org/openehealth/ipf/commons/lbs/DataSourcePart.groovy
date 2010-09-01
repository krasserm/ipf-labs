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
package org.openehealth.ipf.commons.lbs

import javax.activation.DataSource
import org.apache.commons.httpclient.methods.multipart.Part
import org.apache.commons.io.IOUtils

class DataSourcePart extends Part {
    def DataSource dataSource

    String getName() {
        dataSource.name
    }

    String getContentType() {
        dataSource.contentType
    }

    String getCharSet() {
        'ISO-8859-1'
    }

    String getTransferEncoding() {
        'binary'
    }

    protected void sendData(OutputStream output) {
        def input = dataSource.inputStream
        try {
            IOUtils.copy(input, output)
        }
        finally {
            input.close()
        }
    }

    protected long lengthOfData() {
        -1
    }
}
