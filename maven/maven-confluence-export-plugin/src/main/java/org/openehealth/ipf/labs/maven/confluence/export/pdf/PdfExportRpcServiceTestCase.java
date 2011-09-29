/**
 * PdfExportRpcServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehealth.ipf.labs.maven.confluence.export.pdf;

public class PdfExportRpcServiceTestCase extends junit.framework.TestCase {
    public PdfExportRpcServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testpdfexportWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfExportRpcServiceLocator().getpdfexportAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfExportRpcServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1pdfexportExportSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfExportRpcServiceLocator().getpdfexport();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            java.lang.String value = null;
            value = binding.exportSpace(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.pdf.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test2pdfexportLogin() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfExportRpcServiceLocator().getpdfexport();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            java.lang.String value = null;
            value = binding.login(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.pdf.AuthenticationFailedException e1) {
            throw new junit.framework.AssertionFailedError("AuthenticationFailedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.pdf.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test3pdfexportLogout() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfExportRpcServiceLocator().getpdfexport();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            boolean value = false;
            value = binding.logout(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.pdf.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
