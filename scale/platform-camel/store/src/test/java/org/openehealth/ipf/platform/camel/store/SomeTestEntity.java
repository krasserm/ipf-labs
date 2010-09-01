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
package org.openehealth.ipf.platform.camel.store;

import org.openehealth.ipf.commons.store.StoredEntity;

import javax.persistence.Entity;

@Entity
public class SomeTestEntity extends StoredEntity {
    private String foo;
    private String foofoo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getFoofoo() {
        return foofoo;
    }

    public void setFoofoo(String foofoo) {
        this.foofoo = foofoo;
    }

    @Override
    public Class<?> getEntityType() {
        return SomeTestEntity.class;
    }
}
