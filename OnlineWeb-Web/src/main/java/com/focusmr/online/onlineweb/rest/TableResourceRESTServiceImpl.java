package com.focusmr.online.onlineweb.rest;

import com.focusmr.online.onlineweb.model.*;
import com.focusmr.online.onlineweb.rest.api.TableResourceRESTService;

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
public class TableResourceRESTServiceImpl implements TableResourceRESTService {
    @Inject
    private EntityManager em;

    @Override
    @GET
    @Path("/App")
    @Produces(MediaType.TEXT_XML)
    public List<App> listAllApp() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<App> criteria = criteriaBuilder.createQuery(App.class);
        final Root<App> appRoot = criteria.from(App.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("appId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/App/{id}")
    @Produces(MediaType.TEXT_XML)
    public App listAppById(@PathParam("id") Integer id) {
        final TypedQuery<App> namedQuery = em.createNamedQuery(App.BY_ID, App.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @Override
    @GET
    @Path("/Country")
    @Produces(MediaType.TEXT_XML)
    public List<Country> listAllCounntry() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<Country> criteria = criteriaBuilder.createQuery(Country.class);
        final Root<Country> appRoot = criteria.from(Country.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("countryId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/Country/{id}")
    @Produces(MediaType.TEXT_XML)
    public Country listCountryById(@PathParam("id") Integer id) {
        final TypedQuery<Country> namedQuery = em.createNamedQuery(Country.BY_ID, Country.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @Override
    @GET
    @Path("/Param")
    @Produces(MediaType.TEXT_XML)
    public List<Param> listAllParam() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<Param> criteria = criteriaBuilder.createQuery(Param.class);
        final Root<Param> appRoot = criteria.from(Param.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("paramId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/Param/{id}")
    @Produces(MediaType.TEXT_XML)
    public Param listParamById(@PathParam("id") Integer id) {
        final TypedQuery<Param> namedQuery = em.createNamedQuery(Param.BY_ID, Param.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @Override
    @GET
    @Path("/UserTable")
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

    @Override
    @GET
    @Path("/UserTable/{id}")
    @Produces(MediaType.TEXT_XML)
    public UserTable listUsertableById(@PathParam("id") Integer id) {
        final TypedQuery<UserTable> namedQuery = em.createNamedQuery(UserTable.USER_BYID, UserTable.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @Override
    @GET
    @Path("/AgtreeLvlDef")
    @Produces(MediaType.TEXT_XML)
    public List<AgtreeLvlDef> listAllAgtreelvldef() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<AgtreeLvlDef> criteria = criteriaBuilder.createQuery(AgtreeLvlDef.class);
        final Root<AgtreeLvlDef> appRoot = criteria.from(AgtreeLvlDef.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("lvlDefId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/DayTable")
    @Produces(MediaType.TEXT_XML)
    public List<DayTable> listAllDayTable() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<DayTable> criteria = criteriaBuilder.createQuery(DayTable.class);
        final Root<DayTable> appRoot = criteria.from(DayTable.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("dayId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/Frequency")
    @Produces(MediaType.TEXT_XML)
    public List<Frequency> listAllFrequency() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<Frequency> criteria = criteriaBuilder.createQuery(Frequency.class);
        final Root<Frequency> appRoot = criteria.from(Frequency.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("frequencyId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/GavType")
    @Produces(MediaType.TEXT_XML)
    public List<GavType> listAllGavType() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<GavType> criteria = criteriaBuilder.createQuery(GavType.class);
        final Root<GavType> appRoot = criteria.from(GavType.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("typeId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/GlobalAccountRingType")
    @Produces(MediaType.TEXT_XML)
    public List<GlobalAccountRingType> listAllGlobalAccountRingType() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<GlobalAccountRingType> criteria = criteriaBuilder.createQuery(GlobalAccountRingType.class);
        final Root<GlobalAccountRingType> appRoot = criteria.from(GlobalAccountRingType.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("accRingTypeId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/GlobalCorporation")
    @Produces(MediaType.TEXT_XML)
    public List<GlobalCorporation> listAllGlobalCorporation() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<GlobalCorporation> criteria = criteriaBuilder.createQuery(GlobalCorporation.class);
        final Root<GlobalCorporation> appRoot = criteria.from(GlobalCorporation.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("corporationId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/GlobalCorporation")
    @Produces(MediaType.TEXT_XML)
    public List<GlobalCustomCodeTypes> listAllGlobalCustomCodeTypes() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<GlobalCustomCodeTypes> criteria = criteriaBuilder.createQuery(GlobalCustomCodeTypes.class);
        final Root<GlobalCustomCodeTypes> appRoot = criteria.from(GlobalCustomCodeTypes.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("customCodeTypeId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/GlobalGavCategory")
    @Produces(MediaType.TEXT_XML)
    public List<GlobalGavCategory> listAllglobalGavCategoryId() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<GlobalGavCategory> criteria = criteriaBuilder.createQuery(GlobalGavCategory.class);
        final Root<GlobalGavCategory> appRoot = criteria.from(GlobalGavCategory.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("globalGavCategoryId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/GlobalKeyAccount")
    @Produces(MediaType.TEXT_XML)
    public List<GlobalKeyAccount> listAllGlobalKeyAccount() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<GlobalKeyAccount> criteria = criteriaBuilder.createQuery(GlobalKeyAccount.class);
        final Root<GlobalKeyAccount> appRoot = criteria.from(GlobalKeyAccount.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("keyAccountId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/GlobalPackagingCycle")
    @Produces(MediaType.TEXT_XML)
    public List<GlobalPackagingCycle> listAllGlobalPackagingCycle() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<GlobalPackagingCycle> criteria = criteriaBuilder.createQuery(GlobalPackagingCycle.class);
        final Root<GlobalPackagingCycle> appRoot = criteria.from(GlobalPackagingCycle.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("cycleId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/GlobalPackagingForm")
    @Produces(MediaType.TEXT_XML)
    public List<GlobalPackagingForm> listAllGlobalPackagingForm() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<GlobalPackagingForm> criteria = criteriaBuilder.createQuery(GlobalPackagingForm.class);
        final Root<GlobalPackagingForm> appRoot = criteria.from(GlobalPackagingForm.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("formId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/GlobalPackagingMaterial")
    @Produces(MediaType.TEXT_XML)
    public List<GlobalPackagingMaterial> listAllGlobalPackagingMaterial() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<GlobalPackagingMaterial> criteria = criteriaBuilder.createQuery(GlobalPackagingMaterial.class);
        final Root<GlobalPackagingMaterial> appRoot = criteria.from(GlobalPackagingMaterial.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("materialId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/GlobalTcSet")
    @Produces(MediaType.TEXT_XML)
    public List<GlobalTcSet> listAllGlobalTcSet() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<GlobalTcSet> criteria = criteriaBuilder.createQuery(GlobalTcSet.class);
        final Root<GlobalTcSet> appRoot = criteria.from(GlobalTcSet.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("globalTcSetId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/GroupTable")
    @Produces(MediaType.TEXT_XML)
    public List<GroupTable> listAllGroupTable() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<GroupTable> criteria = criteriaBuilder.createQuery(GroupTable.class);
        final Root<GroupTable> appRoot = criteria.from(GroupTable.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("groupId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/Locale")
    @Produces(MediaType.TEXT_XML)
    public List<Locale> listAllLocale() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<Locale> criteria = criteriaBuilder.createQuery(Locale.class);
        final Root<Locale> appRoot = criteria.from(Locale.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("localeId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/LocaleVariation")
    @Produces(MediaType.TEXT_XML)
    public List<LocaleVariation> listAllLLocaleVariation() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<LocaleVariation> criteria = criteriaBuilder.createQuery(LocaleVariation.class);
        final Root<LocaleVariation> appRoot = criteria.from(LocaleVariation.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("variationId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/LogType")
    @Produces(MediaType.TEXT_XML)
    public List<LogType> listAllLLLogType() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<LogType> criteria = criteriaBuilder.createQuery(LogType.class);
        final Root<LogType> appRoot = criteria.from(LogType.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("logTypeId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/MailerType")
    @Produces(MediaType.TEXT_XML)
    public List<MailerType> listAllMailerType() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<MailerType> criteria = criteriaBuilder.createQuery(MailerType.class);
        final Root<MailerType> appRoot = criteria.from(MailerType.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("mailerTypeId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/Module")
    @Produces(MediaType.TEXT_XML)
    public List<Module> listAllModule() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<Module> criteria = criteriaBuilder.createQuery(Module.class);
        final Root<Module> appRoot = criteria.from(Module.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("moduleId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/ModuleCategory")
    @Produces(MediaType.TEXT_XML)
    public List<ModuleCategory> listAllModuleCategorye() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<ModuleCategory> criteria = criteriaBuilder.createQuery(ModuleCategory.class);
        final Root<ModuleCategory> appRoot = criteria.from(ModuleCategory.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("moduleCategoryId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/ParamGroup")
    @Produces(MediaType.TEXT_XML)
    public List<ParamGroup> listAllParamGroup() {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<ParamGroup> criteria = criteriaBuilder.createQuery(ParamGroup.class);
        final Root<ParamGroup> appRoot = criteria.from(ParamGroup.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("paramGroupId")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    @GET
    @Path("/ResourceTable")
    @Produces(MediaType.TEXT_XML)
    public List<ResourceTable> listAllResourceTable(@QueryParam("offset") int offset) {
        final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        final CriteriaQuery<ResourceTable> criteria = criteriaBuilder.createQuery(ResourceTable.class);
        final Root<ResourceTable> appRoot = criteria.from(ResourceTable.class);
        criteria.select(appRoot);
        criteria.orderBy(criteriaBuilder.asc(appRoot.get("resourceId")));
        final TypedQuery<ResourceTable> query = em.createQuery(criteria);
        query.setMaxResults(10);
        if (offset != 0) {
            query.setFirstResult(offset);
        }
        return query.getResultList();
    }
}
