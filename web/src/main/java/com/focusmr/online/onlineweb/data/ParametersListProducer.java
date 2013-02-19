package com.focusmr.online.onlineweb.data;

import com.focusmr.online.onlineweb.Param;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@RequestScoped
public class ParametersListProducer {
    @SuppressWarnings("CdiInjectionPointsInspection")
    @Inject
    private EntityManager em;

    private List<Param> params;

    @Produces
    @Named
    public List<Param> getParams() {
        return params;
    }

    @PostConstruct
    public void retrieveAllMembersOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Param> criteria = cb.createQuery(Param.class);
        Root<Param> member = criteria.from(Param.class);
        criteria.select(member).orderBy(cb.asc(member.get("paramName")));
        params = em.createQuery(criteria).getResultList();
    }
}
