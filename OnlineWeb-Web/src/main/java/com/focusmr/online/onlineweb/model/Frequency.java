package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@Entity
public class Frequency {
    private int frequencyId;

    @javax.persistence.Column(name = "FREQUENCY_ID")
    @Id
    int getFrequencyId() {
        return frequencyId;
    }

    void setFrequencyId(int frequencyId) {
        this.frequencyId = frequencyId;
    }

    private String frequencyName;

    @javax.persistence.Column(name = "FREQUENCY_NAME")
    @Basic
    String getFrequencyName() {
        return frequencyName;
    }

    void setFrequencyName(String frequencyName) {
        this.frequencyName = frequencyName;
    }

    private String displayName;

    @javax.persistence.Column(name = "DISPLAY_NAME")
    @Basic
    String getDisplayName() {
        return displayName;
    }

    void setDisplayName(String displayName) {
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
