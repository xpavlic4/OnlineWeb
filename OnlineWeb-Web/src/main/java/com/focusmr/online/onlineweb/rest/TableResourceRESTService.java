package com.focusmr.online.onlineweb.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
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
@RequestScoped
public class TableResourceRESTService {
    @Inject
    private EntityManager em;

    @GET
    @Path("/table/{name}")
    @Produces(MediaType.TEXT_XML)
    public List listTable(@PathParam("name") String tableName) {
        //TODO just for testing, sql injection!
        final Query nativeQuery = em.createNativeQuery("select * from " + tableName);
        return nativeQuery.getResultList();
    }

}
