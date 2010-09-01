package org.openehealth.ipf.platform.camel.lbs

import org.apache.camel.Exchange
import org.apache.camel.spring.SpringRouteBuilder
import org.apache.commons.httpclient.methods.PostMethod
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity
import org.apache.commons.httpclient.methods.multipart.Part
import org.apache.commons.httpclient.methods.multipart.StringPart
import org.apache.commons.io.IOUtils
import org.openehealth.ipf.commons.lbs.ByteArrayDataSource
import org.openehealth.ipf.commons.lbs.LbsContext
import org.openehealth.ipf.commons.lbs.MultipartHelper
import org.openehealth.ipf.platform.camel.core.extend.CoreExtension
import org.openehealth.ipf.platform.camel.core.util.Exchanges
import org.openehealth.ipf.platform.camel.message.MessageExtension

class RouteBuilder extends SpringRouteBuilder {

    void configure() {
        use (CoreExtension) {
            use (MessageExtension) {

                errorHandler(noErrorHandler())

                from('direct:storeMsg').storeMsg()
                from('direct:fetchMsg').fetchMsg()

                from('jetty:http://localhost:8080/lbs?httpBindingRef=lbsHttpBinding')
                    .storeMsg()
                    .transform { 'bla' }
                    .fetchMsg()

                from('direct:multipart')
                    .transform {
                        def method = new PostMethod('http://localhost:8080/multipart')
                        Part[] parts = [ new StringPart('part1', 'foo'), new StringPart('part2', 'bar') ]
                        new MultipartRequestEntity(parts, method.params)
                    }
                    .setHeader(Exchange.CONTENT_ENCODING) { 'utf-8' }
                    .to('http://localhost:8080/multipart')
                    .transform {
                        def ctx = new LbsContext(
                            inputStream: it.in.body,
                            contentType: it.in.getHeader(Exchange.CONTENT_TYPE),
                            characterEncoding: it.in.getHeader(Exchange.CONTENT_ENCODING))
                        MultipartHelper.toDataSources(ctx) { inputStream, name, contentType ->
                            new ByteArrayDataSource(
                                bytes: IOUtils.toByteArray(inputStream),
                                name: name,
                                contentType: contentType)
                        }
                    }

                from('jetty:http://localhost:8080/multipart?httpBindingRef=multipartHttpBinding')
                    .process {
                        println "processed $it.in.body.size data sources"
                        Exchanges.prepareResult(it)
                    }
            }
        }
    }
}
