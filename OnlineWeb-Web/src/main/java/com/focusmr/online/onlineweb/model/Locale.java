package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@Entity
public class Locale {
    private int localeId;

    @javax.persistence.Column(name = "LOCALE_ID")
    @Id
    int getLocaleId() {
        return localeId;
    }

    void setLocaleId(int localeId) {
        this.localeId = localeId;
    }

    private String localeString;

    @javax.persistence.Column(name = "LOCALE_STRING")
    @Basic
    String getLocaleString() {
        return localeString;
    }

    void setLocaleString(String localeString) {
        this.localeString = localeString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Locale locale = (Locale) o;

        if (localeId != locale.localeId) return false;
        if (localeString != null ? !localeString.equals(locale.localeString) : locale.localeString != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = localeId;
        result = 31 * result + (localeString != null ? localeString.hashCode() : 0);
        return result;
    }
}
