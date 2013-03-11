package com.focusmr.online.onlineweb.api;

import com.focusmr.dblocator.client.GenericRestClient;

import java.net.URL;

/**
 * Client proxy for REST webservice.
 */
public class OnlineWebRestClient extends GenericRestClient {
    public static class Builder {
        private int userId;
        private int country;
        private int application;
        private String param;

        public Builder userId(int i) {
            this.userId = i;
            return this;
        }

        public Builder country(int i) {
            this.country = i;
            return this;
        }

        public Builder application(int i) {
            this.application = i;
            return this;
        }

        public Builder param(String param) {
            this.param = param;
            return this;
        }

        Context build() {
            final Context context = new Context();
            context.setApplication(application);
            context.setCountry(country);
            context.setUserId(userId);
            context.setParam(param);
            return context;
        }
    }

    private static class Context {
        private int userId;
        private int country;
        private int application;
        private String param;

        public int getUserId() {
            return userId;
        }

        void setUserId(int userId) {
            this.userId = userId;
        }

        public int getCountry() {
            return country;
        }

        void setCountry(int country) {
            this.country = country;
        }

        public int getApplication() {
            return application;
        }

        void setApplication(int application) {
            this.application = application;
        }

        public String getParam() {
            return param;
        }

        void setParam(String param) {
            this.param = param;
        }
    }

    private URL url;

    /**
     * Constructor with URL of webservice.
     *
     * @param url e.g. http://js2:9090/OnlineWeb/rest/version1/
     */
    public OnlineWebRestClient(URL url) {
        this.url = url;
    }

    /**
     * users/1/apps/1/countries/1/params/locale
     *
     * @return parameter filled with values from ws call
     */
    @SuppressWarnings("UnusedDeclaration")
    public Parameter resolveParam(Builder c) {
        Parameter xml;
        RequestBuilder rb = new RequestBuilder();
        final Context ctx = c.build();
        StringBuilder sb = new StringBuilder("/users/" + ctx.getUserId());
        sb.append("/apps/").append(ctx.getApplication());
        sb.append("/countries/").append(ctx.getCountry());
        sb.append("/params/").append(ctx.getParam());
        rb.withURI(getUrl().toString() + sb.toString());
        rb.withMethod("GET");
        rb.withContentType("application/xml");
        Request r = rb.build();

        Object execute;
        try {
            execute = execute(r, Parameter.class);
        } catch (Exception e) {
            throw new OnlineWebException(e);
        }
        xml = (Parameter) execute;

        return xml;

    }

    /**
     * Smoke test for webserice.
     *
     * @return current date of server string representation.
     */
    public String smokeTest() {
        RequestBuilder rb = new RequestBuilder();
        rb.withURI(getUrl().toString() + "/test");
        rb.withMethod("GET");
        rb.withContentType("text/plain");
        Request r = rb.build();

        Object execute;
        try {
            execute = execute(r);
        } catch (Exception e) {
            throw new OnlineWebException(e);
        }

        return (String) execute;
    }


    /**
     * Gets root url.
     *
     * @return root url.
     */
    private URL getUrl() {
        return url;
    }
}
