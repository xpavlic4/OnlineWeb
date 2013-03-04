package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GLOBAL_TC_SET")
@Entity
@XmlRootElement
public class GlobalTcSet {
    private int globalTcSetId;

    @javax.persistence.Column(name = "GLOBAL_TC_SET_ID")
    @Id
    public int getGlobalTcSetId() {
        return globalTcSetId;
    }

    public void setGlobalTcSetId(int globalTcSetId) {
        this.globalTcSetId = globalTcSetId;
    }

    private String name;

    @javax.persistence.Column(name = "NAME")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String info;

    @javax.persistence.Column(name = "INFO")
    @Basic
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalTcSet that = (GlobalTcSet) o;

        if (globalTcSetId != that.globalTcSetId) return false;
        if (info != null ? !info.equals(that.info) : that.info != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = globalTcSetId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        return result;
    }
}
