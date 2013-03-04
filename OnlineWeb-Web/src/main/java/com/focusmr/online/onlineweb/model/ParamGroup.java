package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "PARAM_GROUP")
@Entity
@XmlRootElement
public class ParamGroup {
    private int paramGroupId;

    @javax.persistence.Column(name = "PARAM_GROUP_ID")
    @Id
    public int getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(int paramGroupId) {
        this.paramGroupId = paramGroupId;
    }

    private String paramGroupName;

    @javax.persistence.Column(name = "PARAM_GROUP_NAME")
    @Basic
    public String getParamGroupName() {
        return paramGroupName;
    }

    public void setParamGroupName(String paramGroupName) {
        this.paramGroupName = paramGroupName;
    }

    private String displayName;

    @javax.persistence.Column(name = "DISPLAY_NAME")
    @Basic
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParamGroup that = (ParamGroup) o;

        if (paramGroupId != that.paramGroupId) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (paramGroupName != null ? !paramGroupName.equals(that.paramGroupName) : that.paramGroupName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paramGroupId;
        result = 31 * result + (paramGroupName != null ? paramGroupName.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        return result;
    }
}
