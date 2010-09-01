 function(doc) {
    if (doc.entityType == "org.openehealth.ipf.commons.message.Message")
        emit([doc.application, doc.creationDate], doc); 
}
