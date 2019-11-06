package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Active implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer activeNumber;

    private String activeName;

    private Integer activeId;

    private String activeType;

    private String byPeople;

    private String activeState;

    private Date activeTime;

    private String activeIdentification;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActiveNumber() {
        return activeNumber;
    }

    public void setActiveNumber(Integer activeNumber) {
        this.activeNumber = activeNumber;
    }

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName == null ? null : activeName.trim();
    }

    public Integer getActiveId() {
        return activeId;
    }

    public void setActiveId(Integer activeId) {
        this.activeId = activeId;
    }

    public String getActiveType() {
        return activeType;
    }

    public void setActiveType(String activeType) {
        this.activeType = activeType == null ? null : activeType.trim();
    }

    public String getByPeople() {
        return byPeople;
    }

    public void setByPeople(String byPeople) {
        this.byPeople = byPeople == null ? null : byPeople.trim();
    }

    public String getActiveState() {
        return activeState;
    }

    public void setActiveState(String activeState) {
        this.activeState = activeState == null ? null : activeState.trim();
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public String getActiveIdentification() {
        return activeIdentification;
    }

    public void setActiveIdentification(String activeIdentification) {
        this.activeIdentification = activeIdentification == null ? null : activeIdentification.trim();
    }
}