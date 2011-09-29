/**
 * RemoteContentSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehealth.ipf.labs.maven.confluence.export.stubs.v2;

public class RemoteContentSummary  implements java.io.Serializable {
    private java.util.Calendar created;

    private java.lang.String creator;

    private long id;

    private java.util.Calendar modified;

    private java.lang.String modifier;

    private java.lang.String space;

    private java.lang.String status;

    private java.lang.String title;

    private java.lang.String type;

    public RemoteContentSummary() {
    }

    public RemoteContentSummary(
           java.util.Calendar created,
           java.lang.String creator,
           long id,
           java.util.Calendar modified,
           java.lang.String modifier,
           java.lang.String space,
           java.lang.String status,
           java.lang.String title,
           java.lang.String type) {
           this.created = created;
           this.creator = creator;
           this.id = id;
           this.modified = modified;
           this.modifier = modifier;
           this.space = space;
           this.status = status;
           this.title = title;
           this.type = type;
    }


    /**
     * Gets the created value for this RemoteContentSummary.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this RemoteContentSummary.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the creator value for this RemoteContentSummary.
     * 
     * @return creator
     */
    public java.lang.String getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this RemoteContentSummary.
     * 
     * @param creator
     */
    public void setCreator(java.lang.String creator) {
        this.creator = creator;
    }


    /**
     * Gets the id value for this RemoteContentSummary.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this RemoteContentSummary.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the modified value for this RemoteContentSummary.
     * 
     * @return modified
     */
    public java.util.Calendar getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this RemoteContentSummary.
     * 
     * @param modified
     */
    public void setModified(java.util.Calendar modified) {
        this.modified = modified;
    }


    /**
     * Gets the modifier value for this RemoteContentSummary.
     * 
     * @return modifier
     */
    public java.lang.String getModifier() {
        return modifier;
    }


    /**
     * Sets the modifier value for this RemoteContentSummary.
     * 
     * @param modifier
     */
    public void setModifier(java.lang.String modifier) {
        this.modifier = modifier;
    }


    /**
     * Gets the space value for this RemoteContentSummary.
     * 
     * @return space
     */
    public java.lang.String getSpace() {
        return space;
    }


    /**
     * Sets the space value for this RemoteContentSummary.
     * 
     * @param space
     */
    public void setSpace(java.lang.String space) {
        this.space = space;
    }


    /**
     * Gets the status value for this RemoteContentSummary.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RemoteContentSummary.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the title value for this RemoteContentSummary.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this RemoteContentSummary.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the type value for this RemoteContentSummary.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this RemoteContentSummary.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteContentSummary)) return false;
        RemoteContentSummary other = (RemoteContentSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              this.creator.equals(other.getCreator()))) &&
            this.id == other.getId() &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified()))) &&
            ((this.modifier==null && other.getModifier()==null) || 
             (this.modifier!=null &&
              this.modifier.equals(other.getModifier()))) &&
            ((this.space==null && other.getSpace()==null) || 
             (this.space!=null &&
              this.space.equals(other.getSpace()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCreator() != null) {
            _hashCode += getCreator().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getModifier() != null) {
            _hashCode += getModifier().hashCode();
        }
        if (getSpace() != null) {
            _hashCode += getSpace().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteContentSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("space");
        elemField.setXmlName(new javax.xml.namespace.QName("", "space"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
