package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@Entity
@XmlRootElement
public class Frequency {
    private int frequencyId;

    @javax.persistence.Column(name = "FREQUENCY_ID")
    @Id
    public int getFrequencyId() {
        return frequencyId;
    }

    public void setFrequencyId(int frequencyId) {
        this.frequencyId = frequencyId;
    }

    private String frequencyName;

    @javax.persistence.Column(name = "FREQUENCY_NAME")
    @Basic
    public String getFrequencyName() {
        return frequencyName;
    }

    public void setFrequencyName(String frequencyName) {
        this.frequencyName = frequencyName;
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

        Frequency frequency = (Frequency) o;

        if (frequencyId != frequency.frequencyId) return false;
        if (displayName != null ? !displayName.equals(frequency.displayName) : frequency.displayName != null)
            return false;
        if (frequencyName != null ? !frequencyName.equals(frequency.frequencyName) : frequency.frequencyName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = frequencyId;
        result = 31 * result + (frequencyName != null ? frequencyName.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        return result;
    }
}
