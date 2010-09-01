/*
 * Copyright 2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.commons.store.jpa

import javax.persistence.spi.PersistenceUnitInfo
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager
import org.springframework.orm.jpa.persistenceunit.MutablePersistenceUnitInfo

class MergingPersistenceUnitManager implements PersistenceUnitManager, ApplicationContextAware {
    def persistenceUnitManagers

    void setApplicationContext(ApplicationContext applicationContext) {
        persistenceUnitManagers = applicationContext.getBeansOfType(PersistenceUnitManager).values().findAll { it != this }
    }

    PersistenceUnitInfo obtainDefaultPersistenceUnitInfo() {
        def aggregate = new MutablePersistenceUnitInfo()
        persistenceUnitManagers.eachWithIndex { PersistenceUnitManager it, int idx ->
            merge(it.obtainDefaultPersistenceUnitInfo(), aggregate, idx == 0)
        }
        aggregate
    }

    PersistenceUnitInfo obtainPersistenceUnitInfo(String persistenceUnitName) {
        def aggregate = new MutablePersistenceUnitInfo()
        persistenceUnitManagers.eachWithIndex { PersistenceUnitManager it, int idx ->
            merge(it.obtainPersistenceUnitInfo(persistenceUnitName), aggregate, idx == 0)
        }
        aggregate
    }

    private void merge(PersistenceUnitInfo pui, MutablePersistenceUnitInfo aggregate, boolean first) {
        if (!first) {
            equals(aggregate.persistenceUnitName, pui.persistenceUnitName)
            equals(aggregate.persistenceProviderClassName, pui.persistenceProviderClassName)
            equals(aggregate.transactionType, pui.transactionType)
            equals(aggregate.jtaDataSource, pui.jtaDataSource)
            equals(aggregate.nonJtaDataSource, pui.nonJtaDataSource)
            equals(aggregate.excludeUnlistedClasses(), pui.excludeUnlistedClasses())

            aggregate.addJarFileUrl(pui.persistenceUnitRootUrl)
        }
        else {
            aggregate.persistenceUnitRootUrl = pui.persistenceUnitRootUrl
        }

        pui.jarFileUrls.each {URL url -> aggregate.addJarFileUrl(url) }
        pui.mappingFileNames.each {String name -> aggregate.addMappingFileName(name) }
        pui.managedClassNames.each {String name -> aggregate.addManagedClassName(name) }
        pui.getProperties().each {String key, String value -> aggregate.getProperties().setProperty(key, value) }

        aggregate.persistenceUnitName = pui.persistenceUnitName
        aggregate.persistenceProviderClassName = pui.persistenceProviderClassName
        aggregate.transactionType = pui.transactionType
        aggregate.jtaDataSource = pui.jtaDataSource
        aggregate.nonJtaDataSource = pui.nonJtaDataSource
        aggregate.excludeUnlistedClasses = pui.excludeUnlistedClasses()
    }

    private void equals(obj1, obj2) {
        assert obj1 != null ? obj1.equals(obj2) : obj2 == null
    }
}
