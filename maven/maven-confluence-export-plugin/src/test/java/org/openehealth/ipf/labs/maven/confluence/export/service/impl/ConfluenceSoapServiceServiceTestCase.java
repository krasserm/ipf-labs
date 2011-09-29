package org.openehealth.ipf.labs.maven.confluence.export.service.impl;

import static org.junit.Assert.*;


import com.sun.deploy.net.HttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.cookie.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.openehealth.ipf.labs.maven.confluence.export.stubs.*;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.net.*;

/**
 * @author Boris Stanojevic
 */
public class ConfluenceSoapServiceServiceTestCase {

    static final String LOGIN_REQUEST =
            "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:soap=\"http://soap.rpc.confluence.atlassian.com\">\n" +
            "   <soapenv:Header/>\n" +
            "   <soapenv:Body>\n" +
            "      <soap:login soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" +
            "         <in0 xsi:type=\"xsd:string\">boris.stanojevic</in0>\n" +
            "         <in1 xsi:type=\"xsd:string\"></in1>\n" +
            "      </soap:login>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>";

    @BeforeClass
    public static void beforeClass(){
        enableProxy();
    }

    protected static void enableProxy() {
        System.setProperty("http.proxyHost", "proxy.proxy.intercomponentware.com");
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
        binding.setTimeout(60000);

        // Test operation
        try {
            String value = null;
            String token = binding.login("boris.stanojevic", "hajduk");
            //value = binding.exportSpace(token, "ipftools", "TYPE_HTML");
            System.out.println(token);

            // fails because the exported ZIP is not reachable over HTTP from outside
            // it's OK because we're doing the export/release on the same server where the
            // Confluence runs
            //fileDownload(value, "ipf-1.zip","C:/_build/temp/");
            //doDownload();
        }
        catch (RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: " + e1);
        }
    }

    @Test
    public void testSoapOverHttpClient(){
        String url = "http://repo.openehealth.org/confluence/rpc/soap-axis/confluenceservice-v1";
        String fileUrl = "http://repo.openehealth.org/confluence/download/temp/export_09262011_084142/ipftools-20110926-08_41_58-38.zip";
        DefaultHttpClient httpclient = new DefaultHttpClient();

        HttpHost proxy = new HttpHost("proxy.proxy.intercomponentware.com", 3128);
        httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);

        HttpContext localContext = new BasicHttpContext();

        HttpPost method = new HttpPost(url);
        HttpEntity entity = null;

        try {
            method.setHeader("SOAPAction",
                    "http://repo.openehealth.org/confluence/rpc/soap-axis/confluenceservice-v1/ConfluenceSoapService/loginRequest");
            HttpEntity stringEntity= new StringEntity(LOGIN_REQUEST, "text/xml", "UTF-8");
            method.setEntity(stringEntity);

            // Execute the method.
            org.apache.http.HttpResponse response = httpclient.execute(method, localContext);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode != HttpStatus.SC_OK) {
                System.err.println("Method failed: " + response.getStatusLine().getReasonPhrase());
            }

            response.getEntity().getContent().close();

            //CookieSpec cookiespec = CookiePolicy.getDefaultSpec();


            HttpGet getExportedZip = new HttpGet(fileUrl);
            org.apache.http.HttpResponse response1 = httpclient.execute(getExportedZip, localContext);
            statusCode = response.getStatusLine().getStatusCode();
            System.out.println(statusCode);

            // Read the response body.
             //InputStream responseBody = getExportedZip.getResponseBodyAsStream();

            // Deal with the response.
            // Use caution: ensure correct character encoding and is not binary data
            //System.out.println(new String(responseBody));

        } catch (Exception e) {
            System.err.println("Fatal protocol violation: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Release the connection.
            try {
                entity.getContent().close();
            } catch(Exception e){

            }
        }
    }


    @Test
    public void fileDownloadTest(){//String fileAddress, String localFileName, String destinationDir) {
        String fileAddress = "http://repo.openehealth.org/confluence/download/temp/export_09262011_084142/ipftools-20110926-08_41_58-38.zip";
        String localFileName = "ipf-1.zip";
        String destinationDir = "C:/_build/temp/";

        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("boris.stanojevic", "hajduk".toCharArray());
            }
        });


        int size=1024;
        OutputStream os = null;
        URLConnection URLConn = null;
        BASE64Encoder enc = new sun.misc.BASE64Encoder();
        String userpassword = "boris.stanojevic:hajduk";
        String encodedAuthorization = enc.encode( userpassword.getBytes() );


        InputStream is = null;
        try {
            URL fileUrl;
            byte[] buf;
            int ByteRead,ByteWritten=0;
            fileUrl= new URL(fileAddress);
            os = new BufferedOutputStream(new FileOutputStream(destinationDir+"\\"+localFileName));
            URLConn = fileUrl.openConnection();
            URLConn.setRequestProperty("Authorization", "Basic "+
                encodedAuthorization);
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


    @Test
	public void testChar() {

		String utf = new String("ÄÄÜÜKJKJK");
		try {
			byte[] bytes = utf.getBytes("UTF-8");
			String iso = new String(bytes, "ISO-8859-1");
			String utf1 = new String(bytes, "UTF-8");
			String iso1 = new String(utf1.getBytes("ISO-8859-1"), "ISO-8859-1");
			System.out.println(utf);
			System.out.println(iso);
			System.out.println(utf1);
			System.out.println(iso1);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}


}
