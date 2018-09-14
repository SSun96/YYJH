package com.yyjh.pojo;

import java.io.Serializable;

public class Oldman implements Serializable{
    private String oAddress;

    private String oIdcard;

    private Integer oId;

    private Integer uId;

    public String getoAddress() {
        return oAddress;
    }

    public void setoAddress(String oAddress) {
        this.oAddress = oAddress == null ? null : oAddress.trim();
    }

    public String getoIdcard() {
        return oIdcard;
    }

    public void setoIdcard(String oIdcard) {
        this.oIdcard = oIdcard == null ? null : oIdcard.trim();
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}