package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer invoiceNumber;

    private String invoiceMerchants;

    private Integer invoiceFrom;

    private Integer invoiceEmployersid;

    private Integer invoiceMoney;

    private String invoiceType;

    private String invoiceName;

    private String invoiceNature;

    private String invoiceLookup;

    private String invoiceMail;

    private String invoiceState;

    private Date invoiceTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceMerchants() {
        return invoiceMerchants;
    }

    public void setInvoiceMerchants(String invoiceMerchants) {
        this.invoiceMerchants = invoiceMerchants == null ? null : invoiceMerchants.trim();
    }

    public Integer getInvoiceFrom() {
        return invoiceFrom;
    }

    public void setInvoiceFrom(Integer invoiceFrom) {
        this.invoiceFrom = invoiceFrom;
    }

    public Integer getInvoiceEmployersid() {
        return invoiceEmployersid;
    }

    public void setInvoiceEmployersid(Integer invoiceEmployersid) {
        this.invoiceEmployersid = invoiceEmployersid;
    }

    public Integer getInvoiceMoney() {
        return invoiceMoney;
    }

    public void setInvoiceMoney(Integer invoiceMoney) {
        this.invoiceMoney = invoiceMoney;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName == null ? null : invoiceName.trim();
    }

    public String getInvoiceNature() {
        return invoiceNature;
    }

    public void setInvoiceNature(String invoiceNature) {
        this.invoiceNature = invoiceNature == null ? null : invoiceNature.trim();
    }

    public String getInvoiceLookup() {
        return invoiceLookup;
    }

    public void setInvoiceLookup(String invoiceLookup) {
        this.invoiceLookup = invoiceLookup == null ? null : invoiceLookup.trim();
    }

    public String getInvoiceMail() {
        return invoiceMail;
    }

    public void setInvoiceMail(String invoiceMail) {
        this.invoiceMail = invoiceMail == null ? null : invoiceMail.trim();
    }

    public String getInvoiceState() {
        return invoiceState;
    }

    public void setInvoiceState(String invoiceState) {
        this.invoiceState = invoiceState == null ? null : invoiceState.trim();
    }

    public Date getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(Date invoiceTime) {
        this.invoiceTime = invoiceTime;
    }
}