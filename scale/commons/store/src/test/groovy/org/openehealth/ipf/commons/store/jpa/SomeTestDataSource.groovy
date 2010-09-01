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

import java.sql.DriverManager
import java.sql.SQLNonTransientConnectionException
import org.apache.derby.impl.io.VFMemoryStorageFactory
import org.springframework.jdbc.datasource.DriverManagerDataSource

class SomeTestDataSource extends DriverManagerDataSource {
    void deleteDb() {
        def name = url.split(':memory:')[1].split(';')[0]

        try {
            DriverManager.getConnection("jdbc:derby:memory:$name;shutdown=true").close()
        } catch (SQLNonTransientConnectionException ex) {
            if (ex.errorCode != 45000) {
                throw ex
            }
            // Shutdown success
        }
        VFMemoryStorageFactory.purgeDatabase(new File(name).canonicalPath)
    }
}
