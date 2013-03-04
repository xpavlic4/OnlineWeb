package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "TREEMASTER_AGTREE")
@Entity
@NamedQuery(name = TreemasterAgtree.BY_AGTREE_ID, query = "select s from TreemasterAgtree s where s.agtreeId=:agtreeId")
public class TreemasterAgtree {
    public static final String BY_AGTREE_ID = "TreemasterAgtree.byAgtreeId";
    private int treemasterUserId;

    @javax.persistence.Column(name = "TREEMASTER_USER_ID")
    @Id
    int getTreemasterUserId() {
        return treemasterUserId;
    }

    void setTreemasterUserId(int treemasterUserId) {
        this.treemasterUserId = treemasterUserId;
    }

    private int agtreeId;

    @javax.persistence.Column(name = "AGTREE_ID")
    @Basic
    int getAgtreeId() {
        return agtreeId;
    }

    void setAgtreeId(int agtreeId) {
        this.agtreeId = agtreeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TreemasterAgtree that = (TreemasterAgtree) o;

        if (agtreeId != that.agtreeId) return false;
        if (treemasterUserId != that.treemasterUserId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = treemasterUserId;
        result = 31 * result + agtreeId;
        return result;
    }
}
