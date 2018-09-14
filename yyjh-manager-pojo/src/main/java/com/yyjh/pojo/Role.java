package com.yyjh.pojo;

import java.io.Serializable;

public class Role implements Serializable{
    private String roleType;

    private Integer roleId;

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}