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
package org.openehealth.ipf.commons.message;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.openehealth.ipf.commons.store.StoredEntity;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(name="msg/getAllMessages", query="SELECT m FROM Message m ORDER BY m.creationDate"),
    @NamedQuery(name="msg/getMsgByApp", query="SELECT m FROM Message m WHERE m.application=:key ORDER BY m.creationDate")
})
public class Message extends StoredEntity {
    private long creationDate;
    private Class<?> msgType;
    private String identifier;
    private int replayCount;
    private String application;

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public Class<?> getMsgType() {
        return msgType;
    }

    public void setMsgType(Class<?> msgType) {
        this.msgType = msgType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getReplayCount() {
        return replayCount;
    }

    public void setReplayCount(int replayCount) {
        this.replayCount = replayCount;
    }

    @Override
    public Class<?> getEntityType() {
        return Message.class;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;

        final Message message = (Message) o;

        return creationDate == message.creationDate
            && replayCount == message.replayCount
            && !(application != null ? !application.equals(message.application) : message.application != null)
            && !(identifier != null ? !identifier.equals(message.identifier) : message.identifier != null)
            && !(msgType != null ? !msgType.equals(message.msgType) : message.msgType != null);
    }

    @Override
    public int hashCode() {
        int result = (int) (creationDate ^ (creationDate >>> 32));
        result = 31 * result + (msgType != null ? msgType.hashCode() : 0);
        result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
        result = 31 * result + replayCount;
        result = 31 * result + (application != null ? application.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
