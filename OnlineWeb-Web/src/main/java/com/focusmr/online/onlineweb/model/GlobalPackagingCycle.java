package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GLOBAL_PACKAGING_CYCLE")
@Entity
@XmlRootElement
public class GlobalPackagingCycle {
    private int cycleId;

    @javax.persistence.Column(name = "CYCLE_ID")
    @Id
    public int getCycleId() {
        return cycleId;
    }

    public void setCycleId(int cycleId) {
        this.cycleId = cycleId;
    }

    private String cycle;

    @javax.persistence.Column(name = "CYCLE")
    @Basic
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalPackagingCycle that = (GlobalPackagingCycle) o;

        if (cycleId != that.cycleId) return false;
        if (cycle != null ? !cycle.equals(that.cycle) : that.cycle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cycleId;
        result = 31 * result + (cycle != null ? cycle.hashCode() : 0);
        return result;
    }
}
