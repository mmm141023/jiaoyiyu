package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Leaveword implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer uid;

    private String uname;

    private String lwContent;

    private Date lwTime;

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

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getLwContent() {
        return lwContent;
    }

    public void setLwContent(String lwContent) {
        this.lwContent = lwContent == null ? null : lwContent.trim();
    }

    public Date getLwTime() {
        return lwTime;
    }

    public void setLwTime(Date lwTime) {
        this.lwTime = lwTime;
    }
}