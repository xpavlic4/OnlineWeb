package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "LOG_TYPE")
@Entity
@XmlRootElement
public class LogType {
    private int logTypeId;

    @javax.persistence.Column(name = "LOG_TYPE_ID")
    @Id
    public int getLogTypeId() {
        return logTypeId;
    }

    public void setLogTypeId(int logTypeId) {
        this.logTypeId = logTypeId;
    }

    private String logType;

    @javax.persistence.Column(name = "LOG_TYPE")
    @Basic
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogType logType1 = (LogType) o;

        if (logTypeId != logType1.logTypeId) return false;
        if (logType != null ? !logType.equals(logType1.logType) : logType1.logType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logTypeId;
        result = 31 * result + (logType != null ? logType.hashCode() : 0);
        return result;
    }
}
