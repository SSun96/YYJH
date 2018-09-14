package com.yyjh.pojo;

import java.io.Serializable;
import java.util.Date;

public class HospitalRecord implements Serializable{
    private Integer hRecordId;

    private String hName;

    private String hDepartment;

    private String inpatientward;

    private Integer bedId;

    private Integer inhospitalid;

    private Date entertime;

    private Date leavetime;

    private String hospitaldoctorname;

    public Integer gethRecordId() {
        return hRecordId;
    }

    public void sethRecordId(Integer hRecordId) {
        this.hRecordId = hRecordId;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName == null ? null : hName.trim();
    }

    public String gethDepartment() {
        return hDepartment;
    }

    public void sethDepartment(String hDepartment) {
        this.hDepartment = hDepartment == null ? null : hDepartment.trim();
    }

    public String getInpatientward() {
        return inpatientward;
    }

    public void setInpatientward(String inpatientward) {
        this.inpatientward = inpatientward == null ? null : inpatientward.trim();
    }

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public Integer getInhospitalid() {
        return inhospitalid;
    }

    public void setInhospitalid(Integer inhospitalid) {
        this.inhospitalid = inhospitalid;
    }

    public Date getEntertime() {
        return entertime;
    }

    public void setEntertime(Date entertime) {
        this.entertime = entertime;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    public String getHospitaldoctorname() {
        return hospitaldoctorname;
    }

    public void setHospitaldoctorname(String hospitaldoctorname) {
        this.hospitaldoctorname = hospitaldoctorname == null ? null : hospitaldoctorname.trim();
    }
}