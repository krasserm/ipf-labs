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
package org.openehealth.ipf.commons.store.jpa

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import org.apache.commons.io.IOUtils
import org.openehealth.ipf.commons.store.DocumentNotFoundException
import org.openehealth.ipf.commons.store.Store
import org.springframework.transaction.annotation.Transactional

class JpaStore implements Store {
    @PersistenceContext
    def EntityManager em

    @Transactional
    void createDocument(Object doc) {
        doc._id = UUID.randomUUID().toString()
        em.persist(doc)
    }

    @Transactional
    void updateDocument(Object doc) {
        em.persist(em.merge(doc))
    }

    @Transactional
    void createOrUpdateDocument(Object doc) {
        doc._id == null ? createDocument(doc) : updateDocument(doc)
    }

    @Transactional
    def getDocument(Class<?> type, String docId) {
        def doc = em.find(type, docId)
        if (doc == null) {
            throw new DocumentNotFoundException("No document found for: $docId")
        }
        doc
    }

    @Transactional
    void deleteDocument(doc) {
        em.remove(em.merge(doc))
    }

    @Transactional
    void createAttachment(Object doc, String attId, String contentType, InputStream inputStream) {
        def att = new Attachment()
        att.id = new AttachmentId(docId: doc._id, attId: attId)
        att.contentType = contentType
        att.data = IOUtils.toByteArray(inputStream)
        em.persist(att)
    }

    @Transactional
    def InputStream getAttachment(String docId, String attId) {
        def att = em.find(Attachment.class, new AttachmentId(docId: docId, attId: attId))
        new ByteArrayInputStream(att.data)
    }
}
