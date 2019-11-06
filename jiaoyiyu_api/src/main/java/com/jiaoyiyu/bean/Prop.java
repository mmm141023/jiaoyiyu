package com.jiaoyiyu.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Prop implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer taskstick;

    private Integer taskurgent;

    private Integer manuscripthide;

    private Integer bidtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskstick() {
        return taskstick;
    }

    public void setTaskstick(Integer taskstick) {
        this.taskstick = taskstick;
    }

    public Integer getTaskurgent() {
        return taskurgent;
    }

    public void setTaskurgent(Integer taskurgent) {
        this.taskurgent = taskurgent;
    }

    public Integer getManuscripthide() {
        return manuscripthide;
    }

    public void setManuscripthide(Integer manuscripthide) {
        this.manuscripthide = manuscripthide;
    }

    public Integer getBidtime() {
        return bidtime;
    }

    public void setBidtime(Integer bidtime) {
        this.bidtime = bidtime;
    }
}