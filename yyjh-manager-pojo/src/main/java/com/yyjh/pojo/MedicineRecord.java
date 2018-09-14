package com.yyjh.pojo;

import java.io.Serializable;
import java.util.Date;

public class MedicineRecord implements Serializable{
    private Integer mRecordId;

    private String mType;

    private String mMethod;

    private String mQuantity;

    private Date msTime;

    private Date meTime;

    public Integer getmRecordId() {
        return mRecordId;
    }

    public void setmRecordId(Integer mRecordId) {
        this.mRecordId = mRecordId;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType == null ? null : mType.trim();
    }

    public String getmMethod() {
        return mMethod;
    }

    public void setmMethod(String mMethod) {
        this.mMethod = mMethod == null ? null : mMethod.trim();
    }

    public String getmQuantity() {
        return mQuantity;
    }

    public void setmQuantity(String mQuantity) {
        this.mQuantity = mQuantity == null ? null : mQuantity.trim();
    }

    public Date getMsTime() {
        return msTime;
    }

    public void setMsTime(Date msTime) {
        this.msTime = msTime;
    }

    public Date getMeTime() {
        return meTime;
    }

    public void setMeTime(Date meTime) {
        this.meTime = meTime;
    }
}