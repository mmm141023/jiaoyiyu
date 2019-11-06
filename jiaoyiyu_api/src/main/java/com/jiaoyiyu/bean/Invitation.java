package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Invitation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer uid;

    private String invitationCalssify;

    private String invitationTitle;

    private String invitationContent;

    private String picsrc;

    private String videosrc;

    private String invitationAddition;

    private String invitationAward;

    private String invitationLable;

    private Date invitationTime;

    private Date updatetime;

    private Byte isdelete;

    private Date deletetime;

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

    public String getInvitationCalssify() {
        return invitationCalssify;
    }

    public void setInvitationCalssify(String invitationCalssify) {
        this.invitationCalssify = invitationCalssify == null ? null : invitationCalssify.trim();
    }

    public String getInvitationTitle() {
        return invitationTitle;
    }

    public void setInvitationTitle(String invitationTitle) {
        this.invitationTitle = invitationTitle == null ? null : invitationTitle.trim();
    }

    public String getInvitationContent() {
        return invitationContent;
    }

    public void setInvitationContent(String invitationContent) {
        this.invitationContent = invitationContent == null ? null : invitationContent.trim();
    }

    public String getPicsrc() {
        return picsrc;
    }

    public void setPicsrc(String picsrc) {
        this.picsrc = picsrc == null ? null : picsrc.trim();
    }

    public String getVideosrc() {
        return videosrc;
    }

    public void setVideosrc(String videosrc) {
        this.videosrc = videosrc == null ? null : videosrc.trim();
    }

    public String getInvitationAddition() {
        return invitationAddition;
    }

    public void setInvitationAddition(String invitationAddition) {
        this.invitationAddition = invitationAddition == null ? null : invitationAddition.trim();
    }

    public String getInvitationAward() {
        return invitationAward;
    }

    public void setInvitationAward(String invitationAward) {
        this.invitationAward = invitationAward == null ? null : invitationAward.trim();
    }

    public String getInvitationLable() {
        return invitationLable;
    }

    public void setInvitationLable(String invitationLable) {
        this.invitationLable = invitationLable == null ? null : invitationLable.trim();
    }

    public Date getInvitationTime() {
        return invitationTime;
    }

    public void setInvitationTime(Date invitationTime) {
        this.invitationTime = invitationTime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }
}