package com.focusmr.online.onlineweb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Generated.
 */
@SuppressWarnings("RedundantIfStatement")
@javax.persistence.Table(name = "MEDIA_FORMAT")
@Entity
public class MediaFormat {
    private int mediaFormatId;

    @javax.persistence.Column(name = "MEDIA_FORMAT_ID")
    @Id
    int getMediaFormatId() {
        return mediaFormatId;
    }

    void setMediaFormatId(int mediaFormatId) {
        this.mediaFormatId = mediaFormatId;
    }

    private String mediaFormat;

    @javax.persistence.Column(name = "MEDIA_FORMAT")
    @Basic
    String getMediaFormat() {
        return mediaFormat;
    }

    void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MediaFormat that = (MediaFormat) o;

        if (mediaFormatId != that.mediaFormatId) return false;
        if (mediaFormat != null ? !mediaFormat.equals(that.mediaFormat) : that.mediaFormat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mediaFormatId;
        result = 31 * result + (mediaFormat != null ? mediaFormat.hashCode() : 0);
        return result;
    }
}
