/**
 * RemoteSpace.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehealth.ipf.labs.maven.confluence.export.stubs.v1;

public class RemoteSpace  extends RemoteSpaceSummary implements java.io.Serializable {
    private java.lang.String description;

    private long homePage;

    private java.lang.String spaceGroup;

    public RemoteSpace() {
    }

    public RemoteSpace(
           java.lang.String key,
           java.lang.String name,
           java.lang.String type,
           java.lang.String url,
           java.lang.String description,
           long homePage,
           java.lang.String spaceGroup) {
        super(
            key,
            name,
            type,
            url);
        this.description = description;
        this.homePage = homePage;
        this.spaceGroup = spaceGroup;
    }


    /**
     * Gets the description value for this RemoteSpace.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteSpace.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the homePage value for this RemoteSpace.
     * 
     * @return homePage
     */
    public long getHomePage() {
        return homePage;
    }


    /**
     * Sets the homePage value for this RemoteSpace.
     * 
     * @param homePage
     */
    public void setHomePage(long homePage) {
        this.homePage = homePage;
    }


    /**
     * Gets the spaceGroup value for this RemoteSpace.
     * 
     * @return spaceGroup
     */
    public java.lang.String getSpaceGroup() {
        return spaceGroup;
    }


    /**
     * Sets the spaceGroup value for this RemoteSpace.
     * 
     * @param spaceGroup
     */
    public void setSpaceGroup(java.lang.String spaceGroup) {
        this.spaceGroup = spaceGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteSpace)) return false;
        RemoteSpace other = (RemoteSpace) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.homePage == other.getHomePage() &&
            ((this.spaceGroup==null && other.getSpaceGroup()==null) || 
             (this.spaceGroup!=null &&
              this.spaceGroup.equals(other.getSpaceGroup())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Long(getHomePage()).hashCode();
        if (getSpaceGroup() != null) {
            _hashCode += getSpaceGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteSpace.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpace"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spaceGroup"));
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
