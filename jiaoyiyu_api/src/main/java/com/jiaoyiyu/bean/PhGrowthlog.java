package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class PhGrowthlog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String uname;

    private String dynamictype;

    private Date dynamictime;

    private String activecontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getDynamictype() {
        return dynamictype;
    }

    public void setDynamictype(String dynamictype) {
        this.dynamictype = dynamictype == null ? null : dynamictype.trim();
    }

    public Date getDynamictime() {
        return dynamictime;
    }

    public void setDynamictime(Date dynamictime) {
        this.dynamictime = dynamictime;
    }

    public String getActivecontent() {
        return activecontent;
    }

    public void setActivecontent(String activecontent) {
        this.activecontent = activecontent == null ? null : activecontent.trim();
    }
}