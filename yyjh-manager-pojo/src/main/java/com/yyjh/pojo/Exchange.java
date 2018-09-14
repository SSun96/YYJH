package com.yyjh.pojo;

import java.io.Serializable;
import java.util.Date;

public class Exchange implements Serializable{
    private Integer ansId;

    private Integer dId;

    private Integer oId;

    private String question;

    private String answer;

    private Date aSendtime;

    private Date qSendtime;

    public Integer getAnsId() {
        return ansId;
    }

    public void setAnsId(Integer ansId) {
        this.ansId = ansId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Date getaSendtime() {
        return aSendtime;
    }

    public void setaSendtime(Date aSendtime) {
        this.aSendtime = aSendtime;
    }

    public Date getqSendtime() {
        return qSendtime;
    }

    public void setqSendtime(Date qSendtime) {
        this.qSendtime = qSendtime;
    }
}