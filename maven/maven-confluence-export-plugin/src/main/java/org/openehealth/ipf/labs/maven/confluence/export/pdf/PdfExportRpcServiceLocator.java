/**
 * PdfExportRpcServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehealth.ipf.labs.maven.confluence.export.pdf;

public class PdfExportRpcServiceLocator extends org.apache.axis.client.Service implements org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfExportRpcService {

    public PdfExportRpcServiceLocator() {
    }


    public PdfExportRpcServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PdfExportRpcServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for pdfexport
    private java.lang.String pdfexport_address = "https://developer.atlassian.com/rpc/soap-axis/pdfexport";

    public java.lang.String getpdfexportAddress() {
        return pdfexport_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String pdfexportWSDDServiceName = "pdfexport";

    public java.lang.String getpdfexportWSDDServiceName() {
        return pdfexportWSDDServiceName;
    }

    public void setpdfexportWSDDServiceName(java.lang.String name) {
        pdfexportWSDDServiceName = name;
    }

    public org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfExportRpc getpdfexport() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(pdfexport_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getpdfexport(endpoint);
    }

    public org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfExportRpc getpdfexport(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub _stub = new org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub(portAddress, this);
            _stub.setPortName(getpdfexportWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setpdfexportEndpointAddress(java.lang.String address) {
        pdfexport_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfExportRpc.class.isAssignableFrom(serviceEndpointInterface)) {
                org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub _stub = new org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub(new java.net.URL(pdfexport_address), this);
                _stub.setPortName(getpdfexportWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("pdfexport".equals(inputPortName)) {
            return getpdfexport();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://developer.atlassian.com/rpc/soap-axis/pdfexport", "PdfExportRpcService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://developer.atlassian.com/rpc/soap-axis/pdfexport", "pdfexport"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("pdfexport".equals(portName)) {
            setpdfexportEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
