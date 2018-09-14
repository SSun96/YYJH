package com.yyjh.pojo;

import java.io.Serializable;

public class Service implements Serializable{
    private Integer serviceId;

    private Integer cId;

    private String serviceType;

    private String servicePrice;

    private Boolean serviceCondition;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(String servicePrice) {
        this.servicePrice = servicePrice == null ? null : servicePrice.trim();
    }

    public Boolean getServiceCondition() {
        return serviceCondition;
    }

    public void setServiceCondition(Boolean serviceCondition) {
        this.serviceCondition = serviceCondition;
    }
}