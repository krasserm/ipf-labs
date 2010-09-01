package org.openehealth.ipf.platform.camel.message

import org.apache.camel.spring.SpringRouteBuilder
import org.openehealth.ipf.platform.camel.core.extend.CoreExtension

class RouteBuilder extends SpringRouteBuilder {

    void configure() {
        use (CoreExtension) {
            use (MessageExtension) {

                errorHandler(noErrorHandler())

                from('direct:storeMsg').storeMsg()
                from('direct:fetchMsg').fetchMsg()
                from('direct:deleteMsg').deleteMsg()

                from('direct:storeMessageMetaData')
                    .storeMsg()
                    .storeMetaData { [testkey1: it.in.getBody(String), testkey2: 'testvalue2'] }

                from('direct:storeMsgWithIdentifier').storeMsg().identifier('foo')
            }
        }
    }
}