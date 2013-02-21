package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * com.focusmr.online.onlineweb.model.UserTable entity.
 */
@javax.persistence.Table(name = "USER_TABLE", schema = "ONLINE_AUTH")
@Entity
@XmlRootElement
public class UserTable {
    private int userId;

    @javax.persistence.Column(name = "USER_ID")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private String userName;

    @javax.persistence.Column(name = "USER_NAME")
    @Basic
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @SuppressWarnings("RedundantIfStatement")
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTable userTable = (UserTable) o;

        if (userId != userTable.userId) return false;
        if (userName != null ? !userName.equals(userTable.userName) : userTable.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
