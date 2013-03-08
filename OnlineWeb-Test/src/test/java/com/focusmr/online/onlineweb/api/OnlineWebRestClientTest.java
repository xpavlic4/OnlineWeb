package com.focusmr.online.onlineweb.api;

import com.google.common.base.Strings;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

/**
 */
public class OnlineWebRestClientTest {

    private final String deployUrl = "deployUrl";

    private Properties readProperties() throws IOException {
        InputStream resourceAsStream = OnlineWebRestClientTest.class.getResourceAsStream("/settings.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        return properties;
    }

    @Test
    public void shouldReadTestRestURL() throws IOException {
        final Properties properties = readProperties();
        assertTrue(properties != null);
        final String deployUrl = properties.getProperty(this.deployUrl);
        assertTrue(null != deployUrl && !deployUrl.isEmpty());
    }

    @Test
    @Ignore("we cannot test version that wasn't deployed yet")
    public void shouldCallWebServiceWithExpectedResults() throws IOException {
        final Properties properties = readProperties();
        final OnlineWebRestClient client = new OnlineWebRestClient(URI.create(properties.getProperty(deployUrl)).toURL());

        final OnlineWebRestClient.Builder b = new OnlineWebRestClient.Builder().application(1).country(1).param("locale").userId(1);
        final Parameter parameter = client.resolveParam(b);
        assertTrue(!Strings.isNullOrEmpty(parameter.getValue()));
    }

    @Test
    //@Ignore should be ignored
    public void shouldCallWebServiceSmokeTest() throws IOException {
        final Properties properties = readProperties();
        final OnlineWebRestClient client = new OnlineWebRestClient(URI.create(properties.getProperty(deployUrl)).toURL());

        final String s = client.smokeTest();
        assertTrue(!Strings.isNullOrEmpty(s));
    }


}
