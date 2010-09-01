package org.openehealth.ipf.platform.camel.store

import org.apache.camel.spring.SpringRouteBuilder
import org.openehealth.ipf.platform.camel.core.extend.CoreExtension

class RouteBuilder extends SpringRouteBuilder {

    void configure() {
        use (CoreExtension) {
            use (StoreExtension) {

                errorHandler(noErrorHandler())

                from('direct:storeDoc').store().store('ipf.store')
                from('direct:fetchDoc').fetch().id { it.in.body }.type(SomeTestEntity).store('ipf.store')
                from('direct:deleteDoc').delete().id { it.in.body }.type(SomeTestEntity).store('ipf.store')

                from('direct:storeDoc_nodb').store()
            }
        }
    }
}
