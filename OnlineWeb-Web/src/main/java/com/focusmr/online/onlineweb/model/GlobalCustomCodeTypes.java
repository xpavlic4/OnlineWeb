package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GLOBAL_CUSTOM_CODE_TYPES")
@Entity
@XmlRootElement
public class GlobalCustomCodeTypes {
    private int customCodeTypeId;

    @javax.persistence.Column(name = "CUSTOM_CODE_TYPE_ID")
    @Id
    public int getCustomCodeTypeId() {
        return customCodeTypeId;
    }

    public void setCustomCodeTypeId(int customCodeTypeId) {
        this.customCodeTypeId = customCodeTypeId;
    }

    private String customCodeType;

    @javax.persistence.Column(name = "CUSTOM_CODE_TYPE")
    @Basic
    public String getCustomCodeType() {
        return customCodeType;
    }

    public void setCustomCodeType(String customCodeType) {
        this.customCodeType = customCodeType;
    }

    private String customCodeTypeShort;

    @javax.persistence.Column(name = "CUSTOM_CODE_TYPE_SHORT")
    @Basic
    public String getCustomCodeTypeShort() {
        return customCodeTypeShort;
    }

    public void setCustomCodeTypeShort(String customCodeTypeShort) {
        this.customCodeTypeShort = customCodeTypeShort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalCustomCodeTypes that = (GlobalCustomCodeTypes) o;

        if (customCodeTypeId != that.customCodeTypeId) return false;
        if (customCodeType != null ? !customCodeType.equals(that.customCodeType) : that.customCodeType != null)
            return false;
        if (customCodeTypeShort != null ? !customCodeTypeShort.equals(that.customCodeTypeShort) : that.customCodeTypeShort != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customCodeTypeId;
        result = 31 * result + (customCodeType != null ? customCodeType.hashCode() : 0);
        result = 31 * result + (customCodeTypeShort != null ? customCodeTypeShort.hashCode() : 0);
        return result;
    }
}
