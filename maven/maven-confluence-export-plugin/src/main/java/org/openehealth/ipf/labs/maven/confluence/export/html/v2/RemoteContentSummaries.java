/**
 * RemoteContentSummaries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehealth.ipf.labs.maven.confluence.export.html.v2;

public class RemoteContentSummaries  implements java.io.Serializable {
    private org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummary[] content;

    private int offset;

    private int totalAvailable;

    public RemoteContentSummaries() {
    }

    public RemoteContentSummaries(
           org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummary[] content,
           int offset,
           int totalAvailable) {
           this.content = content;
           this.offset = offset;
           this.totalAvailable = totalAvailable;
    }


    /**
     * Gets the content value for this RemoteContentSummaries.
     * 
     * @return content
     */
    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummary[] getContent() {
        return content;
    }


    /**
     * Sets the content value for this RemoteContentSummaries.
     * 
     * @param content
     */
    public void setContent(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummary[] content) {
        this.content = content;
    }


    /**
     * Gets the offset value for this RemoteContentSummaries.
     * 
     * @return offset
     */
    public int getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this RemoteContentSummaries.
     * 
     * @param offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }


    /**
     * Gets the totalAvailable value for this RemoteContentSummaries.
     * 
     * @return totalAvailable
     */
    public int getTotalAvailable() {
        return totalAvailable;
    }


    /**
     * Sets the totalAvailable value for this RemoteContentSummaries.
     * 
     * @param totalAvailable
     */
    public void setTotalAvailable(int totalAvailable) {
        this.totalAvailable = totalAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteContentSummaries)) return false;
        RemoteContentSummaries other = (RemoteContentSummaries) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              java.util.Arrays.equals(this.content, other.getContent()))) &&
            this.offset == other.getOffset() &&
            this.totalAvailable == other.getTotalAvailable();
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
        if (getContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getOffset();
        _hashCode += getTotalAvailable();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteContentSummaries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentSummaries"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentSummary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
