package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "MEDIA_TYPE")
@Entity
@XmlRootElement
public class MediaType {
    private int mediaTypeId;

    @javax.persistence.Column(name = "MEDIA_TYPE_ID")
    @Id
    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    private String type;

    @javax.persistence.Column(name = "MEDIA_TYPE")
    @Basic
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MediaType mediaType1 = (MediaType) o;

        if (mediaTypeId != mediaType1.mediaTypeId) return false;
        if (type != null ? !type.equals(mediaType1.type) : mediaType1.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mediaTypeId;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
