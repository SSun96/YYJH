package com.yyjh.pojo;

import java.io.Serializable;

public class OldInformation implements Serializable{
    private Integer oId;

    private Integer informationId;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }
}