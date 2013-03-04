package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "DAY_TABLE")
@Entity
public class DayTable {
    private int dayId;

    @javax.persistence.Column(name = "DAY_ID")
    @Id
    int getDayId() {
        return dayId;
    }

    void setDayId(int dayId) {
        this.dayId = dayId;
    }

    private String dayName;

    @javax.persistence.Column(name = "DAY_NAME")
    @Basic
    String getDayName() {
        return dayName;
    }

    void setDayName(String dayName) {
        this.dayName = dayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DayTable dayTable = (DayTable) o;

        if (dayId != dayTable.dayId) return false;
        if (dayName != null ? !dayName.equals(dayTable.dayName) : dayTable.dayName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dayId;
        result = 31 * result + (dayName != null ? dayName.hashCode() : 0);
        return result;
    }
}
