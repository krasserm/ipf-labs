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
package org.openehealth.ipf.commons.store;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.persistence.Version;
import java.util.List;
import java.util.Map;

@MappedSuperclass
public abstract class StoredEntity {
    @Id
    @Column(name="id")
    private String _id;
    @Transient
    private String _rev;
    private Map<String, Object> _attachments;
    @Version
    private Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public Map<String, Object> get_attachments() {
        return _attachments;
    }

    public void set_attachments(Map<String, Object> _attachments) {
        this._attachments = _attachments;
    }

    public abstract Class<?> getEntityType();

    public void setEntityType(Class<?> entityType) {
        if (entityType != getEntityType()) {
            throw new AssertionError("Unexpected entity type '" + entityType.getName() + "' set on class '" + getEntityType().getName() + "'"); 
        }
    }
}
