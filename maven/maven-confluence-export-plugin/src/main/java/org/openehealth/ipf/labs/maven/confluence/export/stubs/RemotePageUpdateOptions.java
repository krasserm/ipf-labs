/**
 * RemotePageUpdateOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehealth.ipf.labs.maven.confluence.export.stubs;

public class RemotePageUpdateOptions  implements java.io.Serializable {
    private boolean minorEdit;

    private java.lang.String versionComment;

    public RemotePageUpdateOptions() {
    }

    public RemotePageUpdateOptions(
           boolean minorEdit,
           java.lang.String versionComment) {
           this.minorEdit = minorEdit;
           this.versionComment = versionComment;
    }


    /**
     * Gets the minorEdit value for this RemotePageUpdateOptions.
     * 
     * @return minorEdit
     */
    public boolean isMinorEdit() {
        return minorEdit;
    }


    /**
     * Sets the minorEdit value for this RemotePageUpdateOptions.
     * 
     * @param minorEdit
     */
    public void setMinorEdit(boolean minorEdit) {
        this.minorEdit = minorEdit;
    }


    /**
     * Gets the versionComment value for this RemotePageUpdateOptions.
     * 
     * @return versionComment
     */
    public java.lang.String getVersionComment() {
        return versionComment;
    }


    /**
     * Sets the versionComment value for this RemotePageUpdateOptions.
     * 
     * @param versionComment
     */
    public void setVersionComment(java.lang.String versionComment) {
        this.versionComment = versionComment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemotePageUpdateOptions)) return false;
        RemotePageUpdateOptions other = (RemotePageUpdateOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.minorEdit == other.isMinorEdit() &&
            ((this.versionComment==null && other.getVersionComment()==null) || 
             (this.versionComment!=null &&
              this.versionComment.equals(other.getVersionComment())));
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
        _hashCode += (isMinorEdit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVersionComment() != null) {
            _hashCode += getVersionComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemotePageUpdateOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePageUpdateOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionComment"));
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
