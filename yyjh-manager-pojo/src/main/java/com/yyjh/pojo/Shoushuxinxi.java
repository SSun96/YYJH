package com.yyjh.pojo;

import java.io.Serializable;

public class Shoushuxinxi implements Serializable{
    private Integer oId;

    private Integer shoushuId;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getShoushuId() {
        return shoushuId;
    }

    public void setShoushuId(Integer shoushuId) {
        this.shoushuId = shoushuId;
    }
}