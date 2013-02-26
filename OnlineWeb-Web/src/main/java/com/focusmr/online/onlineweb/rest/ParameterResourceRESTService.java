package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.onlineweb.api.Parameter;
import com.focusmr.online.onlineweb.logic.ParamQueryObject;
import com.focusmr.online.onlineweb.logic.ParamResolver;

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
public class ParameterResourceRESTService {

    @Inject
    private ParamResolver resolver;

    /**
     * Gets evaluated parameter.
     *
     * @param userId    user id
     * @param appId     id of applicatoin
     * @param countryId id of country
     * @param name      name of parameter
     * @return parameter key and value
     * @throws SQLException
     * @throws NamingException E.g. http://js2:9090/OnlineWeb-Web/rest/version1/users/1/apps/1/countries/1/params/locale
     *                         <pre> {@code
     *                                                 <parameter>
     *                                                    <key>locale</key>
     *                                                   <value>en_GB</value>
     *                                                 </parameter>
     *                                                 }
     *                                                 </pre>
     */
    @GET
    @Path("/params/{name}")
    @Produces({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
    public Parameter listAllParameters(@PathParam("userId") Integer userId,
                                       @PathParam("appId") Integer appId,
                                       @PathParam("countryId") Integer countryId, @PathParam("name") String name
    ) throws SQLException, NamingException {

        ParamQueryObject o = ParamQueryObject.builder().userId(userId).applicationId(appId).countryId(countryId).name(name).build();
        return resolver.process(o);
    }


}
