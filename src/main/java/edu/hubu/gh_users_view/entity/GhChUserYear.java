package edu.hubu.gh_users_view.entity;

public class GhChUserYear {
    private Integer code;

    private Integer year;

    private Integer totalUsers;

    public GhChUserYear() {
    }

    public GhChUserYear(Integer code, Integer year, Integer totalUsers) {
        this.code = code;
        this.year = year;
        this.totalUsers = totalUsers;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    @Override
    public String toString() {
        return "GhChUserYear{" +
                "code=" + code +
                ", year=" + year +
                ", totalUsers=" + totalUsers +
                '}';
    }
}