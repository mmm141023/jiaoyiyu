package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Authentication implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer uid;

    private String rnameAut;

    private String phoneAut;

    private String bankcardAut;

    private String emailAut;

    private String wechatAut;

    private String alipayAut;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getRnameAut() {
        return rnameAut;
    }

    public void setRnameAut(String rnameAut) {
        this.rnameAut = rnameAut == null ? null : rnameAut.trim();
    }

    public String getPhoneAut() {
        return phoneAut;
    }

    public void setPhoneAut(String phoneAut) {
        this.phoneAut = phoneAut == null ? null : phoneAut.trim();
    }

    public String getBankcardAut() {
        return bankcardAut;
    }

    public void setBankcardAut(String bankcardAut) {
        this.bankcardAut = bankcardAut == null ? null : bankcardAut.trim();
    }

    public String getEmailAut() {
        return emailAut;
    }

    public void setEmailAut(String emailAut) {
        this.emailAut = emailAut == null ? null : emailAut.trim();
    }

    public String getWechatAut() {
        return wechatAut;
    }

    public void setWechatAut(String wechatAut) {
        this.wechatAut = wechatAut == null ? null : wechatAut.trim();
    }

    public String getAlipayAut() {
        return alipayAut;
    }

    public void setAlipayAut(String alipayAut) {
        this.alipayAut = alipayAut == null ? null : alipayAut.trim();
    }
}