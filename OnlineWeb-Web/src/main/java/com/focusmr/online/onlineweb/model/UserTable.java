package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * com.focusmr.online.onlineweb.model.UserTable entity.
 */
@javax.persistence.Table(name = "USER_TABLE", schema = "ONLINE_AUTH")
@Entity
@XmlRootElement
@XmlType(propOrder = {"userId", "userName", "belongsTo"})
@NamedQuery(name = UserTable.USER_BYID, query = "select a from UserTable a where a.userId = :id")
public class UserTable {
    public static final String USER_BYID = "UserTable.byId";
    private int userId;
    private Integer belongsTo;
    private String userName;

    @javax.persistence.Column(name = "USER_ID")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @javax.persistence.Column(name = "USER_NAME")
    @Basic
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @javax.persistence.Column(name = "BELONGS_TO")
    @Basic
    @XmlElement(name = "masterId")
    public Integer getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(Integer belongsTo) {
        this.belongsTo = belongsTo;
    }

    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTable userTable = (UserTable) o;

        if (userId != userTable.userId) return false;
        if (belongsTo != null ? !belongsTo.equals(userTable.belongsTo) : userTable.belongsTo != null) return false;
        return userName.equals(userTable.userName);

    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (belongsTo != null ? belongsTo.hashCode() : 0);
        result = 31 * result + userName.hashCode();
        return result;
    }
}
