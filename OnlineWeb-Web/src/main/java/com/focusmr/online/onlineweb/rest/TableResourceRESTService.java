package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.onlineweb.model.App;
import com.focusmr.online.onlineweb.model.Country;
import com.focusmr.online.onlineweb.model.Param;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
    @Path("/country")
    @Produces(MediaType.TEXT_XML)
    public List<Country> listAllCounntry() {
        final CriteriaQuery<Country> criteria = em.getCriteriaBuilder().createQuery(Country.class);
        final Root<Country> appRoot = criteria.from(Country.class);
        criteria.select(appRoot);
        return em.createQuery(criteria).getResultList();
    }

    @GET
    @Path("/param")
    @Produces(MediaType.TEXT_XML)
    public List<Param> listAllParam() {
        final CriteriaQuery<Param> criteria = em.getCriteriaBuilder().createQuery(Param.class);
        final Root<Param> appRoot = criteria.from(Param.class);
        criteria.select(appRoot);
        return em.createQuery(criteria).getResultList();
    }
}
