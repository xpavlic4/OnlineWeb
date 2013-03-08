package com.focusmr.online.onlineweb.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

/**
 * Smoke test
 */
@Path("/test")
@RequestScoped
public class TestRESTService {
    /**
     * Prints current server date.
     *
     * @return string representation of current date  e.g. Tue Feb 26 10:39:38 CET 2013
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String printDate() {
        return new Date().toString();
    }
}
