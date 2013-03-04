package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "MEDIA_TYPE")
@Entity
public class MediaType {
    private int mediaTypeId;

    @javax.persistence.Column(name = "MEDIA_TYPE_ID")
    @Id
    int getMediaTypeId() {
        return mediaTypeId;
    }

    void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    private String mediaType;

    @javax.persistence.Column(name = "MEDIA_TYPE")
    @Basic
    String getMediaType() {
        return mediaType;
    }

    void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MediaType mediaType1 = (MediaType) o;

        if (mediaTypeId != mediaType1.mediaTypeId) return false;
        if (mediaType != null ? !mediaType.equals(mediaType1.mediaType) : mediaType1.mediaType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mediaTypeId;
        result = 31 * result + (mediaType != null ? mediaType.hashCode() : 0);
        return result;
    }
}
