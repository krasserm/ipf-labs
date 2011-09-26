package org.openehealth.ipf.labs.maven.confluence.export.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.HeaderElement;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openehealth.ipf.labs.maven.confluence.export.stubs.RemoteException;

/**
 * @author Boris Stanojevic
 */
public class ConfluenceSoapServiceServiceTest {

    HttpClient client = new HttpClient();
    String user = "user";
    String password = "password";

    @BeforeClass
    public static void beforeClass() {
        enableProxy();
    }

   
    @Before
    public void setUp() {
        HttpClientParams params = new HttpClientParams();
        params.setAuthenticationPreemptive(true);
        client.getHostConfiguration()
                .setProxy("proxy.proxy.intercomponentware.com", 3128);
        Credentials defaultcreds = new UsernamePasswordCredentials(user,
                                                                   password);
        client.getState().setCredentials(AuthScope.ANY, defaultcreds);
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
        binding.setTimeout(120000);

        // Test operation
        try {
            String exportedSpaceUrl = null;
            String token = binding.login(user, password);
            exportedSpaceUrl = binding.exportSpace(token,
                                                   "ipftools",
                                                   "TYPE_HTML");

            String sessionId = requestSessionId("http://repo.openehealth.org/confluence",
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
        PostMethod sessionIdRequest = new PostMethod("http://repo.openehealth.org/confluence/login.action");
        sessionIdRequest
                .setRequestEntity(buildAuthenticationRequestEntity(user,
                                                                   password));

        int responseCode = client.executeMethod(sessionIdRequest);
        assertEquals(302, responseCode);
        String sessionID = extractSessionId(sessionIdRequest);
        assertNotNull(sessionID);
    }

    public void downloadExportedFile(String sessionId, String exportedSpaceUri) throws Exception {
        GetMethod get = new GetMethod(exportedSpaceUri);
        get.addRequestHeader("Cookie",
                             "confluence.browse.space.cookie=space-pages; confluence.list.pages.cookie=list-content-tree; JSESSIONID="
                                     + sessionId);
        get.addRequestHeader("Accept",
                             "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        get.addRequestHeader("Accept-Encoding", "gzip, deflate");

        int statusCode = client.executeMethod(get);
        System.out.println(statusCode);
        downloadStreamTo(get.getResponseBodyAsStream(), "C:", "output.zip");
        System.out.println(exportedSpaceUri);

    }

    public RequestEntity buildAuthenticationRequestEntity(String userName, String password) throws Exception {
        String content = "os_username=" + user + "&os_password=" + password
                + "&login=Log+In&os_destination=";
        String contentType = "application/x-www-form-urlencoded";
        String encoding = "UTF-8";
        return new StringRequestEntity(content, contentType, encoding);
    }

    public String extractSessionId(PostMethod sessionIdRequest) {
        HeaderElement[] elements = sessionIdRequest
                .getResponseHeader("Set-Cookie").getElements();
        for (HeaderElement element : elements) {
            if ("JSESSIONID".equals(element.getName())) {
                return element.getValue();
            }
        }
        throw new IllegalStateException("No JSESSIONID found in Set-Cookie response header");
    }

    public String requestSessionId(String page, String userName, String password) throws Exception {

        PostMethod sessionIdRequest = new PostMethod(page + "/login.action");
        sessionIdRequest.setRequestEntity(buildAuthenticationRequestEntity(user, password));
        int responseCode = client.executeMethod(sessionIdRequest);
        assertEquals(302, responseCode);
        return extractSessionId(sessionIdRequest);
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
