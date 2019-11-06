package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

public class Production implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer uid;

    private String pdtName;

    private String pdtDesc;

    private BigDecimal price;

    private String pdtStatus;

    private String isPutaway;

    private String picUrl;

    private String videoUrl;

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

    public String getPdtName() {
        return pdtName;
    }

    public void setPdtName(String pdtName) {
        this.pdtName = pdtName == null ? null : pdtName.trim();
    }

    public String getPdtDesc() {
        return pdtDesc;
    }

    public void setPdtDesc(String pdtDesc) {
        this.pdtDesc = pdtDesc == null ? null : pdtDesc.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPdtStatus() {
        return pdtStatus;
    }

    public void setPdtStatus(String pdtStatus) {
        this.pdtStatus = pdtStatus == null ? null : pdtStatus.trim();
    }

    public String getIsPutaway() {
        return isPutaway;
    }

    public void setIsPutaway(String isPutaway) {
        this.isPutaway = isPutaway == null ? null : isPutaway.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }
}