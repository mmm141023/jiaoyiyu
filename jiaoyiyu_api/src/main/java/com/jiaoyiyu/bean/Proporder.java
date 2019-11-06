package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Proporder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ordeno;

    private Integer uid;

    private Integer propid;

    private Integer propnum;

    private BigDecimal orderprice;

    private Byte payway;

    private Byte paysrc;

    private Byte ispay;

    private BigDecimal payprice;

    private Byte ordersrc;

    private Byte isrefund;

    private String orderunique;

    private String tradeno;

    private Byte dataflag;

    private Date createtime;

    private Date droptime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdeno() {
        return ordeno;
    }

    public void setOrdeno(String ordeno) {
        this.ordeno = ordeno == null ? null : ordeno.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPropid() {
        return propid;
    }

    public void setPropid(Integer propid) {
        this.propid = propid;
    }

    public Integer getPropnum() {
        return propnum;
    }

    public void setPropnum(Integer propnum) {
        this.propnum = propnum;
    }

    public BigDecimal getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(BigDecimal orderprice) {
        this.orderprice = orderprice;
    }

    public Byte getPayway() {
        return payway;
    }

    public void setPayway(Byte payway) {
        this.payway = payway;
    }

    public Byte getPaysrc() {
        return paysrc;
    }

    public void setPaysrc(Byte paysrc) {
        this.paysrc = paysrc;
    }

    public Byte getIspay() {
        return ispay;
    }

    public void setIspay(Byte ispay) {
        this.ispay = ispay;
    }

    public BigDecimal getPayprice() {
        return payprice;
    }

    public void setPayprice(BigDecimal payprice) {
        this.payprice = payprice;
    }

    public Byte getOrdersrc() {
        return ordersrc;
    }

    public void setOrdersrc(Byte ordersrc) {
        this.ordersrc = ordersrc;
    }

    public Byte getIsrefund() {
        return isrefund;
    }

    public void setIsrefund(Byte isrefund) {
        this.isrefund = isrefund;
    }

    public String getOrderunique() {
        return orderunique;
    }

    public void setOrderunique(String orderunique) {
        this.orderunique = orderunique == null ? null : orderunique.trim();
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno == null ? null : tradeno.trim();
    }

    public Byte getDataflag() {
        return dataflag;
    }

    public void setDataflag(Byte dataflag) {
        this.dataflag = dataflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getDroptime() {
        return droptime;
    }

    public void setDroptime(Date droptime) {
        this.droptime = droptime;
    }
}