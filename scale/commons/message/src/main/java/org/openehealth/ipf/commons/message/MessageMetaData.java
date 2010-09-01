package org.openehealth.ipf.commons.message;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.openjpa.persistence.jdbc.Index;
import org.openehealth.ipf.commons.store.StoredEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
        @NamedQuery(name = "msgMetaData/getMetaDataByMsgId", query = "SELECT m FROM MessageMetaData m WHERE m.msgId=:key ORDER BY m.key"),
        @NamedQuery(name = "lucene/msgMetaDataByValue", query = "SELECT m FROM MessageMetaData m WHERE m.key=:key AND UPPER(m.value) LIKE :value ORDER BY m.creationDate")
})
public class MessageMetaData extends StoredEntity {
    @Index @Column(name = "metaDataKey") private String key;
    @Index @Column(name = "metaDataValue") private String value;
    @Index private long creationDate;

    private String msgId;

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageMetaData)) return false;

        MessageMetaData that = (MessageMetaData) o;

        if (creationDate != that.creationDate) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (msgId != null ? !msgId.equals(that.msgId) : that.msgId != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (int) (creationDate ^ (creationDate >>> 32));
        result = 31 * result + (msgId != null ? msgId.hashCode() : 0);
        return result;
    }

    @Override
    public Class<?> getEntityType() {
        return MessageMetaData.class;
    }
}
