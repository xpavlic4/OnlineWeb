package com.focusmr.online.onlineweb.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Date;

/**
 * Smoke test
 */
@Path("/test")
@RequestScoped
public class TestRESTService {

    @GET
    public String printDate() {
        return new Date().toString();
    }
}
