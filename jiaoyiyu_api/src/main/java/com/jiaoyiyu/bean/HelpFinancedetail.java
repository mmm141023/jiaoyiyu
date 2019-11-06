package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class HelpFinancedetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer financeMark;

    private String financeType;

    private Integer financeMoney;

    private Integer financeBalance;

    private Date financeTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFinanceMark() {
        return financeMark;
    }

    public void setFinanceMark(Integer financeMark) {
        this.financeMark = financeMark;
    }

    public String getFinanceType() {
        return financeType;
    }

    public void setFinanceType(String financeType) {
        this.financeType = financeType == null ? null : financeType.trim();
    }

    public Integer getFinanceMoney() {
        return financeMoney;
    }

    public void setFinanceMoney(Integer financeMoney) {
        this.financeMoney = financeMoney;
    }

    public Integer getFinanceBalance() {
        return financeBalance;
    }

    public void setFinanceBalance(Integer financeBalance) {
        this.financeBalance = financeBalance;
    }

    public Date getFinanceTime() {
        return financeTime;
    }

    public void setFinanceTime(Date financeTime) {
        this.financeTime = financeTime;
    }
}