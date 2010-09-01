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
package org.openehealth.ipf.commons.lbs

import org.openehealth.ipf.commons.store.Store
import org.openehealth.ipf.commons.utils.stream.Use

class StoreDataSourceConversion {
    def Store store

    InputStream convertToStream(StoreDataSource msg) {
        Use.use(new ByteArrayOutputStream()) { ByteArrayOutputStream out ->
            Use.use(new ObjectOutputStream(out)) { ObjectOutputStream oos ->
                oos.writeObject(msg.docId)
                oos.writeObject(msg.name)
                oos.writeObject(msg.contentType)
                new ByteArrayInputStream(out.toByteArray())
            }
        }
    }

    StoreDataSource convertToMsg(InputStream inputStream, StoreDataSource dummy) {
        def ois = new ObjectInputStream(inputStream)
        String docId = (String)ois.readObject()
        String attId = (String)ois.readObject()
        String contentType = (String)ois.readObject()
        new StoreDataSource(
            docId: docId,
            name: attId,
            store: store,
            contentType: contentType)
    }
}