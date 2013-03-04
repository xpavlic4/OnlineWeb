package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "MAILER_TYPE")
@Entity
@XmlRootElement
public class MailerType {
    private int mailerTypeId;

    @javax.persistence.Column(name = "MAILER_TYPE_ID")
    @Id
    public int getMailerTypeId() {
        return mailerTypeId;
    }

    public void setMailerTypeId(int mailerTypeId) {
        this.mailerTypeId = mailerTypeId;
    }

    private String mailerType;

    @javax.persistence.Column(name = "MAILER_TYPE")
    @Basic
    public String getMailerType() {
        return mailerType;
    }

    public void setMailerType(String mailerType) {
        this.mailerType = mailerType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MailerType that = (MailerType) o;

        if (mailerTypeId != that.mailerTypeId) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (mailerType != null ? !mailerType.equals(that.mailerType) : that.mailerType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mailerTypeId;
        result = 31 * result + (mailerType != null ? mailerType.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        return result;
    }
}
