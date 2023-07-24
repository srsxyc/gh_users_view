package edu.hubu.gh_users_view.entity;

import java.math.BigDecimal;

public class China {
    private Integer code;

    private String enName;

    private String chName;

    private BigDecimal longitude;

    private BigDecimal latitude;

    public China() {
    }

    public China(Integer code, String enName, String chName, BigDecimal longitude, BigDecimal latitude) {
        this.code = code;
        this.enName = enName;
        this.chName = chName;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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
        return "China{" +
                "code=" + code +
                ", enName='" + enName + '\'' +
                ", chName='" + chName + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}