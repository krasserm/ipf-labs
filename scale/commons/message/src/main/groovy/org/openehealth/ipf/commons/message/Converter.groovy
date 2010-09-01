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

class Converter {
    static void registerConversion(strategy) {
        Conversions.metaClass.convertToStream = strategy.&convertToStream
        Conversions.metaClass.convertToMsg = strategy.&convertToMsg
    }

    static InputStream convertToStream(Object msg) {
        def conversions = new Conversions()
        def isNull = (Boolean)(msg == null)
        def inputStream = (InputStream)conversions.convertToStream(isNull)
        isNull ? inputStream : join(inputStream, conversions.convertToStream(msg))
    }

    static InputStream join(InputStream... streams) {
        join(Arrays.asList(streams))
    }

    static InputStream join(List streams) {
        new SequenceInputStream(Collections.enumeration(streams))
    }

    static def convertToMsg(InputStream inputStream, Class<?> msgType) {
        def conversions = new Conversions()
        def method = Conversions.metaClass.pickMethod('convertToMsg', InputStream, Boolean)
        def isNull = (Boolean)method.invoke(conversions, inputStream, null)
        if (isNull) {
            return null
        }

        method = Conversions.metaClass.pickMethod('convertToMsg', InputStream, msgType)
        def content = method.invoke(conversions, inputStream, null)
        msgType.cast(content)
    }
}
