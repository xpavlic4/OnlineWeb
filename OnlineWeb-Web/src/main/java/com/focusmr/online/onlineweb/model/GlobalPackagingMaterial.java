package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GLOBAL_PACKAGING_MATERIAL")
@Entity
public class GlobalPackagingMaterial {
    private int materialId;

    @javax.persistence.Column(name = "MATERIAL_ID")
    @Id
    int getMaterialId() {
        return materialId;
    }

    void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    private String material;

    @javax.persistence.Column(name = "MATERIAL")
    @Basic
    String getMaterial() {
        return material;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalPackagingMaterial that = (GlobalPackagingMaterial) o;

        if (materialId != that.materialId) return false;
        if (material != null ? !material.equals(that.material) : that.material != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialId;
        result = 31 * result + (material != null ? material.hashCode() : 0);
        return result;
    }
}
