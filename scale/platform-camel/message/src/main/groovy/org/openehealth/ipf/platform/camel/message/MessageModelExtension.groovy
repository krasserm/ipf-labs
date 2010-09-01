package org.openehealth.ipf.platform.camel.message

import org.apache.camel.model.ProcessorDefinition

class MessageModelExtension {
    static extensions = {
        ProcessorDefinition.mixin MessageExtension
    }
}