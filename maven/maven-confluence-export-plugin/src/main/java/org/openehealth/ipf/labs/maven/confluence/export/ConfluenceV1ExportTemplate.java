/*
 * Copyright 2011 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.labs.maven.confluence.export;

import java.net.URL;
import java.rmi.RemoteException;

import org.apache.maven.plugin.logging.Log;
import org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator;
import org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub;
import org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfExportRpcServiceLocator;
import org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub;


/**
 * @author Mitko Kolev
 * 
 */
public class ConfluenceV1ExportTemplate extends ConfluenceExportTemplate {

    public static final String WS_V1_SUFFIX = "/rpc/soap-axis/confluenceservice-v1";
    public static final String WS_PDF_EXPORT_SUFFIX = "/rpc/soap-axis/pdfexport";

    public ConfluenceV1ExportTemplate(URL confluenceBaseUrl, String user, String password, Log log) {
        super(confluenceBaseUrl, user, password, log);
    }

   
    @Override
    protected String export(ExportSpace space, boolean isVersion30AndAbove) throws java.rmi.RemoteException {
        if (isVersion30AndAbove && ExportSpace.PDF.equals(space.getType())){
               return exportPDF(space); 
        } else {
            return exportHtmlOrXML(space); 
        }
        
    }
    
    private String exportPDF(ExportSpace space) throws RemoteException {
        PdfexportSoapBindingStub pdfService = getPdfService();
        String token = pdfService.login(user,  password);
        pdfService.setTimeout(space.getTimeout());
        log.debug("Exporting " + space.toString());
        String url = pdfService.exportSpace(token, space.getKey());
        log.info("Exported " + url);
        boolean logout = pdfService.logout(token);
        log.debug("Export service logged out: " + logout);
        return url;
    }
    private  String exportHtmlOrXML(ExportSpace space) throws RemoteException {
        ConfluenceserviceV1SoapBindingStub service = getConfluenceService();
        String token = service.login(user,  password);
        service.setTimeout(space.getTimeout());
        log.debug("Exporting " + space.toString());
        String url = service.exportSpace(token, space.getKey(), ExportSpace.EXPORT_TYPES.get(space.getType()));
        log.info("Exported " + url);
        boolean logout = service.logout(token);
        log.debug("Export service logged out: " + logout);
        return url;
    }

    private ConfluenceserviceV1SoapBindingStub getConfluenceService() {
        String confluenceWSUrl = confluenceBaseUrl.toExternalForm() + WS_V1_SUFFIX;
        try {
            ConfluenceSoapServiceServiceLocator locator = new ConfluenceSoapServiceServiceLocator();
            locator.setEndpointAddress("ConfluenceserviceV1", confluenceWSUrl);
            return (ConfluenceserviceV1SoapBindingStub) locator.getConfluenceserviceV1();

        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null) {
                throw new RuntimeException("JAX-RPC ServiceException caught: " + jre);
            } else {
                throw new RuntimeException(jre);
            }
        }
    }
    
    private PdfexportSoapBindingStub getPdfService() {
        String confluencePdfExportAddress = confluenceBaseUrl.toExternalForm() + WS_PDF_EXPORT_SUFFIX;
        try {
            PdfExportRpcServiceLocator locator = new PdfExportRpcServiceLocator();
            locator.setpdfexportEndpointAddress(confluencePdfExportAddress);
            return (PdfexportSoapBindingStub) locator.getpdfexport();

        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null) {
                throw new RuntimeException("JAX-RPC ServiceException caught: " + jre);
            } else {
                throw new RuntimeException(jre);
            }
        }
    }

}
