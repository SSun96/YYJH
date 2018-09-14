package com.yyjh.pojo;

import java.io.Serializable;
import java.util.Date;

public class OldmanInformation implements Serializable{
    private String xueya;

    private String xuetang;

    private String xueyang;

    private String shengaotizhong;

    private String zhifanglv;

    private String xinlv;

    private String tiwen;

    private String xuezhi;

    private Date iTime;

    private Integer informationId;

    public String getXueya() {
        return xueya;
    }

    public void setXueya(String xueya) {
        this.xueya = xueya == null ? null : xueya.trim();
    }

    public String getXuetang() {
        return xuetang;
    }

    public void setXuetang(String xuetang) {
        this.xuetang = xuetang == null ? null : xuetang.trim();
    }

    public String getXueyang() {
        return xueyang;
    }

    public void setXueyang(String xueyang) {
        this.xueyang = xueyang == null ? null : xueyang.trim();
    }

    public String getShengaotizhong() {
        return shengaotizhong;
    }

    public void setShengaotizhong(String shengaotizhong) {
        this.shengaotizhong = shengaotizhong == null ? null : shengaotizhong.trim();
    }

    public String getZhifanglv() {
        return zhifanglv;
    }

    public void setZhifanglv(String zhifanglv) {
        this.zhifanglv = zhifanglv == null ? null : zhifanglv.trim();
    }

    public String getXinlv() {
        return xinlv;
    }

    public void setXinlv(String xinlv) {
        this.xinlv = xinlv == null ? null : xinlv.trim();
    }

    public String getTiwen() {
        return tiwen;
    }

    public void setTiwen(String tiwen) {
        this.tiwen = tiwen == null ? null : tiwen.trim();
    }

    public String getXuezhi() {
        return xuezhi;
    }

    public void setXuezhi(String xuezhi) {
        this.xuezhi = xuezhi == null ? null : xuezhi.trim();
    }

    public Date getiTime() {
        return iTime;
    }

    public void setiTime(Date iTime) {
        this.iTime = iTime;
    }

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }
}