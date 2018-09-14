package com.yyjh.pojo;

import java.io.Serializable;

public class Relatives implements Serializable{
    private Integer reId;

    private Integer uId;

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}