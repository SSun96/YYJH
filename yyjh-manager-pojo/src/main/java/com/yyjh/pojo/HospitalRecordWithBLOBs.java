package com.yyjh.pojo;

import java.io.Serializable;

public class HospitalRecordWithBLOBs extends HospitalRecord  implements Serializable{
    private String patientcondition;

    private String dAdvice;

    public String getPatientcondition(){
        return patientcondition;
    }

    public void setPatientcondition(String patientcondition) {
        this.patientcondition = patientcondition == null ? null : patientcondition.trim();
    }

    public String getdAdvice() {
        return dAdvice;
    }

    public void setdAdvice(String dAdvice) {
        this.dAdvice = dAdvice == null ? null : dAdvice.trim();
    }
}