function(doc) {
    if (doc.entityType == "org.openehealth.ipf.commons.flow.Flow")
        emit([doc.msgId, doc.creationDate], doc);
}
