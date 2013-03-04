package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GLOBAL_CORPORATION")
@Entity
public class GlobalCorporation {
    private int corporationId;

    @javax.persistence.Column(name = "CORPORATION_ID")
    @Id
    int getCorporationId() {
        return corporationId;
    }

    void setCorporationId(int corporationId) {
        this.corporationId = corporationId;
    }

    private String name;

    @javax.persistence.Column(name = "NAME")
    @Basic
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalCorporation that = (GlobalCorporation) o;

        if (corporationId != that.corporationId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = corporationId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
