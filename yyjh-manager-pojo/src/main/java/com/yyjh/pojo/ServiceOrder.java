package com.yyjh.pojo;

import java.io.Serializable;

public class ServiceOrder implements Serializable{
    private Integer serviceId;

    private Integer uId;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}