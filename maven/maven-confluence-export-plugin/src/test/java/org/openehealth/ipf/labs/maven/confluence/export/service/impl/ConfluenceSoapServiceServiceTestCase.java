package org.openehealth.ipf.labs.maven.confluence.export.service.impl;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openehealth.ipf.labs.maven.confluence.export.stubs.*;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Boris Stanojevic
 */
public class ConfluenceSoapServiceServiceTestCase {


    @BeforeClass
    static void beforeClass(){
        enableProxy();
    }

    protected static void enableProxy() {
        System.setProperty("http.proxyHost", "my-proxy-host");
        System.setProperty("http.proxyPort", Integer.toString(3128));
    }

    @Test
    public void testConfluenceserviceExportSpace() throws Exception {
        ConfluenceserviceV1SoapBindingStub binding;
        try {
            binding = (ConfluenceserviceV1SoapBindingStub)
                          new ConfluenceSoapServiceServiceLocator().getConfluenceserviceV1();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            String value = null;
            String token = binding.login("username", "password");
            value = binding.exportSpace(token, "ipf2", "TYPE_HTML");
            System.out.println(value);

            // fails because the exported ZIP is not reachable over HTTP from outside
            // it's OK because we're doing the export/release on the same server where the
            // Confluence runs
            fileDownload(value, "ipf-1.zip","C:/_build/temp/");
        }
        catch (RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
    }


    public static void fileDownload(String fileAddress, String localFileName, String destinationDir) {
        int size=1024;
        OutputStream os = null;
        URLConnection URLConn = null;

        InputStream is = null;
        try {
            URL fileUrl;
            byte[] buf;
            int ByteRead,ByteWritten=0;
            fileUrl= new URL(fileAddress);
            os = new BufferedOutputStream(new FileOutputStream(destinationDir+"\\"+localFileName));
            URLConn = fileUrl.openConnection();
            is = URLConn.getInputStream();
            buf = new byte[size];
            while ((ByteRead = is.read(buf)) != -1) {
                os.write(buf, 0, ByteRead);
                ByteWritten += ByteRead;
            }
            System.out.println("Downloaded Successfully.");
            System.out.println("File name:"+localFileName+ "No of bytes :" + ByteWritten);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
