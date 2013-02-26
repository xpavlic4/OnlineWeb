package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.onlineweb.api.Parameter;
import com.focusmr.online.onlineweb.logic.ParamQueryObject;
import com.focusmr.online.onlineweb.logic.ParamResolver;
import com.focusmr.online.onlineweb.rest.api.ParameterResourceRESTService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
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
@Path("/users/{userId}/apps/{appId}/countries/{countryId}/")
@RequestScoped
public class ParameterResourceRESTServiceImpl implements ParameterResourceRESTService {

    @Inject
    private ParamResolver resolver;

    @Override
    @GET
    @Path("/params/{name}")
    @Produces({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
    public Parameter evaluateParam(@PathParam("userId") Integer userId,
                                   @PathParam("appId") Integer appId,
                                   @PathParam("countryId") Integer countryId, @PathParam("name") String name
    ) throws SQLException, NamingException {

        ParamQueryObject o = ParamQueryObject.builder().userId(userId).applicationId(appId).countryId(countryId).name(name).build();
        return resolver.process(o);
    }


}
