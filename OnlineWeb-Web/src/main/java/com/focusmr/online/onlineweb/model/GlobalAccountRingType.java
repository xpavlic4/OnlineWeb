package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GLOBAL_ACCOUNT_RING_TYPE")
@Entity
public class GlobalAccountRingType {
    private int accRingTypeId;

    @javax.persistence.Column(name = "ACC_RING_TYPE_ID")
    @Id
    int getAccRingTypeId() {
        return accRingTypeId;
    }

    void setAccRingTypeId(int accRingTypeId) {
        this.accRingTypeId = accRingTypeId;
    }

    private String accRingType;

    @javax.persistence.Column(name = "ACC_RING_TYPE")
    @Basic
    String getAccRingType() {
        return accRingType;
    }

    void setAccRingType(String accRingType) {
        this.accRingType = accRingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalAccountRingType that = (GlobalAccountRingType) o;

        if (accRingTypeId != that.accRingTypeId) return false;
        if (accRingType != null ? !accRingType.equals(that.accRingType) : that.accRingType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accRingTypeId;
        result = 31 * result + (accRingType != null ? accRingType.hashCode() : 0);
        return result;
    }
}
