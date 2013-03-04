package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "GLOBAL_PACKAGING_FORM")
@Entity
@XmlRootElement
public class GlobalPackagingForm {
    private int formId;

    @javax.persistence.Column(name = "FORM_ID")
    @Id
    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    private String form;

    @javax.persistence.Column(name = "FORM")
    @Basic
    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalPackagingForm that = (GlobalPackagingForm) o;

        if (formId != that.formId) return false;
        if (form != null ? !form.equals(that.form) : that.form != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = formId;
        result = 31 * result + (form != null ? form.hashCode() : 0);
        return result;
    }
}
