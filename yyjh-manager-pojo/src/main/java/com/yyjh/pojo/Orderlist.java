package com.yyjh.pojo;

import java.io.Serializable;
import java.util.Date;

public class Orderlist implements Serializable{
    private Integer orderId;

    private Integer cId;

    private Integer oId;

    private Date orderTime;

    private Boolean orderCondition;

    private String orderStype;

    private String orderSprice;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Boolean getOrderCondition() {
        return orderCondition;
    }

    public void setOrderCondition(Boolean orderCondition) {
        this.orderCondition = orderCondition;
    }

    public String getOrderStype() {
        return orderStype;
    }

    public void setOrderStype(String orderStype) {
        this.orderStype = orderStype == null ? null : orderStype.trim();
    }

    public String getOrderSprice() {
        return orderSprice;
    }

    public void setOrderSprice(String orderSprice) {
        this.orderSprice = orderSprice == null ? null : orderSprice.trim();
    }
}