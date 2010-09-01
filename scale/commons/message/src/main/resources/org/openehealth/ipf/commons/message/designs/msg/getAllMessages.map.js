 function(doc) {
    if (doc.entityType == "org.openehealth.ipf.commons.message.Message")
        emit(doc.creationDate, doc);
}