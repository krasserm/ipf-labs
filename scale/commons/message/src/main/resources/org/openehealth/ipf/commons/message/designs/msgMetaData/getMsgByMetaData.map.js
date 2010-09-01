 function(doc) {
    if (doc.entityType == "org.openehealth.ipf.commons.message.MessageMetaData")
        emit([doc.key, doc.value], doc.msgId)
}
