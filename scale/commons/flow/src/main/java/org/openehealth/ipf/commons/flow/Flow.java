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
package org.openehealth.ipf.commons.flow;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.openjpa.persistence.jdbc.Index;
import org.openehealth.ipf.commons.store.StoredEntity;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
        @NamedQuery(name = "flow/getAllFlows", query = "SELECT f FROM Flow f ORDER BY f.creationDate"),
        @NamedQuery(name = "flow/getAllApplications", query = "SELECT DISTINCT f.application FROM Flow f ORDER BY f.application"),
        @NamedQuery(name = "flow/getFlowsByApp", query = "SELECT f FROM Flow f WHERE f.application=:key ORDER BY f.creationDate"),
        @NamedQuery(name = "flow/getFlowsByMessage", query = "SELECT f FROM Flow f WHERE f.msgId=:key ORDER BY f.creationDate")
})
public class Flow extends StoredEntity {
    @Index
    private String application;
    private boolean ack;
    private boolean nak;
    private String msgId;
    private String parentFlowId;
    @Index
    private long creationDate;

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public boolean isAck() {
        return ack;
    }

    public void setAck(boolean ack) {
        this.ack = ack;
    }

    public boolean isNak() {
        return nak;
    }

    public void setNak(boolean nak) {
        this.nak = nak;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getParentFlowId() {
        return parentFlowId;
    }

    public void setParentFlowId(String parentFlowId) {
        this.parentFlowId = parentFlowId;
    }

    @Override
    public Class<?> getEntityType() {
        return Flow.class;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flow)) return false;

        final Flow flow = (Flow) o;

        return ack == flow.ack
            && creationDate == flow.creationDate
            && nak == flow.nak
            && !(application != null ? !application.equals(flow.application) : flow.application != null)
            && !(msgId != null ? !msgId.equals(flow.msgId) : flow.msgId != null)
            && !(parentFlowId != null ? !parentFlowId.equals(flow.parentFlowId) : flow.parentFlowId != null);
    }

    @Override
    public int hashCode() {
        int result = application != null ? application.hashCode() : 0;
        result = 31 * result + (ack ? 1 : 0);
        result = 31 * result + (nak ? 1 : 0);
        result = 31 * result + (msgId != null ? msgId.hashCode() : 0);
        result = 31 * result + (parentFlowId != null ? parentFlowId.hashCode() : 0);
        result = 31 * result + (int) (creationDate ^ (creationDate >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
