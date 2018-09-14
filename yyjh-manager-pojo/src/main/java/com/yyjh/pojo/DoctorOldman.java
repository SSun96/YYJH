package com.yyjh.pojo;

import java.io.Serializable;

public class DoctorOldman implements Serializable{
    private Integer dId;

    private Integer oId;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }
}