package com.yyjh.pojo;

import java.io.Serializable;

public class Doctor implements Serializable{
    private String dHospital;

    private String dDepartment;

    private String dIntroduction;

    private Integer dId;

    private Integer uId;

    public String getdHospital() {
        return dHospital;
    }

    public void setdHospital(String dHospital) {
        this.dHospital = dHospital == null ? null : dHospital.trim();
    }

    public String getdDepartment() {
        return dDepartment;
    }

    public void setdDepartment(String dDepartment) {
        this.dDepartment = dDepartment == null ? null : dDepartment.trim();
    }

    public String getdIntroduction() {
        return dIntroduction;
    }

    public void setdIntroduction(String dIntroduction) {
        this.dIntroduction = dIntroduction == null ? null : dIntroduction.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}