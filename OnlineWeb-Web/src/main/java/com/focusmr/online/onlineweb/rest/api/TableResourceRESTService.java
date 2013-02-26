package com.focusmr.online.onlineweb.rest.api;

import com.focusmr.online.onlineweb.model.App;
import com.focusmr.online.onlineweb.model.Country;
import com.focusmr.online.onlineweb.model.Param;
import com.focusmr.online.onlineweb.model.UserTable;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Provides REST to tables that are used for parameter REST ws.
 */
public interface TableResourceRESTService {
    /**
     * Gets all applications.
     *
     * @return list of applications
     */
    @GET
    @Path("/app")
    @Produces(MediaType.TEXT_XML)
    List<App> listAllApp();

    /**
     * Gets application of given id
     *
     * @param id id of applicatoin
     * @return application
     */
    @GET
    @Path("/app/{id}")
    @Produces(MediaType.TEXT_XML)
    App listAppById(@PathParam("id") Integer id);

    /**
     * Gets all countries.
     *
     * @return list of all countries
     */
    @GET
    @Path("/country")
    @Produces(MediaType.TEXT_XML)
    List<Country> listAllCounntry();

    /**
     * Gets country of specific id.
     *
     * @param id id of country
     * @return country
     */
    @GET
    @Path("/country/{id}")
    @Produces(MediaType.TEXT_XML)
    Country listCountryById(@PathParam("id") Integer id);

    /**
     * Gets all parameters.
     *
     * @return list of all parameters
     */
    @GET
    @Path("/param")
    @Produces(MediaType.TEXT_XML)
    List<Param> listAllParam();

    /**
     * Gets param with of given id.
     *
     * @param id id of param
     * @return param
     */
    @GET
    @Path("/param/{id}")
    @Produces(MediaType.TEXT_XML)
    Param listParamById(@PathParam("id") Integer id);

    /**
     * Gets 10 results of usertable from given offset sorted by userId.
     *
     * @param offset number of rows to be skipped
     * @return list of usertable
     */
    @GET
    @Path("/usertable")
    @Produces(MediaType.TEXT_XML)
    List<UserTable> listAllUsers(@QueryParam("offset") int offset);

    /**
     * Gets usertable of given id.
     *
     * @param id id of usertable
     * @return usertable
     */
    @GET
    @Path("/usertable/{id}")
    @Produces(MediaType.TEXT_XML)
    UserTable listUsertableById(@PathParam("id") Integer id);
}
