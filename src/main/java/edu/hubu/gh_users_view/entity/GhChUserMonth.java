package edu.hubu.gh_users_view.entity;

import java.util.Date;

public class GhChUserMonth {
    private Integer id;

    private Date month;

    private Integer code;

    private Integer ghChuserNumber;

    public GhChUserMonth() {
    }

    public GhChUserMonth(Integer id, Date month, Integer code, Integer ghChuserNumber) {
        this.id = id;
        this.month = month;
        this.code = code;
        this.ghChuserNumber = ghChuserNumber;
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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getGhChuserNumber() {
        return ghChuserNumber;
    }

    public void setGhChuserNumber(Integer ghChuserNumber) {
        this.ghChuserNumber = ghChuserNumber;
    }

    @Override
    public String toString() {
        return "GhChUserMonth{" +
                "id=" + id +
                ", month=" + month +
                ", code=" + code +
                ", ghChuserNumber=" + ghChuserNumber +
                '}';
    }
}