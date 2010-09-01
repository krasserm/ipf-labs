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

import org.apache.commons.io.IOUtils
import org.junit.Before
import org.junit.Test
import org.openehealth.ipf.commons.utils.stream.Use
import static org.junit.Assert.assertEquals

class ConverterTest {
    @Before
    void setUp() {
        Converter.registerConversion(new StringConversion())
        Converter.registerConversion(new ObjectConversion())
    }

    @Test
    void testConversionOfStringToStream() {
        Use.use(Converter.convertToStream('test')) { InputStream it ->
            assertEquals(false, new ObjectInputStream(it).readObject())
            assertEquals('test\0', IOUtils.toString(it))
        }
    }

    @Test
    void testConversionOfObjectToStream() {
        Use.use(Converter.convertToStream(1500L)) { InputStream it ->
            assertEquals(false, new ObjectInputStream(it).readObject())
            assertEquals(1500L, new ObjectInputStream(it).readObject())
        }
    }

    @Test
    void testConversionOfStreamToString() {
        def out = new ByteArrayOutputStream()
        new ObjectOutputStream(out).writeObject(false)
        def stream = Converter.join(new ByteArrayInputStream(out.toByteArray()), IOUtils.toInputStream("test"))
        Use.use(stream) {
            assertEquals('test', Converter.convertToMsg(it, String.class))
        }
    }

    @Test
    void testConversionOfStreamToObject() {
        def out = new ByteArrayOutputStream()
        new ObjectOutputStream(out).writeObject(false)
        new ObjectOutputStream(out).writeObject(1500L)
        Use.use(new ByteArrayInputStream(out.toByteArray())) {
            assertEquals(1500L, Converter.convertToMsg(it, Long.class))
        }
    }
}
