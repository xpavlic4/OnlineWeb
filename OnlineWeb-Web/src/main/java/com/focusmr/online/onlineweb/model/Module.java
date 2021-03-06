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
public class Module {
    private int moduleId;

    @javax.persistence.Column(name = "MODULE_ID")
    @Id
    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    private String moduleName;

    @javax.persistence.Column(name = "MODULE_NAME")
    @Basic
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
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

        Module module = (Module) o;

        if (moduleId != module.moduleId) return false;
        if (displayName != null ? !displayName.equals(module.displayName) : module.displayName != null) return false;
        if (moduleName != null ? !moduleName.equals(module.moduleName) : module.moduleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduleId;
        result = 31 * result + (moduleName != null ? moduleName.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        return result;
    }
}
