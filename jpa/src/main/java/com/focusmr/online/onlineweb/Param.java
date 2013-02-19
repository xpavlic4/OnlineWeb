package com.focusmr.online.onlineweb;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Param entity.
 */
@Entity
public class Param {
    private int paramId;

    @javax.persistence.Column(name = "PARAM_ID")
    @Id
    public int getParamId() {
        return paramId;
    }

    public void setParamId(int paramId) {
        this.paramId = paramId;
    }

    private int paramGroupId;

    @javax.persistence.Column(name = "PARAM_GROUP_ID")
    @Basic
    public int getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(int paramGroupId) {
        this.paramGroupId = paramGroupId;
    }

    private String paramName;

    @javax.persistence.Column(name = "PARAM_NAME")
    @Basic
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
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

    private String paramComment;

    @javax.persistence.Column(name = "PARAM_COMMENT")
    @Basic
    public String getParamComment() {
        return paramComment;
    }

    public void setParamComment(String paramComment) {
        this.paramComment = paramComment;
    }

    private int paramIntTypeId;

    @javax.persistence.Column(name = "PARAM_INT_TYPE_ID")
    @Basic
    public int getParamIntTypeId() {
        return paramIntTypeId;
    }

    public void setParamIntTypeId(int paramIntTypeId) {
        this.paramIntTypeId = paramIntTypeId;
    }

    @SuppressWarnings("RedundantIfStatement")
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Param param = (Param) o;

        if (paramGroupId != param.paramGroupId) return false;
        if (paramId != param.paramId) return false;
        if (paramIntTypeId != param.paramIntTypeId) return false;
        if (displayName != null ? !displayName.equals(param.displayName) : param.displayName != null) return false;
        if (paramComment != null ? !paramComment.equals(param.paramComment) : param.paramComment != null) return false;
        if (paramName != null ? !paramName.equals(param.paramName) : param.paramName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paramId;
        result = 31 * result + paramGroupId;
        result = 31 * result + (paramName != null ? paramName.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + (paramComment != null ? paramComment.hashCode() : 0);
        result = 31 * result + paramIntTypeId;
        return result;
    }
}
