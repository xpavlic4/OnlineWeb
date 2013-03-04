package com.focusmr.online.onlineweb.rest.api;

import com.focusmr.online.onlineweb.model.*;

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

    @GET
    @Path("/agtreelvldef")
    @Produces(MediaType.TEXT_XML)
    List<AgtreeLvlDef> listAllAgtreelvldef();

    @GET
    @Path("/daytable")
    @Produces(MediaType.TEXT_XML)
    List<DayTable> listAllDayTable();

    @GET
    @Path("/frequency")
    @Produces(MediaType.TEXT_XML)
    List<Frequency> listAllFrequency();

    @GET
    @Path("/gavtype")
    @Produces(MediaType.TEXT_XML)
    List<GavType> listAllGavType();

    @GET
    @Path("/GlobalAccountRingType")
    @Produces(MediaType.TEXT_XML)
    List<GlobalAccountRingType> listAllGlobalAccountRingType();

    @GET
    @Path("/GlobalCorporation")
    @Produces(MediaType.TEXT_XML)
    List<GlobalCorporation> listAllGlobalCorporation();

    @GET
    @Path("/GlobalCorporation")
    @Produces(MediaType.TEXT_XML)
    List<GlobalCustomCodeTypes> listAllGlobalCustomCodeTypes();

    @GET
    @Path("/GlobalGavCategory")
    @Produces(MediaType.TEXT_XML)
    List<GlobalGavCategory> listAllglobalGavCategoryId();

    @GET
    @Path("/GlobalKeyAccount")
    @Produces(MediaType.TEXT_XML)
    List<GlobalKeyAccount> listAllGlobalKeyAccount();

    @GET
    @Path("/GlobalPackagingCycle")
    @Produces(MediaType.TEXT_XML)
    List<GlobalPackagingCycle> listAllGlobalPackagingCycle();

    @GET
    @Path("/GlobalPackagingForm")
    @Produces(MediaType.TEXT_XML)
    List<GlobalPackagingForm> listAllGlobalPackagingForm();

    @GET
    @Path("/GlobalPackagingMaterial")
    @Produces(MediaType.TEXT_XML)
    List<GlobalPackagingMaterial> listAllGlobalPackagingMaterial();

    @GET
    @Path("/GlobalTcSet")
    @Produces(MediaType.TEXT_XML)
    List<GlobalTcSet> listAllGlobalTcSet();

    @GET
    @Path("/GroupTable")
    @Produces(MediaType.TEXT_XML)
    List<GroupTable> listAllGroupTable();

    @GET
    @Path("/Locale")
    @Produces(MediaType.TEXT_XML)
    List<Locale> listAllLocale();

    @GET
    @Path("/LocaleVariation")
    @Produces(MediaType.TEXT_XML)
    List<LocaleVariation> listAllLLocaleVariation();

    @GET
    @Path("/LogType")
    @Produces(MediaType.TEXT_XML)
    List<LogType> listAllLLLogType();

    @GET
    @Path("/MailerType")
    @Produces(MediaType.TEXT_XML)
    List<MailerType> listAllMailerType();

    @GET
    @Path("/Module")
    @Produces(MediaType.TEXT_XML)
    List<Module> listAllModule();

    @GET
    @Path("/ModuleCategory")
    @Produces(MediaType.TEXT_XML)
    List<ModuleCategory> listAllModuleCategorye();

    @GET
    @Path("/ParamGroup")
    @Produces(MediaType.TEXT_XML)
    List<ParamGroup> listAllParamGroup();

    @GET
    @Path("/ResourceTable")
    @Produces(MediaType.TEXT_XML)
    List<ResourceTable> listAllResourceTable(@QueryParam("offset") int offset);
}
