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
package org.openehealth.ipf.commons.message

import org.openehealth.ipf.commons.utils.stream.Use

class ObjectConversion {
    InputStream convertToStream(Object msg) {
        Use.use(new ByteArrayOutputStream()) { ByteArrayOutputStream out ->
            Use.use(new ObjectOutputStream(out)) { ObjectOutputStream oos ->
                oos.writeObject(msg)
                new ByteArrayInputStream(out.toByteArray())
            }
        }
    }

    Object convertToMsg(InputStream inputStream, Object dummy) {
        new ObjectInputStream(inputStream).readObject()
    }
}