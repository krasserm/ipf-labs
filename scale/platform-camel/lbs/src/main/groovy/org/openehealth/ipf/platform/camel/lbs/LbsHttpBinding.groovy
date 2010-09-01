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
import org.apache.camel.component.http.HttpMessage
import org.openehealth.ipf.commons.store.Store
import org.openehealth.ipf.commons.lbs.StoreDataSource
import org.openehealth.ipf.commons.lbs.StoreDataSourceList
import org.openehealth.ipf.commons.lbs.LbsDocument

import org.openehealth.ipf.commons.lbs.MultipartHelper

class LbsHttpBinding extends org.openehealth.ipf.platform.camel.lbs.MultipartHttpBinding {
    def Store store

    def Object parseBody(HttpMessage httpMessage) {
        def req = httpMessage.request
        def doc = new LbsDocument()
        store.createDocument(doc)
        if (MultipartHelper.isMultipart(req)) {
            def storeList = new StoreDataSourceList()
            MultipartHelper.toDataSources(req) { inputStream, name, contentType ->
                addAttachment(doc, inputStream, name, contentType)
            }.each { storeList.add(it) }
            storeList
        }
        else {
            def safeContentType = MultipartHelper.toSafeContentType(req.contentType)
            def dataSource = addAttachment(doc, req.inputStream, 'content', safeContentType)
            dataSource
        }
    }

    private DataSource addAttachment(doc, InputStream stream, String name, String contentType) {
        store.createAttachment(doc, name, contentType, stream)
        new StoreDataSource(
            docId: doc._id,
            name: name,
            store: store,
            contentType: contentType)
    }
}
