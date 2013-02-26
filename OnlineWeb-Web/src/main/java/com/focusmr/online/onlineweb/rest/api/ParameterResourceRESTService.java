package com.focusmr.online.onlineweb.rest.api;

import com.focusmr.online.onlineweb.api.Parameter;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

/**
 * Evaluates parameters stored with different visibility. E.g. international-only, global, user-based scope etc.
 */
public interface ParameterResourceRESTService {
    /**
     * Gets evaluated parameter.
     *
     * @param userId    user id
     * @param appId     id of applicatoin
     * @param countryId id of country
     * @param name      name of parameter
     * @return parameter key and value
     * @throws java.sql.SQLException
     * @throws javax.naming.NamingException E.g. http://js2:9090/OnlineWeb-Web/rest/version1/users/1/apps/1/countries/1/params/locale
     *                                      <pre> {@code
     *                                                                                      <parameter>
     *                                                                                         <key>locale</key>
     *                                                                                        <value>en_GB</value>
     *                                                                                      </parameter>
     *                                                                                      }
     *                                                                                      </pre>
     */
    @GET
    @Path("/params/{name}")
    @Produces({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
    Parameter evaluateParam(@PathParam("userId") Integer userId,
                            @PathParam("appId") Integer appId,
                            @PathParam("countryId") Integer countryId, @PathParam("name") String name
    ) throws SQLException, NamingException;
}
