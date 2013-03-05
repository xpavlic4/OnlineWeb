package com.focusmr.online.onlineweb.logic;

import com.focusmr.online.db.JavaConnectionFactory;
import com.focusmr.online.onlineweb.api.Parameter;
import com.focusmr.online.onlineweb.model.UserTable;
import com.focusmr.online.userdb.PrefsBase;
import com.focusmr.online.userdb.ReadParam;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * Resolves value of given param.
 */
@ApplicationScoped
public class ParamResolver {
    private final JavaConnectionFactory factory = new JavaConnectionFactory();
    @Inject
    EntityManager em;


    /**
     * Process params and find value of parameter.
     *
     * @param o required values to lookup
     * @return param value object
     * @throws SQLException
     * @throws NamingException
     */
    public Parameter process(ParamQueryObject o) throws SQLException, NamingException {
        Integer masterId = findMasterId(o);
        final PrefsBase prefsBase = new PrefsBase(o.getUserId(), masterId, o.getApplicatoinId(), o.getCountryId(), factory);
        final ReadParam param = prefsBase.getParam(o.getName());
        final Parameter parameter = new Parameter();

        final List<Object> values = param.getValues();
        if (null != values) {
            parameter.setValue(Arrays.toString(values.toArray()));
        } else {
            parameter.setValue(String.valueOf(param.getValue()));
        }

        parameter.setKey(o.getName());
        parameter.setApplicationId(param.getApplicationId());
        parameter.setCountryId(param.getCountryId());
        parameter.setMemoryOnly(param.getMemoryOnly());
        parameter.setModify(param.getModify());
        parameter.setOverrideInternational(param.getOverrideInternational());
        parameter.setOverrideMaster(param.getOverrideMaster());
        parameter.setUserId(param.getUserId());
        return parameter;
    }

    /**
     * Finds master of given user
     *
     * @param o user id
     * @return master id
     */
    private Integer findMasterId(ParamQueryObject o) {
        final TypedQuery<UserTable> namedQuery = em.createNamedQuery(UserTable.USER_BYID, UserTable.class);
        namedQuery.setParameter("id", o.getUserId());
        final UserTable singleResult;
        try {
            singleResult = namedQuery.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
        @SuppressWarnings("UnnecessaryLocalVariable") final Integer belongsTo = singleResult.getBelongsTo();
        return belongsTo;

    }
}
