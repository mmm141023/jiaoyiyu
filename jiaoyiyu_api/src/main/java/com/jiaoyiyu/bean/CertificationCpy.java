package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class CertificationCpy implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer uid;

    private String cpyName;

    private String cpyAddress;

    private String charterNum;

    private String usualAddress;

    private Date dobusinessEndtime;

    private String copies;

    private String idcard;

    private String idcardFront;

    private String idcardVerso;

    private String inhandIdcardfront;

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

    public String getCpyName() {
        return cpyName;
    }

    public void setCpyName(String cpyName) {
        this.cpyName = cpyName == null ? null : cpyName.trim();
    }

    public String getCpyAddress() {
        return cpyAddress;
    }

    public void setCpyAddress(String cpyAddress) {
        this.cpyAddress = cpyAddress == null ? null : cpyAddress.trim();
    }

    public String getCharterNum() {
        return charterNum;
    }

    public void setCharterNum(String charterNum) {
        this.charterNum = charterNum == null ? null : charterNum.trim();
    }

    public String getUsualAddress() {
        return usualAddress;
    }

    public void setUsualAddress(String usualAddress) {
        this.usualAddress = usualAddress == null ? null : usualAddress.trim();
    }

    public Date getDobusinessEndtime() {
        return dobusinessEndtime;
    }

    public void setDobusinessEndtime(Date dobusinessEndtime) {
        this.dobusinessEndtime = dobusinessEndtime;
    }

    public String getCopies() {
        return copies;
    }

    public void setCopies(String copies) {
        this.copies = copies == null ? null : copies.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getIdcardFront() {
        return idcardFront;
    }

    public void setIdcardFront(String idcardFront) {
        this.idcardFront = idcardFront == null ? null : idcardFront.trim();
    }

    public String getIdcardVerso() {
        return idcardVerso;
    }

    public void setIdcardVerso(String idcardVerso) {
        this.idcardVerso = idcardVerso == null ? null : idcardVerso.trim();
    }

    public String getInhandIdcardfront() {
        return inhandIdcardfront;
    }

    public void setInhandIdcardfront(String inhandIdcardfront) {
        this.inhandIdcardfront = inhandIdcardfront == null ? null : inhandIdcardfront.trim();
    }
}