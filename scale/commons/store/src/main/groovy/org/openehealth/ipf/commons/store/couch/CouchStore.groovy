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
package org.openehealth.ipf.commons.store.couch

import org.openehealth.ipf.commons.utils.couch.AttachmentRepository
import org.openehealth.ipf.commons.utils.couch.Database
import org.openehealth.ipf.commons.utils.couch.DocumentRepository
import org.openehealth.ipf.commons.utils.couch.impl.DefaultAttachmentRepository
import org.openehealth.ipf.commons.utils.couch.impl.DefaultDocumentRepository
import org.openehealth.ipf.commons.store.DocumentNotFoundException
import org.openehealth.ipf.commons.store.Store

class CouchStore implements Store {
    def Database database
    def DocumentRepository docRepo
    def AttachmentRepository attRepo

    void setDatabase(Database database) {
        this.database = database
        docRepo = new DefaultDocumentRepository(database)
        attRepo = new DefaultAttachmentRepository(database)
    }

    void createDocument(doc) {
        docRepo.create(doc)
    }

    void updateDocument(doc) {
        docRepo.update(doc)
    }

    void createOrUpdateDocument(doc) {
        doc._id == null ? createDocument(doc) : updateDocument(doc)
    }

    def getDocument(Class<?> type, String docId) {
        def result = docRepo.get(docId, type)
        if (result == null) {
            throw new DocumentNotFoundException("No document found for: $docId")
        }
        result
    }

    void deleteDocument(doc) {
        docRepo.delete(doc)
    }

    void createAttachment(doc, String attId, String contentType, InputStream inputStream) {
        doc._rev = attRepo.set(doc._id, doc._rev, attId, contentType, inputStream)
    }

    InputStream getAttachment(String docId, String attId) {
        attRepo.get(docId, attId)
    }
}
