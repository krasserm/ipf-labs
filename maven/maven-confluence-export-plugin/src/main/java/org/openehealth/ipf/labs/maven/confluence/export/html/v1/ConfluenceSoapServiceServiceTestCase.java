/**
 * ConfluenceSoapServiceServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehealth.ipf.labs.maven.confluence.export.html.v1;

public class ConfluenceSoapServiceServiceTestCase extends junit.framework.TestCase {
    public ConfluenceSoapServiceServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testConfluenceserviceV1WSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1Address() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1ConfluenceserviceV1GetServerInfo() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteServerInfo value = null;
            value = binding.getServerInfo(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test2ConfluenceserviceV1GetGroups() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e1) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test3ConfluenceserviceV1RemoveGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test4ConfluenceserviceV1RemoveUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test5ConfluenceserviceV1AddGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test6ConfluenceserviceV1GetUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteUser value = null;
            value = binding.getUser(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test7ConfluenceserviceV1Login() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.AuthenticationFailedException e1) {
            throw new junit.framework.AssertionFailedError("AuthenticationFailedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test8ConfluenceserviceV1GetAttachments() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteAttachment[] value = null;
            value = binding.getAttachments(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test9ConfluenceserviceV1AddAttachment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteAttachment value = null;
            value = binding.addAttachment(new java.lang.String(), 0, new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteAttachment(), new byte[0]);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test10ConfluenceserviceV1AddAttachment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteAttachment value = null;
            value = binding.addAttachment(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteAttachment(), new byte[0]);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test11ConfluenceserviceV1RemoveAttachment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test12ConfluenceserviceV1GetContentPermissionSet() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteContentPermissionSet value = null;
            value = binding.getContentPermissionSet(new java.lang.String(), 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test13ConfluenceserviceV1GetContentPermissionSets() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteContentPermissionSet[] value = null;
            value = binding.getContentPermissionSets(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test14ConfluenceserviceV1GetClusterInformation() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteClusterInformation value = null;
            value = binding.getClusterInformation(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test15ConfluenceserviceV1IsPluginEnabled() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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

    public void test16ConfluenceserviceV1AddComment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteComment value = null;
            value = binding.addComment(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteComment());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test17ConfluenceserviceV1GetComments() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteComment[] value = null;
            value = binding.getComments(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test18ConfluenceserviceV1RemoveComment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test19ConfluenceserviceV1GetDescendents() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePageSummary[] value = null;
            value = binding.getDescendents(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test20ConfluenceserviceV1GetAncestors() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePageSummary[] value = null;
            value = binding.getAncestors(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test21ConfluenceserviceV1Logout() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test22ConfluenceserviceV1GetAttachment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteAttachment value = null;
            value = binding.getAttachment(new java.lang.String(), 0, new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test23ConfluenceserviceV1AddUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            binding.addUser(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteUser(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test24ConfluenceserviceV1GetRelatedLabels() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteLabel[] value = null;
            value = binding.getRelatedLabels(new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test25ConfluenceserviceV1GetSpaces() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpaceSummary[] value = null;
            value = binding.getSpaces(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test26ConfluenceserviceV1GetSpaceGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpaceGroup value = null;
            value = binding.getSpaceGroup(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.AlreadyExistsException e2) {
            throw new junit.framework.AssertionFailedError("AlreadyExistsException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e3) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test27ConfluenceserviceV1GetSpaceGroups() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpaceGroup[] value = null;
            value = binding.getSpaceGroups(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test28ConfluenceserviceV1RemoveSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test29ConfluenceserviceV1ConvertToPersonalSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            value = binding.convertToPersonalSpace(new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), true);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test30ConfluenceserviceV1GetPages() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePageSummary[] value = null;
            value = binding.getPages(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test31ConfluenceserviceV1SetContentPermissions() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            value = binding.setContentPermissions(new java.lang.String(), 0, new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteContentPermission[0]);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test32ConfluenceserviceV1MoveAttachment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test33ConfluenceserviceV1EditComment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteComment value = null;
            value = binding.editComment(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteComment());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test34ConfluenceserviceV1GetTopLevelPages() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePageSummary[] value = null;
            value = binding.getTopLevelPages(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test35ConfluenceserviceV1GetAttachmentData() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test36ConfluenceserviceV1DeactivateUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test37ConfluenceserviceV1ReactivateUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test38ConfluenceserviceV1AddSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpace value = null;
            value = binding.addSpace(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpace());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.AlreadyExistsException e2) {
            throw new junit.framework.AssertionFailedError("AlreadyExistsException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e3) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test39ConfluenceserviceV1GetRecentlyUsedLabels() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteLabel[] value = null;
            value = binding.getRecentlyUsedLabels(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test40ConfluenceserviceV1GetRecentlyUsedLabelsInSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteLabel[] value = null;
            value = binding.getRecentlyUsedLabelsInSpace(new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test41ConfluenceserviceV1GetMostPopularLabels() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteLabel[] value = null;
            value = binding.getMostPopularLabels(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test42ConfluenceserviceV1GetMostPopularLabelsInSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteLabel[] value = null;
            value = binding.getMostPopularLabelsInSpace(new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test43ConfluenceserviceV1SetEnableWysiwyg() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test44ConfluenceserviceV1GetPermissionsForUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test45ConfluenceserviceV1RemoveAllPermissionsForGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test46ConfluenceserviceV1RemoveSpaceGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test47ConfluenceserviceV1GetRelatedLabelsInSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteLabel[] value = null;
            value = binding.getRelatedLabelsInSpace(new java.lang.String(), new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test48ConfluenceserviceV1GetSpacesContainingContentWithLabel() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpace[] value = null;
            value = binding.getSpacesContainingContentWithLabel(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test49ConfluenceserviceV1GetSpacesWithLabel() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpace[] value = null;
            value = binding.getSpacesWithLabel(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test50ConfluenceserviceV1GetLabelsByDetail() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteLabel[] value = null;
            value = binding.getLabelsByDetail(new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test51ConfluenceserviceV1MovePageToTopLevel() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test52ConfluenceserviceV1MovePage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test53ConfluenceserviceV1ExportSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test54ConfluenceserviceV1ExportSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test55ConfluenceserviceV1HasUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test56ConfluenceserviceV1GetPageHistory() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePageHistory[] value = null;
            value = binding.getPageHistory(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test57ConfluenceserviceV1RemovePage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test58ConfluenceserviceV1RenderContent() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test59ConfluenceserviceV1RenderContent() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test60ConfluenceserviceV1StorePage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePage value = null;
            value = binding.storePage(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePage());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.VersionMismatchException e3) {
            throw new junit.framework.AssertionFailedError("VersionMismatchException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test61ConfluenceserviceV1UpdatePage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePage value = null;
            value = binding.updatePage(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePage(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePageUpdateOptions());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.VersionMismatchException e3) {
            throw new junit.framework.AssertionFailedError("VersionMismatchException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test62ConfluenceserviceV1GetSpacesInGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpaceSummary[] value = null;
            value = binding.getSpacesInGroup(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test63ConfluenceserviceV1StoreSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpace value = null;
            value = binding.storeSpace(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpace());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test64ConfluenceserviceV1AddSpaceGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpaceGroup value = null;
            value = binding.addSpaceGroup(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpaceGroup());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.AlreadyExistsException e2) {
            throw new junit.framework.AssertionFailedError("AlreadyExistsException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e3) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test65ConfluenceserviceV1AddPersonalSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpace value = null;
            value = binding.addPersonalSpace(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpace(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.AlreadyExistsException e2) {
            throw new junit.framework.AssertionFailedError("AlreadyExistsException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e3) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test66ConfluenceserviceV1GetSpaceLevelPermissions() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test67ConfluenceserviceV1AddPermissionToSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test68ConfluenceserviceV1AddGlobalPermissions() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e1) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test69ConfluenceserviceV1AddGlobalPermission() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e1) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test70ConfluenceserviceV1AddAnonymousUsePermission() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test71ConfluenceserviceV1RemoveGlobalPermission() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test72ConfluenceserviceV1AddPermissionsToSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test73ConfluenceserviceV1RemovePermissionFromSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e1) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test74ConfluenceserviceV1EditUser() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            value = binding.editUser(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteUser());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test75ConfluenceserviceV1GetUserGroups() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test76ConfluenceserviceV1AddUserToGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test77ConfluenceserviceV1RemoveUserFromGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test78ConfluenceserviceV1GetActiveUsers() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test79ConfluenceserviceV1ChangeMyPassword() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test80ConfluenceserviceV1ChangeUserPassword() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test81ConfluenceserviceV1SetUserInformation() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            value = binding.setUserInformation(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteUserInformation());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test82ConfluenceserviceV1GetUserInformation() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteUserInformation value = null;
            value = binding.getUserInformation(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test83ConfluenceserviceV1HasGroup() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test84ConfluenceserviceV1AddProfilePicture() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test85ConfluenceserviceV1GetBlogEntryByDayAndTitle() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteBlogEntry value = null;
            value = binding.getBlogEntryByDayAndTitle(new java.lang.String(), new java.lang.String(), 0, new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test86ConfluenceserviceV1GetBlogEntry() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteBlogEntry value = null;
            value = binding.getBlogEntry(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test87ConfluenceserviceV1GetBlogEntries() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteBlogEntrySummary[] value = null;
            value = binding.getBlogEntries(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test88ConfluenceserviceV1StoreBlogEntry() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteBlogEntry value = null;
            value = binding.storeBlogEntry(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteBlogEntry());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.VersionMismatchException e3) {
            throw new junit.framework.AssertionFailedError("VersionMismatchException Exception caught: " + e3);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e4) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test89ConfluenceserviceV1ExportSite() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test90ConfluenceserviceV1FlushIndexQueue() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test91ConfluenceserviceV1ClearIndexQueue() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test92ConfluenceserviceV1GetClusterNodeStatuses() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteNodeStatus[] value = null;
            value = binding.getClusterNodeStatuses(new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test93ConfluenceserviceV1ImportSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test94ConfluenceserviceV1SetEnableAnonymousAccess() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test95ConfluenceserviceV1GetLabelsById() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteLabel[] value = null;
            value = binding.getLabelsById(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test96ConfluenceserviceV1GetLabelContentById() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSearchResult[] value = null;
            value = binding.getLabelContentById(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test97ConfluenceserviceV1GetLabelContentByName() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSearchResult[] value = null;
            value = binding.getLabelContentByName(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test98ConfluenceserviceV1GetLabelContentByObject() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSearchResult[] value = null;
            value = binding.getLabelContentByObject(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteLabel());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test99ConfluenceserviceV1AddLabelByName() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test100ConfluenceserviceV1AddLabelById() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test101ConfluenceserviceV1AddLabelByObject() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            value = binding.addLabelByObject(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteLabel(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test102ConfluenceserviceV1AddLabelByNameToSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test103ConfluenceserviceV1RemoveLabelByName() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test104ConfluenceserviceV1RemoveLabelById() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test105ConfluenceserviceV1RemoveLabelByObject() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            value = binding.removeLabelByObject(new java.lang.String(), new org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteLabel(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test106ConfluenceserviceV1RemoveLabelByNameFromSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e2) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e2);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e3) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test107ConfluenceserviceV1RemoveAnonymousUsePermission() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test108ConfluenceserviceV1AddAnonymousPermissionToSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test109ConfluenceserviceV1AddAnonymousPermissionsToSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test110ConfluenceserviceV1RemoveAnonymousPermissionFromSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.NotPermittedException e1) {
            throw new junit.framework.AssertionFailedError("NotPermittedException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test111ConfluenceserviceV1GetPagePermissions() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePermission[] value = null;
            value = binding.getPagePermissions(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test112ConfluenceserviceV1GetPermissions() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test113ConfluenceserviceV1Search() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSearchResult[] value = null;
            value = binding.search(new java.lang.String(), new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test114ConfluenceserviceV1Search() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSearchResult[] value = null;
            value = binding.search(new java.lang.String(), new java.lang.String(), new java.util.HashMap(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test115ConfluenceserviceV1GetSpace() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteSpace value = null;
            value = binding.getSpace(new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test116ConfluenceserviceV1GetChildren() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePageSummary[] value = null;
            value = binding.getChildren(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test117ConfluenceserviceV1GetComment() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteComment value = null;
            value = binding.getComment(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test118ConfluenceserviceV1GetPage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePage value = null;
            value = binding.getPage(new java.lang.String(), new java.lang.String(), new java.lang.String());
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test119ConfluenceserviceV1GetPage() throws Exception {
        org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub)
                          new org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
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
            org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemotePage value = null;
            value = binding.getPage(new java.lang.String(), 0);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.InvalidSessionException e1) {
            throw new junit.framework.AssertionFailedError("InvalidSessionException Exception caught: " + e1);
        }
        catch (org.openehealth.ipf.labs.maven.confluence.export.html.v1.RemoteException e2) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e2);
        }
            // TBD - validate results
    }

}
