package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class JyyLogUserlogins implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loginid;

    private Integer uid;

    private Date logintime;

    private String loginip;

    private Byte loginsrc;

    private String loginremark;

    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Byte getLoginsrc() {
        return loginsrc;
    }

    public void setLoginsrc(Byte loginsrc) {
        this.loginsrc = loginsrc;
    }

    public String getLoginremark() {
        return loginremark;
    }

    public void setLoginremark(String loginremark) {
        this.loginremark = loginremark == null ? null : loginremark.trim();
    }
}