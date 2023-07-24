package edu.hubu.gh_users_view.entity;

public class GhUserQuarterly {
    private Integer countryId;

    private String quarter;

    private Integer totalUsers;

    private Country country;

    public GhUserQuarterly() {
    }

    public GhUserQuarterly(Integer countryId, String quarter, Integer totalUsers, Country country) {
        this.countryId = countryId;
        this.quarter = quarter;
        this.totalUsers = totalUsers;
        this.country = country;
    }

    public GhUserQuarterly(Integer countryId, String quarter, Integer totalUsers) {
        this.countryId = countryId;
        this.quarter = quarter;
        this.totalUsers = totalUsers;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter == null ? null : quarter.trim();
    }

    public Integer getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "GhUserQuarterlyService{" +
                "countryId=" + countryId +
                ", quarter='" + quarter + '\'' +
                ", totalUsers=" + totalUsers +
                ", country=" + country +
                '}';
    }
}