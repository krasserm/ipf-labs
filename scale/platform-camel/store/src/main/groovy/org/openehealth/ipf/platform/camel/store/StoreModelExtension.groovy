package org.openehealth.ipf.platform.camel.store

import org.apache.camel.model.ProcessorDefinition

class StoreModelExtension {
    static extensions = {
        ProcessorDefinition.mixin StoreExtension
    }
}
