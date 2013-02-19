package com.focusmr.online.onlineweb.rest;

import javax.inject.Named;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * A class extending {@link Application} and annotated with @ApplicationPath is the Java EE 6
 * "no XML" approach to activating JAX-RS.
 * <p/>
 * <p>
 * Resources are served relative to the servlet path specified in the {@link ApplicationPath}
 * annotation.
 * </p>
 */
@ApplicationPath(JaxRsActivator.REST_VERSION1)
@Named
public class JaxRsActivator extends Application {
    public static final String REST_VERSION1 = "/rest/version1";

    public String getRestVersion() {
        return REST_VERSION1;
    }
}
