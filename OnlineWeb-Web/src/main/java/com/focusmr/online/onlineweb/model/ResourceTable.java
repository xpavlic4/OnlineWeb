package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "RESOURCE_TABLE")
@Entity
public class ResourceTable {
    private int resourceId;

    @javax.persistence.Column(name = "RESOURCE_ID")
    @Id
    int getResourceId() {
        return resourceId;
    }

    void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    private String resourceName;

    @javax.persistence.Column(name = "RESOURCE_NAME")
    @Basic
    String getResourceName() {
        return resourceName;
    }

    void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResourceTable that = (ResourceTable) o;

        if (resourceId != that.resourceId) return false;
        if (resourceName != null ? !resourceName.equals(that.resourceName) : that.resourceName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = resourceId;
        result = 31 * result + (resourceName != null ? resourceName.hashCode() : 0);
        return result;
    }
}
