package com.focusmr.online.onlineweb.api;

import java.net.MalformedURLException;
import java.net.URI;

/**
 */
public class OnlineWebRestClientTest {
    //    @Test
    public void shouldCallWebService() throws MalformedURLException {
        final String str = "http://localhost:9090/OnlineWeb-Web/rest/version1";
        final OnlineWebRestClient client = new OnlineWebRestClient(URI.create(str).toURL());
        final OnlineWebRestClient.Builder b = new OnlineWebRestClient.Builder().application(1).country(1).param("locale").userId(1);
        final Parameter parameter = client.resolveParam(b);
    }
}
