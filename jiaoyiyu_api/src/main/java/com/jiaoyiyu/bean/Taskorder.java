package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Taskorder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer assid;

    private String ordeno;

    private Integer uid;

    private Byte orderstatus;

    private BigDecimal orderprice;

    private Byte payway;

    private Byte paysrc;

    private Byte ispay;

    private BigDecimal payprice;

    private String orderremarks;

    private Byte ordersrc;

    private Byte isrefund;

    private Byte isappraise;

    private String cancelcause;

    private String orderunique;

    private String tradeno;

    private Byte dataflag;

    private Byte isclosed;

    private Date createtime;

    private Date droptime;

    private BigDecimal commissionfee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAssid() {
        return assid;
    }

    public void setAssid(Integer assid) {
        this.assid = assid;
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

    public Byte getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Byte orderstatus) {
        this.orderstatus = orderstatus;
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

    public String getOrderremarks() {
        return orderremarks;
    }

    public void setOrderremarks(String orderremarks) {
        this.orderremarks = orderremarks == null ? null : orderremarks.trim();
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

    public Byte getIsappraise() {
        return isappraise;
    }

    public void setIsappraise(Byte isappraise) {
        this.isappraise = isappraise;
    }

    public String getCancelcause() {
        return cancelcause;
    }

    public void setCancelcause(String cancelcause) {
        this.cancelcause = cancelcause == null ? null : cancelcause.trim();
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

    public Byte getIsclosed() {
        return isclosed;
    }

    public void setIsclosed(Byte isclosed) {
        this.isclosed = isclosed;
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

    public BigDecimal getCommissionfee() {
        return commissionfee;
    }

    public void setCommissionfee(BigDecimal commissionfee) {
        this.commissionfee = commissionfee;
    }
}