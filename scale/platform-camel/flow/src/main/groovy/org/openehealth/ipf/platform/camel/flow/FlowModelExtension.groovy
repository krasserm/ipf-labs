package org.openehealth.ipf.platform.camel.flow

import org.apache.camel.model.ProcessorDefinition

class FlowModelExtension {
    static extensions = {
        ProcessorDefinition.mixin FlowExtension
    }
}
