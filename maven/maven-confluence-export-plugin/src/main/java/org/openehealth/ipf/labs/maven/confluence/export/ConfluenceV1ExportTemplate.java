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

import static org.openehealth.ipf.labs.maven.confluence.export.ExportSpace.EXPORT_TYPE.PDF;

import java.net.URL;
import java.rmi.RemoteException;

import org.apache.maven.plugin.logging.Log;
import org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceSoapServiceServiceLocator;
import org.openehealth.ipf.labs.maven.confluence.export.html.v1.ConfluenceserviceV1SoapBindingStub;
import org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfExportRpcServiceLocator;
import org.openehealth.ipf.labs.maven.confluence.export.pdf.PdfexportSoapBindingStub;

/**
 * Used to export Confluence spaces with API version 1.
 * 
 * @author Mitko Kolev
 * @author Boris Stanojevic
 * 
 */
public class ConfluenceV1ExportTemplate extends AbstractConfluenceExportTemplate {

    public static final String WS_V1_SUFFIX = "/rpc/soap-axis/confluenceservice-v1";
    public static final String WS_PDF_EXPORT_SUFFIX = "/rpc/soap-axis/pdfexport";

    public ConfluenceV1ExportTemplate(URL confluenceBaseUrl, String user, String password, Log log) {
        super(confluenceBaseUrl, user, password, log);
    }

    @Override
    protected String  export(ExportSpace space, boolean isVersion30AndAbove) throws java.rmi.RemoteException,
                                                                  javax.xml.rpc.ServiceException {
        if (isVersion30AndAbove && PDF.toString().equals(space.getType())) {
            return exportPDF(space);
        } else {
            return exportHtmlOrXML(space);
        }

    }

    private String exportPDF(ExportSpace space) throws RemoteException,
                                               javax.xml.rpc.ServiceException {
        PdfexportSoapBindingStub pdfService = getPdfService();
        String token = pdfService.login(user, password);
        pdfService.setTimeout(space.getTimeout());
        String url = pdfService.exportSpace(token, space.getKey());
        boolean logout = pdfService.logout(token);
        log.debug("Export service logged out: " + logout);
        return url;
    }

    private String exportHtmlOrXML(ExportSpace space) throws RemoteException,
                                                     javax.xml.rpc.ServiceException {
        ConfluenceserviceV1SoapBindingStub service = getConfluenceService();
        String token = service.login(user, password);
        service.setTimeout(space.getTimeout());
        String url = service.exportSpace(token, space.getKey(), "TYPE_" + space.getType());
        boolean logout = service.logout(token);
        log.debug("Export service logged out: " + logout);
        return url;
    }

    private ConfluenceserviceV1SoapBindingStub
            getConfluenceService() throws javax.xml.rpc.ServiceException {
        String confluenceWSUrl = confluenceBaseUrl.toExternalForm() + WS_V1_SUFFIX;
        ConfluenceSoapServiceServiceLocator locator = new ConfluenceSoapServiceServiceLocator();
        locator.setEndpointAddress("ConfluenceserviceV1", confluenceWSUrl);
        return (ConfluenceserviceV1SoapBindingStub) locator.getConfluenceserviceV1();

    }

    private PdfexportSoapBindingStub getPdfService() throws javax.xml.rpc.ServiceException {
        String confluencePdfExportAddress = confluenceBaseUrl.toExternalForm()
                + WS_PDF_EXPORT_SUFFIX;
        PdfExportRpcServiceLocator locator = new PdfExportRpcServiceLocator();
        locator.setpdfexportEndpointAddress(confluencePdfExportAddress);
        return (PdfexportSoapBindingStub) locator.getpdfexport();
    }

}
