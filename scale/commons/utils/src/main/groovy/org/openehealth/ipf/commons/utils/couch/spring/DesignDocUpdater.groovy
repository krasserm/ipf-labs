package org.openehealth.ipf.commons.utils.couch.spring

import org.openehealth.ipf.commons.utils.couch.Database
import org.openehealth.ipf.commons.utils.couch.impl.DefaultDocumentRepository
import org.apache.commons.io.IOUtils
import org.openehealth.ipf.commons.utils.stream.Use

class DesignDocUpdater {
    def Database db
    def String designDocId
    def Map<String, String> resources

    void update() {
        def docRepo = new DefaultDocumentRepository(db)
        def designDoc = getDesignDoc(docRepo)
        def loader = getClass().classLoader
        resources.each { String section, String resource ->
            def content = Use.use(loader.getResourceAsStream(resource)) { IOUtils.toString(it) }
            define(designDoc, section, content)
        }
        docRepo.updateIfChanged(designDoc)
    }

    void define(Map designDoc, String section, String content) {
        def sectionParts = new ArrayList(Arrays.asList(section.split('/')))
        def resourceName = sectionParts.pop()
        def lastSection = sectionParts.inject(designDoc) { obj, String it ->
            if (obj[it] == null) {
                obj[it] = [:]
            }
            obj[it]
        }
        lastSection[resourceName] = content
    }

    private def getDesignDoc(DefaultDocumentRepository docRepo) {
        docRepo.get(designDocId, Map.class) ?: [_id: designDocId, views: [:]]
    }
}
