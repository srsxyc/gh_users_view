package edu.hubu.gh_users_view.entity;

public class GhUserYear {

    private Integer countryId;

    private Integer year;

    private Country country;

    public GhUserYear() {
    }

    public GhUserYear(Integer countryId, Integer year, Country country, Integer totalUsers) {
        this.countryId = countryId;
        this.year = year;
        this.country = country;
        this.totalUsers = totalUsers;
    }

    public GhUserYear(Integer countryId, Integer year, Integer totalUsers) {
        this.countryId = countryId;
        this.year = year;
        this.totalUsers = totalUsers;
    }

    private Integer totalUsers;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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
        return "GhUserYear{" +
                "countryId=" + countryId +
                ", year=" + year +
                ", country=" + country +
                ", totalUsers=" + totalUsers +
                '}';
    }
}