package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Assignment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer categoryid;

    private String tasktype;

    private String title;

    private String details;

    private String accessoryUrl;

    private BigDecimal subprice;

    private BigDecimal price;

    private Date pubtime;

    private Date endtime;

    private Integer uid;

    private String taskStatus;

    private String remark;

    private Byte testsid;

    private BigDecimal testprice;

    private Byte top;

    private Date topend;

    private Byte urgent;

    private Date urgentend;

    private Byte allhidden;

    private BigDecimal closeaccount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getTasktype() {
        return tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype == null ? null : tasktype.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getAccessoryUrl() {
        return accessoryUrl;
    }

    public void setAccessoryUrl(String accessoryUrl) {
        this.accessoryUrl = accessoryUrl == null ? null : accessoryUrl.trim();
    }

    public BigDecimal getSubprice() {
        return subprice;
    }

    public void setSubprice(BigDecimal subprice) {
        this.subprice = subprice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPubtime() {
        return pubtime;
    }

    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getTestsid() {
        return testsid;
    }

    public void setTestsid(Byte testsid) {
        this.testsid = testsid;
    }

    public BigDecimal getTestprice() {
        return testprice;
    }

    public void setTestprice(BigDecimal testprice) {
        this.testprice = testprice;
    }

    public Byte getTop() {
        return top;
    }

    public void setTop(Byte top) {
        this.top = top;
    }

    public Date getTopend() {
        return topend;
    }

    public void setTopend(Date topend) {
        this.topend = topend;
    }

    public Byte getUrgent() {
        return urgent;
    }

    public void setUrgent(Byte urgent) {
        this.urgent = urgent;
    }

    public Date getUrgentend() {
        return urgentend;
    }

    public void setUrgentend(Date urgentend) {
        this.urgentend = urgentend;
    }

    public Byte getAllhidden() {
        return allhidden;
    }

    public void setAllhidden(Byte allhidden) {
        this.allhidden = allhidden;
    }

    public BigDecimal getCloseaccount() {
        return closeaccount;
    }

    public void setCloseaccount(BigDecimal closeaccount) {
        this.closeaccount = closeaccount;
    }
}