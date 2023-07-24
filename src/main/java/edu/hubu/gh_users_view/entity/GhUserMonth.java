package edu.hubu.gh_users_view.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class GhUserMonth {
    private Integer id;

    private Date month;

    private Integer countryId;

    private Integer ghUserNumber;

    private Country country;

    public GhUserMonth() {
    }

    public GhUserMonth(Integer id, Date month, Integer countryId, Integer ghUserNumber, Country country) {
        this.id = id;
        this.month = month;
        this.countryId = countryId;
        this.ghUserNumber = ghUserNumber;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getGhUserNumber() {
        return ghUserNumber;
    }

    public void setGhUserNumber(Integer ghUserNumber) {
        this.ghUserNumber = ghUserNumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "GhUserMonth{" +
                "id=" + id +
                ", month=" + month +
                ", countryId=" + countryId +
                ", ghUserNumber=" + ghUserNumber +
                ", country=" + country +
                '}';
    }
}