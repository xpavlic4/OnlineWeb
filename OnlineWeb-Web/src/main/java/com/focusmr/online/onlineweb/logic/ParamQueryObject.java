package com.focusmr.online.onlineweb.logic;

/**
 * Holds parameters from webserivce call.
 */
public class ParamQueryObject {
    public static class Builder {

        private int userId;
        private int applicatoinId;
        private int countryId;
        private String name;

        public ParamQueryObject build() {
            final ParamQueryObject o = new ParamQueryObject();
            o.setApplicatoinId(applicatoinId);
            o.setCountryId(countryId);
            o.setUserId(userId);
            o.setName(name);
            return o;
        }

        public Builder userId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder applicationId(int aapplicationId) {
            this.applicatoinId = aapplicationId;
            return this;
        }

        public Builder countryId(int countryId) {
            this.countryId = countryId;
            return this;
        }

        public Builder name(String aName) {
            this.name = aName;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private int userId;
    private int applicatoinId;
    private int countryId;

    private String name;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getApplicatoinId() {
        return applicatoinId;
    }

    public void setApplicatoinId(int applicatoinId) {
        this.applicatoinId = applicatoinId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
