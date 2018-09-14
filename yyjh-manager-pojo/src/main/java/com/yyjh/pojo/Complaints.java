package com.yyjh.pojo;

import java.io.Serializable;
import java.util.Date;

public class Complaints implements Serializable{
    private Integer complaintId;

    private Integer cId;

    private Date complaintDate;

    private String complaintContent;

    private Boolean complaintCondition;

    public Integer getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Integer complaintId) {
        this.complaintId = complaintId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Date getComplaintDate() {
        return complaintDate;
    }

    public void setComplaintDate(Date complaintDate) {
        this.complaintDate = complaintDate;
    }

    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent == null ? null : complaintContent.trim();
    }

    public Boolean getComplaintCondition() {
        return complaintCondition;
    }

    public void setComplaintCondition(Boolean complaintCondition) {
        this.complaintCondition = complaintCondition;
    }
}