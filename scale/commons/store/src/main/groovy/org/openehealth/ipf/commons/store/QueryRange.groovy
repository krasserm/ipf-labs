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
package org.openehealth.ipf.commons.store

import org.apache.commons.lang.builder.ToStringBuilder
import org.apache.commons.lang.builder.ToStringStyle

class QueryRange {
    def QueryIterator start
    def Integer limit

    boolean equals(o) {
        if (this.is(o)) return true;

        if (!(o instanceof QueryRange)) return false;

        QueryRange that = (QueryRange) o;

        if (limit != that.limit) return false;
        if (start ? !start.equals(that.start) : that.start != null) return false;

        return true;
    }

    int hashCode() {
        int result;

        result = (start ? start.hashCode() : 0);
        result = 31 * result + limit;
        return result;
    }

    @Override
    String toString() {
        ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE)
    }
}
