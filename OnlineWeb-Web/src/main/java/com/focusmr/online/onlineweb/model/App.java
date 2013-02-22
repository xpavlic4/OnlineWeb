package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * App entity.
 */
@Entity
@XmlRootElement
@NamedQuery(name = App.BY_ID, query = "select a from App a where a.appId = :id")
public class App {
    public static final String BY_ID = "App.byId";
    private int appId;

    @javax.persistence.Column(name = "APP_ID")
    @Id
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    private String appName;

    @javax.persistence.Column(name = "APP_NAME")
    @Basic
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
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

    @SuppressWarnings("RedundantIfStatement")
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        App app = (App) o;

        if (appId != app.appId) return false;
        if (appName != null ? !appName.equals(app.appName) : app.appName != null) return false;
        if (displayName != null ? !displayName.equals(app.displayName) : app.displayName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appId;
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        return result;
    }

}
