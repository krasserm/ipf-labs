 function(doc) {
    if (doc.entityType == "org.openehealth.ipf.commons.message.MessageMetaData")
        emit([doc.msgId, doc.key], doc);
}