package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class JyyUserScores implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scoreid;

    private Integer uid;

    private Integer score;

    private Integer datasrc;

    private Integer dataid;

    private Date createtime;

    private String dataremarks;

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getDatasrc() {
        return datasrc;
    }

    public void setDatasrc(Integer datasrc) {
        this.datasrc = datasrc;
    }

    public Integer getDataid() {
        return dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDataremarks() {
        return dataremarks;
    }

    public void setDataremarks(String dataremarks) {
        this.dataremarks = dataremarks == null ? null : dataremarks.trim();
    }
}