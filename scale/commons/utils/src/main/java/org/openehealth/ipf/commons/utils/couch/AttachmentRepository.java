package org.openehealth.ipf.commons.utils.couch;

import java.io.InputStream;

public interface AttachmentRepository {
    JsonWebResource getResource();
    JsonParser getParser();

    String set(String docId, String rev, String attId, String contentType, InputStream content);
    InputStream get(String docId, String attId);
    InputStream get(String docId, String rev, String attId);
    String delete(String docId, String rev, String attId);
}
