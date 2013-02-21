package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.onlineweb.model.App;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/tables/")
@RequestScoped
public class TableResourceRESTService {
    @Inject
    private EntityManager em;

    @GET
    @Path("/app")
    @Produces(MediaType.TEXT_XML)
    public List<App> listAllApp() {
        final CriteriaQuery<App> criteria = em.getCriteriaBuilder().createQuery(App.class);
        final Root<App> appRoot = criteria.from(App.class);
        criteria.select(appRoot);
        return em.createQuery(criteria).getResultList();
    }

    @GET
    @Path("/app/name/{name}")
    @Produces(MediaType.TEXT_XML)
    public App listAllByName(@PathParam(value = "name") String aName) {
        final TypedQuery<App> namedQuery = em.createNamedQuery(App.APP_BYNAME, App.class);
        namedQuery.setParameter("name", aName);
        return namedQuery.getSingleResult();
    }
}
