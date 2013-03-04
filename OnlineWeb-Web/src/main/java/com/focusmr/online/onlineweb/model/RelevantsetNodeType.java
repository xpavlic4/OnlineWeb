package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "RELEVANTSET_NODE_TYPE")
@Entity
@XmlRootElement
public class RelevantsetNodeType {
    private int relevantsetNodeTypeId;

    @javax.persistence.Column(name = "RELEVANTSET_NODE_TYPE_ID")
    @Id
    public int getRelevantsetNodeTypeId() {
        return relevantsetNodeTypeId;
    }

    public void setRelevantsetNodeTypeId(int relevantsetNodeTypeId) {
        this.relevantsetNodeTypeId = relevantsetNodeTypeId;
    }

    private String nodeType;

    @javax.persistence.Column(name = "NODE_TYPE")
    @Basic
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelevantsetNodeType that = (RelevantsetNodeType) o;

        if (relevantsetNodeTypeId != that.relevantsetNodeTypeId) return false;
        if (nodeType != null ? !nodeType.equals(that.nodeType) : that.nodeType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = relevantsetNodeTypeId;
        result = 31 * result + (nodeType != null ? nodeType.hashCode() : 0);
        return result;
    }
}
