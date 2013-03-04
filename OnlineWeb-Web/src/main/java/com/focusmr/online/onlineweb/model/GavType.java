package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GAV_TYPE")
@Entity
public class GavType {
    private int typeId;

    @javax.persistence.Column(name = "TYPE_ID")
    @Id
    int getTypeId() {
        return typeId;
    }

    void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    private String gavType;

    @javax.persistence.Column(name = "GAV_TYPE")
    @Basic
    String getGavType() {
        return gavType;
    }

    void setGavType(String gavType) {
        this.gavType = gavType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GavType gavType1 = (GavType) o;

        if (typeId != gavType1.typeId) return false;
        if (gavType != null ? !gavType.equals(gavType1.gavType) : gavType1.gavType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeId;
        result = 31 * result + (gavType != null ? gavType.hashCode() : 0);
        return result;
    }
}
