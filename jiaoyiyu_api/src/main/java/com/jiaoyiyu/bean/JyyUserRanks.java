package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class JyyUserRanks implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rankid;

    private Integer uid;

    private Integer garde;

    private String rankname;

    private Integer exp;

    private Byte cdlimitid;

    private String ranksrc;

    private Date createtime;

    public Integer getRankid() {
        return rankid;
    }

    public void setRankid(Integer rankid) {
        this.rankid = rankid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGarde() {
        return garde;
    }

    public void setGarde(Integer garde) {
        this.garde = garde;
    }

    public String getRankname() {
        return rankname;
    }

    public void setRankname(String rankname) {
        this.rankname = rankname == null ? null : rankname.trim();
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Byte getCdlimitid() {
        return cdlimitid;
    }

    public void setCdlimitid(Byte cdlimitid) {
        this.cdlimitid = cdlimitid;
    }

    public String getRanksrc() {
        return ranksrc;
    }

    public void setRanksrc(String ranksrc) {
        this.ranksrc = ranksrc == null ? null : ranksrc.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}