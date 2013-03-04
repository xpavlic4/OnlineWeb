package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GLOBAL_GAV_CATEGORY")
@Entity
public class GlobalGavCategory {
    private int globalGavCategoryId;

    @javax.persistence.Column(name = "GLOBAL_GAV_CATEGORY_ID")
    @Id
    int getGlobalGavCategoryId() {
        return globalGavCategoryId;
    }

    void setGlobalGavCategoryId(int globalGavCategoryId) {
        this.globalGavCategoryId = globalGavCategoryId;
    }

    private String gavCategory;

    @javax.persistence.Column(name = "GAV_CATEGORY")
    @Basic
    String getGavCategory() {
        return gavCategory;
    }

    void setGavCategory(String gavCategory) {
        this.gavCategory = gavCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalGavCategory that = (GlobalGavCategory) o;

        if (globalGavCategoryId != that.globalGavCategoryId) return false;
        if (gavCategory != null ? !gavCategory.equals(that.gavCategory) : that.gavCategory != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = globalGavCategoryId;
        result = 31 * result + (gavCategory != null ? gavCategory.hashCode() : 0);
        return result;
    }
}
