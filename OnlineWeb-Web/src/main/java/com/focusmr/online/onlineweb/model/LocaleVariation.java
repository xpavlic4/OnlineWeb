package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "LOCALE_VARIATION")
@Entity
public class LocaleVariation {
    private int variationId;

    @javax.persistence.Column(name = "VARIATION_ID")
    @Id
    int getVariationId() {
        return variationId;
    }

    void setVariationId(int variationId) {
        this.variationId = variationId;
    }

    private String variationName;

    @javax.persistence.Column(name = "VARIATION_NAME")
    @Basic
    String getVariationName() {
        return variationName;
    }

    void setVariationName(String variationName) {
        this.variationName = variationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocaleVariation that = (LocaleVariation) o;

        if (variationId != that.variationId) return false;
        if (variationName != null ? !variationName.equals(that.variationName) : that.variationName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = variationId;
        result = 31 * result + (variationName != null ? variationName.hashCode() : 0);
        return result;
    }
}
