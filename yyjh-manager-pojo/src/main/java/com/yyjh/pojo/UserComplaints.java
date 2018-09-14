package com.yyjh.pojo;

import java.io.Serializable;

public class UserComplaints implements Serializable{
    private Integer complaintId;

    private Integer uId;

    public Integer getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Integer complaintId) {
        this.complaintId = complaintId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}