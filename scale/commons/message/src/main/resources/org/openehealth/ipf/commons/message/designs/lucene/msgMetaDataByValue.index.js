 function(doc) {
    if (doc.entityType == "org.openehealth.ipf.commons.message.MessageMetaData") {
        var ret = new Document()
        ret.add(doc.key, {"field":"key"})
        ret.add(doc.value, {"field":"value"})
        var padding = "0000000000000000"
        var order = padding + doc.creationDate
        order = order.substr(order.length - padding.length)
        ret.add(order, {"field":"order"})
        return ret
    }
}
