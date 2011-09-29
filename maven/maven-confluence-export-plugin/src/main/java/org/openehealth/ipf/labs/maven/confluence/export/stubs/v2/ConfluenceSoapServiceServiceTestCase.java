/**
 * ConfluenceSoapServiceServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehealth.ipf.labs.maven.confluence.export.stubs.v2;

public class ConfluenceSoapServiceServiceTestCase extends junit.framework.TestCase {
    public ConfluenceSoapServiceServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testConfluenceserviceV2WSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2Address() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1ConfluenceserviceV2GetPermissions() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            java.lang.String[] value = null;
            value = binding.getPermissions(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test2ConfluenceserviceV2Search() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSearchResult[] value = null;
            value = binding.search(new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test3ConfluenceserviceV2Search() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSearchResult[] value = null;
            value = binding.search(new java.lang.String(), new java.lang.String(), new java.util.HashMap(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test4ConfluenceserviceV2GetSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpace value = null;
            value = binding.getSpace(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test5ConfluenceserviceV2GetComment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteComment value = null;
            value = binding.getComment(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test6ConfluenceserviceV2GetChildren() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePageSummary[] value = null;
            value = binding.getChildren(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test7ConfluenceserviceV2GetServerInfo() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteServerInfo value = null;
            value = binding.getServerInfo(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test8ConfluenceserviceV2GetGroups() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            java.lang.String[] value = null;
            value = binding.getGroups(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e1) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test9ConfluenceserviceV2RemoveGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeGroup(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test10ConfluenceserviceV2RemoveUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeUser(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test11ConfluenceserviceV2AddGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addGroup(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test12ConfluenceserviceV2GetAttachments() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteAttachment[] value = null;
            value = binding.getAttachments(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test13ConfluenceserviceV2AddAttachment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteAttachment value = null;
            value = binding.addAttachment(new java.lang.String(), 0, new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteAttachment(), new byte[0]);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test14ConfluenceserviceV2AddAttachment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteAttachment value = null;
            value = binding.addAttachment(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteAttachment(), new byte[0]);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test15ConfluenceserviceV2RemoveAttachment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeAttachment(new java.lang.String(), 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test16ConfluenceserviceV2GetContentPermissionSet() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteContentPermissionSet value = null;
            value = binding.getContentPermissionSet(new java.lang.String(), 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test17ConfluenceserviceV2GetContentPermissionSets() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteContentPermissionSet[] value = null;
            value = binding.getContentPermissionSets(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test18ConfluenceserviceV2GetComments() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteComment[] value = null;
            value = binding.getComments(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test19ConfluenceserviceV2AddComment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteComment value = null;
            value = binding.addComment(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteComment());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test20ConfluenceserviceV2RemoveComment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeComment(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test21ConfluenceserviceV2GetUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteUser value = null;
            value = binding.getUser(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test22ConfluenceserviceV2GetPage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePage value = null;
            value = binding.getPage(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test23ConfluenceserviceV2GetPage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePage value = null;
            value = binding.getPage(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test24ConfluenceserviceV2IsPluginEnabled() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
        boolean value = false;
        value = binding.isPluginEnabled(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void test25ConfluenceserviceV2Login() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.AuthenticationFailedException e1) {
            throw new junit.framework.AssertionFailedError("AuthenticationFailedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test26ConfluenceserviceV2GetClusterInformation() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteClusterInformation value = null;
            value = binding.getClusterInformation(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test27ConfluenceserviceV2GetDescendents() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePageSummary[] value = null;
            value = binding.getDescendents(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test28ConfluenceserviceV2GetAncestors() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePageSummary[] value = null;
            value = binding.getAncestors(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test29ConfluenceserviceV2Logout() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test30ConfluenceserviceV2GetAttachment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteAttachment value = null;
            value = binding.getAttachment(new java.lang.String(), 0, new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test31ConfluenceserviceV2AddUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            binding.addUser(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteUser(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test32ConfluenceserviceV2GetRelatedLabels() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteLabel[] value = null;
            value = binding.getRelatedLabels(new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test33ConfluenceserviceV2GetSpaces() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpaceSummary[] value = null;
            value = binding.getSpaces(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test34ConfluenceserviceV2GetSpaceGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpaceGroup value = null;
            value = binding.getSpaceGroup(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.AlreadyExistsException e2) {
            throw new junit.framework.AssertionFailedError("AlreadyExistsException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e3) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test35ConfluenceserviceV2GetSpaceGroups() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpaceGroup[] value = null;
            value = binding.getSpaceGroups(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test36ConfluenceserviceV2RemoveSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeSpace(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test37ConfluenceserviceV2GetPages() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePageSummary[] value = null;
            value = binding.getPages(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test38ConfluenceserviceV2GetPagePermissions() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePermission[] value = null;
            value = binding.getPagePermissions(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test39ConfluenceserviceV2SetContentPermissions() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.setContentPermissions(new java.lang.String(), 0, new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteContentPermission[0]);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test40ConfluenceserviceV2MoveAttachment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.moveAttachment(new java.lang.String(), 0, new java.lang.String(), 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test41ConfluenceserviceV2EditComment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteComment value = null;
            value = binding.editComment(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteComment());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test42ConfluenceserviceV2GetTopLevelPages() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePageSummary[] value = null;
            value = binding.getTopLevelPages(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test43ConfluenceserviceV2GetAttachmentData() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            byte[] value = null;
            value = binding.getAttachmentData(new java.lang.String(), 0, new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test44ConfluenceserviceV2IsWatchingSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.isWatchingSpace(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test45ConfluenceserviceV2IsWatchingPage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.isWatchingPage(new java.lang.String(), 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test46ConfluenceserviceV2GetTrashContents() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteContentSummaries value = null;
            value = binding.getTrashContents(new java.lang.String(), new java.lang.String(), 0, 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test47ConfluenceserviceV2EmptyTrash() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.emptyTrash(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test48ConfluenceserviceV2DeactivateUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.deactivateUser(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test49ConfluenceserviceV2ReactivateUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.reactivateUser(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test50ConfluenceserviceV2AddSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpace value = null;
            value = binding.addSpace(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpace());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.AlreadyExistsException e2) {
            throw new junit.framework.AssertionFailedError("AlreadyExistsException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e3) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test51ConfluenceserviceV2GetRecentlyUsedLabels() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteLabel[] value = null;
            value = binding.getRecentlyUsedLabels(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test52ConfluenceserviceV2GetRecentlyUsedLabelsInSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteLabel[] value = null;
            value = binding.getRecentlyUsedLabelsInSpace(new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test53ConfluenceserviceV2GetMostPopularLabels() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteLabel[] value = null;
            value = binding.getMostPopularLabels(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test54ConfluenceserviceV2GetMostPopularLabelsInSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteLabel[] value = null;
            value = binding.getMostPopularLabelsInSpace(new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test55ConfluenceserviceV2AddUserToGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addUserToGroup(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test56ConfluenceserviceV2InstallPlugin() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.installPlugin(new java.lang.String(), new java.lang.String(), new byte[0]);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test57ConfluenceserviceV2GetPermissionsForUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            java.lang.String[] value = null;
            value = binding.getPermissionsForUser(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test58ConfluenceserviceV2RemoveAllPermissionsForGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeAllPermissionsForGroup(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test59ConfluenceserviceV2RemoveSpaceGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeSpaceGroup(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test60ConfluenceserviceV2GetRelatedLabelsInSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteLabel[] value = null;
            value = binding.getRelatedLabelsInSpace(new java.lang.String(), new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test61ConfluenceserviceV2GetSpacesContainingContentWithLabel() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpace[] value = null;
            value = binding.getSpacesContainingContentWithLabel(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test62ConfluenceserviceV2GetSpacesWithLabel() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpace[] value = null;
            value = binding.getSpacesWithLabel(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test63ConfluenceserviceV2GetLabelsByDetail() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteLabel[] value = null;
            value = binding.getLabelsByDetail(new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test64ConfluenceserviceV2MovePageToTopLevel() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.movePageToTopLevel(new java.lang.String(), 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test65ConfluenceserviceV2RenderContent() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.renderContent(new java.lang.String(), new java.lang.String(), 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test66ConfluenceserviceV2RenderContent() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.renderContent(new java.lang.String(), new java.lang.String(), 0, new java.lang.String(), new java.util.HashMap());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test67ConfluenceserviceV2ExportSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.exportSpace(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test68ConfluenceserviceV2ExportSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.exportSpace(new java.lang.String(), new java.lang.String(), new java.lang.String(), true);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test69ConfluenceserviceV2RemoveUserFromGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeUserFromGroup(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test70ConfluenceserviceV2SetEnableWysiwyg() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.setEnableWysiwyg(new java.lang.String(), true);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test71ConfluenceserviceV2GetUserGroups() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            java.lang.String[] value = null;
            value = binding.getUserGroups(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test72ConfluenceserviceV2IsPluginInstalled() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
        boolean value = false;
        value = binding.isPluginInstalled(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void test73ConfluenceserviceV2GetPageSummary() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePageSummary value = null;
            value = binding.getPageSummary(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test74ConfluenceserviceV2GetPageSummary() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePageSummary value = null;
            value = binding.getPageSummary(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test75ConfluenceserviceV2GetPageHistory() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePageHistory[] value = null;
            value = binding.getPageHistory(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test76ConfluenceserviceV2MovePage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.movePage(new java.lang.String(), 0, 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test77ConfluenceserviceV2RemovePage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removePage(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test78ConfluenceserviceV2StorePage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePage value = null;
            value = binding.storePage(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePage());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.VersionMismatchException e3) {
            throw new junit.framework.AssertionFailedError("VersionMismatchException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test79ConfluenceserviceV2UpdatePage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePage value = null;
            value = binding.updatePage(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePage(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemotePageUpdateOptions());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.VersionMismatchException e3) {
            throw new junit.framework.AssertionFailedError("VersionMismatchException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test80ConfluenceserviceV2PurgeFromTrash() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.purgeFromTrash(new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test81ConfluenceserviceV2WatchPage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.watchPage(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test82ConfluenceserviceV2WatchPageForUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.watchPageForUser(new java.lang.String(), 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test83ConfluenceserviceV2WatchSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.watchSpace(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test84ConfluenceserviceV2GetWatchersForPage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteUser[] value = null;
            value = binding.getWatchersForPage(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test85ConfluenceserviceV2IsWatchingSpaceForType() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.isWatchingSpaceForType(new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test86ConfluenceserviceV2GetWatchersForSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteUser[] value = null;
            value = binding.getWatchersForSpace(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test87ConfluenceserviceV2GetSpacesInGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpaceSummary[] value = null;
            value = binding.getSpacesInGroup(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test88ConfluenceserviceV2StoreSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpace value = null;
            value = binding.storeSpace(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpace());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test89ConfluenceserviceV2AddSpaceGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpaceGroup value = null;
            value = binding.addSpaceGroup(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpaceGroup());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.AlreadyExistsException e2) {
            throw new junit.framework.AssertionFailedError("AlreadyExistsException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e3) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test90ConfluenceserviceV2AddPersonalSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpace value = null;
            value = binding.addPersonalSpace(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSpace(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.AlreadyExistsException e2) {
            throw new junit.framework.AssertionFailedError("AlreadyExistsException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e3) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test91ConfluenceserviceV2GetSpaceLevelPermissions() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            java.lang.String[] value = null;
            value = binding.getSpaceLevelPermissions(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test92ConfluenceserviceV2AddPermissionToSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addPermissionToSpace(new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test93ConfluenceserviceV2AddGlobalPermissions() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addGlobalPermissions(new java.lang.String(), new java.lang.String[0], new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e1) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test94ConfluenceserviceV2AddGlobalPermission() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addGlobalPermission(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e1) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test95ConfluenceserviceV2AddAnonymousUsePermission() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addAnonymousUsePermission(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test96ConfluenceserviceV2AddAnonymousViewUserProfilePermission() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addAnonymousViewUserProfilePermission(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test97ConfluenceserviceV2RemoveAnonymousViewUserProfilePermission() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeAnonymousViewUserProfilePermission(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test98ConfluenceserviceV2RemoveGlobalPermission() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeGlobalPermission(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test99ConfluenceserviceV2AddPermissionsToSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addPermissionsToSpace(new java.lang.String(), new java.lang.String[0], new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test100ConfluenceserviceV2RemovePermissionFromSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removePermissionFromSpace(new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e1) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test101ConfluenceserviceV2EditUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.editUser(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteUser());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test102ConfluenceserviceV2IsActiveUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.isActiveUser(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e1) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test103ConfluenceserviceV2GetActiveUsers() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            java.lang.String[] value = null;
            value = binding.getActiveUsers(new java.lang.String(), true);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test104ConfluenceserviceV2ChangeMyPassword() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.changeMyPassword(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test105ConfluenceserviceV2ChangeUserPassword() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.changeUserPassword(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test106ConfluenceserviceV2SetUserInformation() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.setUserInformation(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteUserInformation());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test107ConfluenceserviceV2GetUserInformation() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteUserInformation value = null;
            value = binding.getUserInformation(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test108ConfluenceserviceV2SetUserPreferenceBoolean() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.setUserPreferenceBoolean(new java.lang.String(), new java.lang.String(), new java.lang.String(), true);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test109ConfluenceserviceV2GetUserPreferenceBoolean() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.getUserPreferenceBoolean(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test110ConfluenceserviceV2SetUserPreferenceLong() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.setUserPreferenceLong(new java.lang.String(), new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test111ConfluenceserviceV2GetUserPreferenceLong() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            long value = -3;
            value = binding.getUserPreferenceLong(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test112ConfluenceserviceV2SetUserPreferenceString() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.setUserPreferenceString(new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test113ConfluenceserviceV2GetUserPreferenceString() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.getUserPreferenceString(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test114ConfluenceserviceV2HasUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.hasUser(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test115ConfluenceserviceV2HasGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.hasGroup(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test116ConfluenceserviceV2AddProfilePicture() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addProfilePicture(new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new byte[0]);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test117ConfluenceserviceV2GetBlogEntryByDayAndTitle() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteBlogEntry value = null;
            value = binding.getBlogEntryByDayAndTitle(new java.lang.String(), new java.lang.String(), 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test118ConfluenceserviceV2GetBlogEntryByDateAndTitle() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteBlogEntry value = null;
            value = binding.getBlogEntryByDateAndTitle(new java.lang.String(), new java.lang.String(), 0, 0, 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test119ConfluenceserviceV2GetBlogEntry() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteBlogEntry value = null;
            value = binding.getBlogEntry(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test120ConfluenceserviceV2GetBlogEntries() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteBlogEntrySummary[] value = null;
            value = binding.getBlogEntries(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test121ConfluenceserviceV2StoreBlogEntry() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteBlogEntry value = null;
            value = binding.storeBlogEntry(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteBlogEntry());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.VersionMismatchException e3) {
            throw new junit.framework.AssertionFailedError("VersionMismatchException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test122ConfluenceserviceV2ExportSite() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.exportSite(new java.lang.String(), true);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test123ConfluenceserviceV2FlushIndexQueue() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.flushIndexQueue(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test124ConfluenceserviceV2ClearIndexQueue() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.clearIndexQueue(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test125ConfluenceserviceV2GetClusterNodeStatuses() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteNodeStatus[] value = null;
            value = binding.getClusterNodeStatuses(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test126ConfluenceserviceV2ImportSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.importSpace(new java.lang.String(), new byte[0]);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test127ConfluenceserviceV2SetEnableAnonymousAccess() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.setEnableAnonymousAccess(new java.lang.String(), true);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test128ConfluenceserviceV2GetLabelsById() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteLabel[] value = null;
            value = binding.getLabelsById(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test129ConfluenceserviceV2GetLabelContentById() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSearchResult[] value = null;
            value = binding.getLabelContentById(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test130ConfluenceserviceV2GetLabelContentByName() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSearchResult[] value = null;
            value = binding.getLabelContentByName(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test131ConfluenceserviceV2GetLabelContentByObject() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteSearchResult[] value = null;
            value = binding.getLabelContentByObject(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteLabel());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test132ConfluenceserviceV2AddLabelByName() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addLabelByName(new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test133ConfluenceserviceV2AddLabelById() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addLabelById(new java.lang.String(), 0, 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test134ConfluenceserviceV2AddLabelByObject() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addLabelByObject(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteLabel(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test135ConfluenceserviceV2AddLabelByNameToSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addLabelByNameToSpace(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test136ConfluenceserviceV2RemoveLabelByName() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeLabelByName(new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test137ConfluenceserviceV2RemoveLabelById() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeLabelById(new java.lang.String(), 0, 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test138ConfluenceserviceV2RemoveLabelByObject() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeLabelByObject(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteLabel(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test139ConfluenceserviceV2RemoveLabelByNameFromSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeLabelByNameFromSpace(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test140ConfluenceserviceV2RemoveAnonymousUsePermission() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeAnonymousUsePermission(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test141ConfluenceserviceV2AddAnonymousPermissionToSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addAnonymousPermissionToSpace(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test142ConfluenceserviceV2AddAnonymousPermissionsToSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.addAnonymousPermissionsToSpace(new java.lang.String(), new java.lang.String[0], new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test143ConfluenceserviceV2RemoveAnonymousPermissionFromSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.removeAnonymousPermissionFromSpace(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.NotPermittedException e1) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test144ConfluenceserviceV2ConvertWikiToStorageFormat() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceserviceV2SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.stubs.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV2();
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
            value = binding.convertWikiToStorageFormat(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
