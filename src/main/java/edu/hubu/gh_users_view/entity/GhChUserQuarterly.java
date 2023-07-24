package edu.hubu.gh_users_view.entity;

public class GhChUserQuarterly {
    private Integer code;

    private String quarter;

    private Integer totalUsers;

    public GhChUserQuarterly() {
    }

    public GhChUserQuarterly(Integer code, String quarter, Integer totalUsers) {
        this.code = code;
        this.quarter = quarter;
        this.totalUsers = totalUsers;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    @Override
    public String toString() {
        return "GhChUserQuarterly{" +
                "code=" + code +
                ", quarter='" + quarter + '\'' +
                ", totalUsers=" + totalUsers +
                '}';
    }
}