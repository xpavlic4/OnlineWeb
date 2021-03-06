package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GAV_TYPE")
@Entity
@XmlRootElement
public class GavType {
    private int typeId;

    @javax.persistence.Column(name = "TYPE_ID")
    @Id
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    private String type;

    @javax.persistence.Column(name = "GAV_TYPE")
    @Basic
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GavType gavType1 = (GavType) o;

        if (typeId != gavType1.typeId) return false;
        if (type != null ? !type.equals(gavType1.type) : gavType1.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeId;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
