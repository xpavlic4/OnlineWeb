package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GLOBAL_KEY_ACCOUNT")
@Entity
@XmlRootElement
public class GlobalKeyAccount {
    private int keyAccountId;

    @javax.persistence.Column(name = "KEY_ACCOUNT_ID")
    @Id
    public int getKeyAccountId() {
        return keyAccountId;
    }

    public void setKeyAccountId(int keyAccountId) {
        this.keyAccountId = keyAccountId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalKeyAccount that = (GlobalKeyAccount) o;

        if (keyAccountId != that.keyAccountId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keyAccountId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
