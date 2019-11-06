package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Manuscript implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer taskId;

    private Integer userId;

    private Integer successful;

    private Date successfulTime;

    private String accessory;

    private Integer manuscriptHidden;

    private String designIdea;

    private Date registrationTime;

    private Date submissionTime;

    private Integer submitManuscript;

    private Date turnoverTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSuccessful() {
        return successful;
    }

    public void setSuccessful(Integer successful) {
        this.successful = successful;
    }

    public Date getSuccessfulTime() {
        return successfulTime;
    }

    public void setSuccessfulTime(Date successfulTime) {
        this.successfulTime = successfulTime;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory == null ? null : accessory.trim();
    }

    public Integer getManuscriptHidden() {
        return manuscriptHidden;
    }

    public void setManuscriptHidden(Integer manuscriptHidden) {
        this.manuscriptHidden = manuscriptHidden;
    }

    public String getDesignIdea() {
        return designIdea;
    }

    public void setDesignIdea(String designIdea) {
        this.designIdea = designIdea == null ? null : designIdea.trim();
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Date getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(Date submissionTime) {
        this.submissionTime = submissionTime;
    }

    public Integer getSubmitManuscript() {
        return submitManuscript;
    }

    public void setSubmitManuscript(Integer submitManuscript) {
        this.submitManuscript = submitManuscript;
    }

    public Date getTurnoverTime() {
        return turnoverTime;
    }

    public void setTurnoverTime(Date turnoverTime) {
        this.turnoverTime = turnoverTime;
    }
}