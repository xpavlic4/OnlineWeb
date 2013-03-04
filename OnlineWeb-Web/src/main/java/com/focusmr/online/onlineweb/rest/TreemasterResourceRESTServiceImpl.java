package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.onlineweb.model.TreemasterAgtree;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

/**
 * Gets userid from treemaster table for given agtreeId
 */
@Path("/treemaster/")
@RequestScoped
public class TreemasterResourceRESTServiceImpl {

    @Inject
    private EntityManager em;

    @GET
    @Path("/{agtreeId}}")
    @Produces({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
    public TreemasterAgtree evaluate(@PathParam("agtreeId") Integer agtreeId) throws SQLException, NamingException {
        final TypedQuery<TreemasterAgtree> namedQuery = em.createNamedQuery(TreemasterAgtree.BY_AGTREE_ID, TreemasterAgtree.class);
        namedQuery.setParameter("agtreeId", agtreeId);
        return namedQuery.getSingleResult();
    }
}
