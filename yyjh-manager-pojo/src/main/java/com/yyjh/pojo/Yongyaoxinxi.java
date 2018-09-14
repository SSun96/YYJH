package com.yyjh.pojo;

import java.io.Serializable;

public class Yongyaoxinxi implements Serializable{
    private Integer oId;

    private Integer mRecordId;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getmRecordId() {
        return mRecordId;
    }

    public void setmRecordId(Integer mRecordId) {
        this.mRecordId = mRecordId;
    }
}