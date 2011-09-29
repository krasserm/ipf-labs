/**
 * PdfExportRpc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehealth.ipf.labs.maven.confluence.export.pdf;

public interface PdfExportRpc extends java.rmi.Remote {
    public java.lang.String exportSpace(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.pdf.RemoteException;
    public java.lang.String login(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.pdf.AuthenticationFailedException, org.openehealth.ipf.labs.maven.confluence.export.pdf.RemoteException;
    public boolean logout(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.pdf.RemoteException;
}
