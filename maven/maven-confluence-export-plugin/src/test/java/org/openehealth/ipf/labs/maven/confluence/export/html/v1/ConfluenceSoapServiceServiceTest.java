package org.openehealth.ipf.labs.maven.confluence.export.html.v1;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.MessageFormat;

import org.apache.http.*;
import org.apache.http.auth.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.entity.StringEntity;
import org.apache.commons.io.IOUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
* @author Mitko Kolev
* @author Boris Stanojevic
*
*/
public class ConfluenceSoapServiceServiceTest {

    DefaultHttpClient client = new DefaultHttpClient();
    String user = "mitko.kolev";
    String password = "";

    private static final String CONFLUENCE_BASE_URL = "http://repo.openehealth.org/confluence";

    private static final String LOGIN_ACTION = "/login.action";

    private static final String LOGIN_GET_SUFFIX = "os_username={0}&os_password={1}&login=Log+In&os_destination=";

    private static final String LOGOUT_ACTION = "/logout.action";

    @BeforeClass
    public static void beforeClass() {
        enableProxy();
    }

   
    @Before
    public void setUp() {
        client.getCredentialsProvider().setCredentials(
                new AuthScope("localhost", 80),
                new UsernamePasswordCredentials(user, password));

        HttpHost proxy = new HttpHost("proxy.proxy.intercomponentware.com", 3128);
        client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
    }

    protected static void enableProxy() {
        System.setProperty("http.proxyHost",
                           "proxy.proxy.intercomponentware.com");
        System.setProperty("http.proxyPort", Integer.toString(3128));
    }

    @Test
    public void testRoundTrip() throws Exception {
        ConfluenceserviceV1SoapBindingStub binding;

        try {
            ConfluenceSoapServiceServiceLocator locator = new ConfluenceSoapServiceServiceLocator();
            binding = (ConfluenceserviceV1SoapBindingStub) locator
                    .getConfluenceserviceV1();

        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: "
                    + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(500000);

        // Test operation
        try {
            String exportedSpaceUrl = null;
            String token = binding.login(user, password);
            exportedSpaceUrl = binding.exportSpace(token,
                                                   "ipftools",
                                                   "TYPE_HTML");

            String sessionId = requestSessionId(CONFLUENCE_BASE_URL,
                                                user,
                                                password);

            downloadExportedFile(sessionId, exportedSpaceUrl);

        } catch (RemoteException e1) {
            throw new junit.framework.AssertionFailedError("RemoteException Exception caught: "
                    + e1);
        }
    }

    @Test
    public void testAuthentication() throws Exception {
        String url = MessageFormat.format(CONFLUENCE_BASE_URL + LOGIN_ACTION + "?" + LOGIN_GET_SUFFIX,
                                          new String[]{"blah", "blah"});
        HttpGet incorrectRequest = new HttpGet(url);

        HttpResponse httpResponse = client.execute(incorrectRequest);
        byte[] bytesResponse = getContentAsBytes(httpResponse);

        assertTrue(new String(bytesResponse).contains("username and password are incorrect"));
        assertEquals(200, httpResponse.getStatusLine().getStatusCode());

        url = MessageFormat.format(CONFLUENCE_BASE_URL + LOGIN_ACTION + LOGIN_GET_SUFFIX,
                                   new String[]{user, password});
        HttpGet correctRequest = new HttpGet(url);
        HttpResponse correctHttpResponse = client.execute(correctRequest);
        byte[] correctBytesResponse = getContentAsBytes(correctHttpResponse);

        assertFalse(new String(correctBytesResponse).contains("username and password are incorrect"));
        assertEquals(200, httpResponse.getStatusLine().getStatusCode());

        String sessionID = extractSessionId();
        assertNotNull(sessionID);

        System.out.println(sessionID);

        HttpGet logoutRequest = new HttpGet(CONFLUENCE_BASE_URL + LOGOUT_ACTION);
    }


    byte[] getContentAsBytes(HttpResponse httpResponse) throws IOException{
        byte[] bytesResponse = null;
        if (httpResponse.getEntity() != null) {
            InputStream inStream = httpResponse.getEntity().getContent();
            int l;
            bytesResponse = new byte[4096];
            while ((l = inStream.read(bytesResponse)) != -1) {
            }
        }
        return bytesResponse;
    }

    public void downloadExportedFile(String sessionId, String exportedSpaceUri) {
        HttpGet get = new HttpGet(exportedSpaceUri);
        get.addHeader("Cookie",
                             "confluence.browse.space.cookie=space-pages; " +
                             "confluence.list.pages.cookie=list-content-tree; " +
                             "JSESSIONID=" + sessionId);
        get.addHeader("Accept",
                             "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        get.addHeader("Accept-Encoding", "gzip, deflate");

        HttpResponse httpResponse = null;
        try {
            httpResponse = client.execute(get);
            System.out.println(httpResponse.getStatusLine().getStatusCode());
            downloadStreamTo(httpResponse.getEntity().getContent(), "C:", "output.zip");
            System.out.println(exportedSpaceUri);
        } catch (Exception e){
            throw new RuntimeException(e);
        } finally {
            // Release the connection.
            try {
                if (httpResponse != null){
                    httpResponse.getEntity().getContent().close();
                }
            } catch(Exception e){
            }
        }
    }

    public StringEntity buildAuthenticationRequestEntity(String userName, String password) throws Exception {
        String content = MessageFormat.format(LOGIN_GET_SUFFIX,
                                              new String[]{userName, password});
        String contentType = "application/x-www-form-urlencoded";
        String encoding = "UTF-8";
        return new StringEntity(content, contentType, encoding);
    }

    public String extractSessionId() {
        for (org.apache.http.cookie.Cookie cookie: client.getCookieStore().getCookies()){
            if (cookie.getName().equals("JSESSIONID")){
                return cookie.getValue();
            }
        }
        throw new IllegalStateException("No JSESSIONID found in Set-Cookie response header");
    }

    public String requestSessionId(String page, String userName, String pass) {
        HttpPost sessionIdRequest = new HttpPost(page + LOGIN_ACTION);
        HttpResponse httpResponse = null;
        try {
            sessionIdRequest.setEntity(buildAuthenticationRequestEntity(userName, pass));
            httpResponse = client.execute(sessionIdRequest);
            assertFalse(new String(getContentAsBytes(httpResponse)).contains("username and password are incorrect"));
        } catch(Exception e){
            return null;
        } finally {
            // Release the connection.
            try {
                if (httpResponse != null){
                    httpResponse.getEntity().getContent().close();
                }
            } catch(Exception e){
            }
        }
        return extractSessionId();
    }

    public void downloadStreamTo(InputStream zipFileInputStream,
                             String destinationDir,
                             String localFileName) {
        File targetFile = new File(destinationDir + File.separator
                + localFileName);
        if (!targetFile.exists()) {
            try {
                boolean created = targetFile.createNewFile();
                if (!created) {
                    throw new IllegalStateException("Unable to create file "
                            + targetFile.getAbsolutePath());
                }
            } catch (IOException ioe) {
                throw new RuntimeException(ioe);
            }
        }
        OutputStream targetStream = null;

        try {
            targetStream = new BufferedOutputStream(new FileOutputStream(targetFile));
            IOUtils.copyLarge(zipFileInputStream, targetStream);
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        } finally {
            IOUtils.closeQuietly(targetStream);
            IOUtils.closeQuietly(zipFileInputStream);
        }

    }
}