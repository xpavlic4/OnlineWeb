package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.onlineweb.model.App;
import com.focusmr.online.onlineweb.model.Country;
import com.focusmr.online.onlineweb.model.Param;
import com.focusmr.online.onlineweb.model.UserTable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.*;
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
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<App> criteria = criteriaBuilder.createQuery(App.class);
        final Root<App> appRoot = criteria.from(App.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("appId")));
        return em.createQuery(criteria).getResultList();
    }

    @GET
    @Path("/app/{id}")
    @Produces(MediaType.TEXT_XML)
    public App listAppById(@PathParam("id") Integer id) {
        final TypedQuery<App> namedQuery = em.createNamedQuery(App.BY_ID, App.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @GET
    @Path("/country")
    @Produces(MediaType.TEXT_XML)
    public List<Country> listAllCounntry() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<Country> criteria = criteriaBuilder.createQuery(Country.class);
        final Root<Country> appRoot = criteria.from(Country.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("countryId")));
        return em.createQuery(criteria).getResultList();
    }

    @GET
    @Path("/country/{id}")
    @Produces(MediaType.TEXT_XML)
    public Country listCountryById(@PathParam("id") Integer id) {
        final TypedQuery<Country> namedQuery = em.createNamedQuery(Country.BY_ID, Country.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @GET
    @Path("/param")
    @Produces(MediaType.TEXT_XML)
    public List<Param> listAllParam() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<Param> criteria = criteriaBuilder.createQuery(Param.class);
        final Root<Param> appRoot = criteria.from(Param.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("paramId")));
        return em.createQuery(criteria).getResultList();
    }

    @GET
    @Path("/param/{id}")
    @Produces(MediaType.TEXT_XML)
    public Param listParamById(@PathParam("id") Integer id) {
        final TypedQuery<Param> namedQuery = em.createNamedQuery(Param.BY_ID, Param.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @GET
    @Path("/usertable")
    @Produces(MediaType.TEXT_XML)
    public List<UserTable> listAllUsers(@QueryParam("offset") int offset) {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<UserTable> criteria = criteriaBuilder.createQuery(UserTable.class);
        final Root<UserTable> appRoot = criteria.from(UserTable.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("userId")));
        final TypedQuery<UserTable> query = em.createQuery(criteria);
        query.setMaxResults(10);
        if (offset != 0) {
            query.setFirstResult(offset);
        }
        return query.getResultList();
    }

    @GET
    @Path("/usertable/{id}")
    @Produces(MediaType.TEXT_XML)
    public UserTable listUsertableById(@PathParam("id") Integer id) {
        final TypedQuery<UserTable> namedQuery = em.createNamedQuery(UserTable.USER_BYID, UserTable.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }
}
