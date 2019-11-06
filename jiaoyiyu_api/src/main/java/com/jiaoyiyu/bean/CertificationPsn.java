package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class CertificationPsn implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer uid;

    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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