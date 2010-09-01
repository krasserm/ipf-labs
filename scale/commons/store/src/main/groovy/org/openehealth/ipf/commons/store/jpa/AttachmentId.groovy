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

import javax.persistence.Embeddable

@Embeddable
class AttachmentId {
    def String docId
    def String attId

    boolean equals(o) {
        if (this.is(o)) return true;

        if (!o || getClass() != o.class) return false;

        final AttachmentId that = (AttachmentId) o;

        if (attId ? !attId.equals(that.attId) : that.attId != null) return false;
        if (docId ? !docId.equals(that.docId) : that.docId != null) return false;

        return true;
    }

    int hashCode() {
        int result;

        result = (docId ? docId.hashCode() : 0);
        result = 31 * result + (attId ? attId.hashCode() : 0);
        return result;
    }
}
