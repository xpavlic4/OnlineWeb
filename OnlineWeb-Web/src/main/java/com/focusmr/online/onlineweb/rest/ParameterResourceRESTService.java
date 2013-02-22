package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.onlineweb.api.Parameter;
import com.focusmr.online.onlineweb.logic.ParamQueryObject;
import com.focusmr.online.onlineweb.logic.ParamResolver;

import javax.enterprise.context.RequestScoped;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

/**
 * Gets pramatere value for specified user, app and country.
 */
@Path("/users/{userId}/apps/{appId}/countries/{country}/")
@RequestScoped
public class ParameterResourceRESTService {

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

        ParamQueryObject o = ParamQueryObject.builder().userId(userId).applicationId(applicationId).countryId(countryId).name(aName).build();
        return new ParamResolver().process(o);
    }


}
