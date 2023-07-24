package edu.hubu.gh_users_view.entity;

import java.math.BigDecimal;

public class Country {
    private Integer countryId;

    private String enName;

    private String chName;

    private BigDecimal longitude;

    private BigDecimal latitude;

    public Country() {
    }

    public Country(Integer countryId, String enName, String chName, BigDecimal longitude, BigDecimal latitude) {
        this.countryId = countryId;
        this.enName = enName;
        this.chName = chName;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName == null ? null : chName.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", enName='" + enName + '\'' +
                ", chName='" + chName + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}