package com.yyjh.pojo;

import java.io.Serializable;

public class OldmanWarning implements Serializable{
    private String warning;

    private Integer warningId;

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning == null ? null : warning.trim();
    }

    public Integer getWarningId() {
        return warningId;
    }

    public void setWarningId(Integer warningId) {
        this.warningId = warningId;
    }
}