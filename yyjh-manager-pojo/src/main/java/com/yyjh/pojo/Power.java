package com.yyjh.pojo;

import java.io.Serializable;

public class Power implements Serializable{
    private String powerType;

    private Integer powerId;

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType == null ? null : powerType.trim();
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }
}