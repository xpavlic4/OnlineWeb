package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "MODULE_CATEGORY")
@Entity
@XmlRootElement
public class ModuleCategory {
    private int moduleCategoryId;

    @javax.persistence.Column(name = "MODULE_CATEGORY_ID")
    @Id
    public int getModuleCategoryId() {
        return moduleCategoryId;
    }

    public void setModuleCategoryId(int moduleCategoryId) {
        this.moduleCategoryId = moduleCategoryId;
    }

    private String moduleCategoryName;

    @javax.persistence.Column(name = "MODULE_CATEGORY_NAME")
    @Basic
    public String getModuleCategoryName() {
        return moduleCategoryName;
    }

    public void setModuleCategoryName(String moduleCategoryName) {
        this.moduleCategoryName = moduleCategoryName;
    }

    private int orderKey;

    @javax.persistence.Column(name = "ORDER_KEY")
    @Basic
    public int getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(int orderKey) {
        this.orderKey = orderKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModuleCategory that = (ModuleCategory) o;

        if (moduleCategoryId != that.moduleCategoryId) return false;
        if (orderKey != that.orderKey) return false;
        if (moduleCategoryName != null ? !moduleCategoryName.equals(that.moduleCategoryName) : that.moduleCategoryName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduleCategoryId;
        result = 31 * result + (moduleCategoryName != null ? moduleCategoryName.hashCode() : 0);
        result = 31 * result + orderKey;
        return result;
    }
}
