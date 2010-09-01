package org.openehealth.ipf.commons.utils.couch.impl

class ConflictException extends RuntimeException {
    def final String docId

    def ConflictException(String docId) {
        super('Conflict detected for document ID: ' + docId)
        this.docId = docId
    }
}
