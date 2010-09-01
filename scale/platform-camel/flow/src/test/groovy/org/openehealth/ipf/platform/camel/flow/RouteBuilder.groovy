package org.openehealth.ipf.platform.camel.flow

import org.apache.camel.spring.SpringRouteBuilder
import org.openehealth.ipf.platform.camel.core.extend.CoreExtension
import org.openehealth.ipf.platform.camel.message.MessageExtension

class RouteBuilder extends SpringRouteBuilder {

    void configure() {
        use (CoreExtension) { use (MessageExtension) { use (FlowExtension) {

            errorHandler(noErrorHandler())

            from('direct:flow-test-ack')
                .storeMsg()
                .initFlow().application('test-ack')
                .ackFlow()

            from('direct:flow-test-no-ack')
                .storeMsg()
                .initFlow().application('test-no-ack')

            from('direct:flow-test-nak')
                .storeMsg()
                .initFlow().application('test-nak')
                .nakFlow()

            int replayCount = 0
            from('direct:test-replay')
                .storeMsg()
                .initFlow()
                    .application('test-replay')
                .process { ++replayCount }
                .choice()
                    .when { replayCount == 1 }.to('direct:test-replay-nak')
                    .otherwise().to('direct:test-replay-ack')
                .end()

            from('direct:test-replay-nak').nakFlow()
            from('direct:test-replay-ack').ackFlow()

            from('direct:flow-test-multicast')
                .storeMsg()
                .initFlow().application('test-multicast')
                .multicast()
                    .to('direct:flow-test-multicast-1', 'direct:flow-test-multicast-2')
                .end()
                .ackFlow()

            from('direct:flow-test-multicast-1')
                .initFlow().application('test-multicast')
                .ackFlow()

            from('direct:flow-test-multicast-2')
                .initFlow().application('test-multicast')
                .nakFlow()
        }}}
    }
}
