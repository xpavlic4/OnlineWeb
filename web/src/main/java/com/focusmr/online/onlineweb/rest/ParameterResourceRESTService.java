package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.onlineweb.api.Parameter;
import edu.emory.mathcs.backport.java.util.Collections;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * JAX-RS Example
 * <p/>
 * This class produces a RESTful service to read the contents of the members table.
 */
@Path("/users/{userId}/apps/{appId}/countries/{country}/")
@RequestScoped
public class ParameterResourceRESTService {
    @Inject
    private EntityManager em;

    @GET
    @Path("/params")
    @Produces(MediaType.TEXT_XML)
    public List<Parameter> listAllParameters(@PathParam("userId") String userId) {
//       com.focusmr.online.beans.User.switchToUser(userName, false, applicationId);
        return Collections.emptyList();
    }

    @GET
    @Path("/params/{name}")
    @Produces("text/xml")
    public Parameter lookupMemberById(@PathParam("name") long name) {
        final Parameter parameter = new Parameter();
        parameter.setKey("testKey");
        parameter.setValue("testValue");
        return parameter;
    }
}
