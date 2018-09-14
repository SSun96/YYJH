package com.yyjh.pojo;

import java.io.Serializable;

public class Zhuyuanxinxi implements Serializable{
    private Integer oId;

    private Integer hRecordId;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer gethRecordId() {
        return hRecordId;
    }

    public void sethRecordId(Integer hRecordId) {
        this.hRecordId = hRecordId;
    }
}