package com.nsapi.niceschoolapi.entity;


import java.io.Serializable;

/**
 * 教评记录表
 */

public class EvaluateRecordDB implements Serializable {
    private Integer erid; //记录编号
    private String stuid; //学生学号
    private String tchid; //教师工号
    private Integer erscore; //评教分数
    private Integer isDel; //逻辑删除

    public Integer getErid() {
        return erid;
    }

    public void setErid(Integer erid) {
        this.erid = erid;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getTchid() {
        return tchid;
    }

    public void setTchid(String tchid) {
        this.tchid = tchid;
    }

    public Integer getErscore() {
        return erscore;
    }

    public void setErscore(Integer erscore) {
        this.erscore = erscore;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}
