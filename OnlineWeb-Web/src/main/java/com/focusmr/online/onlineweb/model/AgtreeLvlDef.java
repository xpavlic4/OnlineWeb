package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "AGTREE_LVL_DEF")
@Entity
@XmlRootElement
public class AgtreeLvlDef {
    private int lvlDefId;

    @javax.persistence.Column(name = "LVL_DEF_ID")
    @Id
    public int getLvlDefId() {
        return lvlDefId;
    }

    public void setLvlDefId(int lvlDefId) {
        this.lvlDefId = lvlDefId;
    }

    private String definition;

    @javax.persistence.Column(name = "DEFINITION")
    @Basic
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgtreeLvlDef that = (AgtreeLvlDef) o;

        if (lvlDefId != that.lvlDefId) return false;
        if (definition != null ? !definition.equals(that.definition) : that.definition != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lvlDefId;
        result = 31 * result + (definition != null ? definition.hashCode() : 0);
        return result;
    }
}
