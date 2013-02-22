package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.onlineweb.model.UserTable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/views/")
@RequestScoped
public class ViewResourceRESTService {
    @Inject
    private EntityManager em;

    @GET
    @Path("/usertable/{id}")
    @Produces(MediaType.TEXT_XML)
    public UserTable listAllUserTable(@PathParam("id") Integer id) {
        final TypedQuery<UserTable> namedQuery = em.createNamedQuery(UserTable.USER_BYID, UserTable.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }
}
