package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GROUP_TABLE")
@Entity
public class GroupTable {
    private int groupId;

    @javax.persistence.Column(name = "GROUP_ID")
    @Id
    int getGroupId() {
        return groupId;
    }

    void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    private String groupName;

    @javax.persistence.Column(name = "GROUP_NAME")
    @Basic
    String getGroupName() {
        return groupName;
    }

    void setGroupName(String groupName) {
        this.groupName = groupName;
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

    private BigInteger sortKey;

    @javax.persistence.Column(name = "SORT_KEY")
    @Basic
    BigInteger getSortKey() {
        return sortKey;
    }

    void setSortKey(BigInteger sortKey) {
        this.sortKey = sortKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupTable that = (GroupTable) o;

        if (groupId != that.groupId) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;
        if (sortKey != null ? !sortKey.equals(that.sortKey) : that.sortKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupId;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + (sortKey != null ? sortKey.hashCode() : 0);
        return result;
    }
}
