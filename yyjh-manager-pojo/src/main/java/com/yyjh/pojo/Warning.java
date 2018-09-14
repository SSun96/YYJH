package com.yyjh.pojo;

import java.io.Serializable;

public class Warning implements Serializable{
    private Integer uId;

    private Integer warningId;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getWarningId() {
        return warningId;
    }

    public void setWarningId(Integer warningId) {
        this.warningId = warningId;
    }
}