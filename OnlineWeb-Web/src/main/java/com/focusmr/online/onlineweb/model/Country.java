package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement
@NamedQuery(name = Country.BY_ID, query = "select a from Country a where a.countryId = :id")
public class Country {
    final public static String BY_ID = "Country.byId";
    private int countryId;

    @javax.persistence.Column(name = "COUNTRY_ID")
    @Id
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    private String displayName;

    @javax.persistence.Column(name = "DISPLAY_NAME")
    @Basic
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    private String countryName;

    @javax.persistence.Column(name = "COUNTRY_NAME")
    @Basic
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    private int defaultLocaleId;

    @javax.persistence.Column(name = "DEFAULT_LOCALE_ID")
    @Basic
    public int getDefaultLocaleId() {
        return defaultLocaleId;
    }

    public void setDefaultLocaleId(int defaultLocaleId) {
        this.defaultLocaleId = defaultLocaleId;
    }

    @SuppressWarnings("RedundantIfStatement")
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (countryId != country.countryId) return false;
        if (defaultLocaleId != country.defaultLocaleId) return false;
        if (countryName != null ? !countryName.equals(country.countryName) : country.countryName != null) return false;
        if (displayName != null ? !displayName.equals(country.displayName) : country.displayName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryId;
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + defaultLocaleId;
        return result;
    }
}
