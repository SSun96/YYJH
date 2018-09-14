package com.yyjh.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShoushuRecord implements Serializable{
    private Integer shoushuId;

    private String shoushuType;

    private Date shoushuTime;

    private String beforeJudge;

    private String afterJudge;

    public Integer getShoushuId() {
        return shoushuId;
    }

    public void setShoushuId(Integer shoushuId) {
        this.shoushuId = shoushuId;
    }

    public String getShoushuType() {
        return shoushuType;
    }

    public void setShoushuType(String shoushuType) {
        this.shoushuType = shoushuType == null ? null : shoushuType.trim();
    }

    public Date getShoushuTime() {
        return shoushuTime;
    }

    public void setShoushuTime(Date shoushuTime) {
        this.shoushuTime = shoushuTime;
    }

    public String getBeforeJudge() {
        return beforeJudge;
    }

    public void setBeforeJudge(String beforeJudge) {
        this.beforeJudge = beforeJudge == null ? null : beforeJudge.trim();
    }

    public String getAfterJudge() {
        return afterJudge;
    }

    public void setAfterJudge(String afterJudge) {
        this.afterJudge = afterJudge == null ? null : afterJudge.trim();
    }
}