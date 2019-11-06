package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class AssessAut implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer uid;

    private String isPass;

    private String storeOpened;

    private String doneOrder;

    private String attention;

    private String fansnum;

    private String likenum;

    private String publishWorks;

    private String resume;

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

    public String getIsPass() {
        return isPass;
    }

    public void setIsPass(String isPass) {
        this.isPass = isPass == null ? null : isPass.trim();
    }

    public String getStoreOpened() {
        return storeOpened;
    }

    public void setStoreOpened(String storeOpened) {
        this.storeOpened = storeOpened == null ? null : storeOpened.trim();
    }

    public String getDoneOrder() {
        return doneOrder;
    }

    public void setDoneOrder(String doneOrder) {
        this.doneOrder = doneOrder == null ? null : doneOrder.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
    }

    public String getFansnum() {
        return fansnum;
    }

    public void setFansnum(String fansnum) {
        this.fansnum = fansnum == null ? null : fansnum.trim();
    }

    public String getLikenum() {
        return likenum;
    }

    public void setLikenum(String likenum) {
        this.likenum = likenum == null ? null : likenum.trim();
    }

    public String getPublishWorks() {
        return publishWorks;
    }

    public void setPublishWorks(String publishWorks) {
        this.publishWorks = publishWorks == null ? null : publishWorks.trim();
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }
}