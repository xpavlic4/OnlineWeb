package com.focusmr.online.onlineweb.api;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@SuppressWarnings("unused")
public class Parameter implements Serializable {
    private String key;
    private String value;
    private Integer applicationId;
    private Integer countryId;
    private Boolean memoryOnly;
    private Boolean modify;
    private Boolean overrideInternational;
    private Boolean overrideMaster;
    private Integer userId;

    public Parameter() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setMemoryOnly(Boolean memoryOnly) {
        this.memoryOnly = memoryOnly;
    }

    public Boolean getMemoryOnly() {
        return memoryOnly;
    }

    public void setModify(Boolean modify) {
        this.modify = modify;
    }

    public Boolean getModify() {
        return modify;
    }

    public void setOverrideInternational(Boolean overrideInternational) {
        this.overrideInternational = overrideInternational;
    }

    public Boolean getOverrideInternational() {
        return overrideInternational;
    }

    public void setOverrideMaster(Boolean overrideMaster) {
        this.overrideMaster = overrideMaster;
    }

    public Boolean getOverrideMaster() {
        return overrideMaster;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }
}