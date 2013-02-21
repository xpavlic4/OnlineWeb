package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.onlineweb.api.Parameter;
import com.focusmr.online.onlineweb.model.App;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
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

    @PersistenceContext
    private EntityManager em3;

    @PersistenceUnit(unitName = "primary")
    private EntityManagerFactory entityManagerFactory;

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
    public List<App> lookupMemberById(@PathParam("name") long name) {

        final TypedQuery<App> query = em.createQuery("select a from App a", App.class);
        return query.getResultList();
    }
}
