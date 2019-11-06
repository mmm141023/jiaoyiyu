package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class BankcardAut implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer uid;

    private String accountholderName;

    private String bankcardnum;

    private String area;

    private String hlbank;

    private String subBranch;

    private Date autTime;

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

    public String getAccountholderName() {
        return accountholderName;
    }

    public void setAccountholderName(String accountholderName) {
        this.accountholderName = accountholderName == null ? null : accountholderName.trim();
    }

    public String getBankcardnum() {
        return bankcardnum;
    }

    public void setBankcardnum(String bankcardnum) {
        this.bankcardnum = bankcardnum == null ? null : bankcardnum.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getHlbank() {
        return hlbank;
    }

    public void setHlbank(String hlbank) {
        this.hlbank = hlbank == null ? null : hlbank.trim();
    }

    public String getSubBranch() {
        return subBranch;
    }

    public void setSubBranch(String subBranch) {
        this.subBranch = subBranch == null ? null : subBranch.trim();
    }

    public Date getAutTime() {
        return autTime;
    }

    public void setAutTime(Date autTime) {
        this.autTime = autTime;
    }
}