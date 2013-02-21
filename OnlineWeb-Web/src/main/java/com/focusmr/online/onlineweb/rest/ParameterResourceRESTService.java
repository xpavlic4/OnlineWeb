package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.db.ConnectionFactoryBase;
import com.focusmr.online.onlineweb.api.Parameter;
import com.focusmr.online.userdb.PrefsBase;
import com.focusmr.online.userdb.ReadParam;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

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
    @Path("/params/{name}")
    @Produces(MediaType.TEXT_XML)
    public Parameter listAllParameters(@PathParam("userId") String aUserId,
                                       @PathParam("appId") String aApplicationId,
                                       @PathParam("country") String aCountry, @PathParam("name") String aName
    ) throws SQLException, NamingException {
        final int userId = Integer.parseInt(aUserId);
        final int applicationId = Integer.parseInt(aApplicationId);
        final int countryId = Integer.parseInt(aCountry);
        final PrefsBase prefsBase = new PrefsBase(userId, 1, applicationId, countryId, new ConnectionFactoryBase());
        final ReadParam param = prefsBase.getParam(aName);
        return new Parameter(aName, param.getValue().toString());
    }


}
