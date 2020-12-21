package com.nsapi.niceschoolapi.entity;


import java.io.Serializable;

/**
 * 课程表
 */

public class CourseDB implements Serializable {

    private Integer cid; //课程编号
    private String cname; //课程名称
    private double ccredit; //学分
    private double cperiod; //学时
    private Integer cstate; //课程状态
    private Integer cselcount; //已选人数
    private Integer cmaxcount; //限定人数
    private String studytype; //修读类型
    private Integer ctid; //课程类型编号
    private Integer mid; //专业编号
    private Integer isDel; //逻辑删除

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public double getCcredit() {
        return ccredit;
    }

    public void setCcredit(double ccredit) {
        this.ccredit = ccredit;
    }

    public double getCperiod() {
        return cperiod;
    }

    public void setCperiod(double cperiod) {
        this.cperiod = cperiod;
    }

    public Integer getCstate() {
        return cstate;
    }

    public void setCstate(Integer cstate) {
        this.cstate = cstate;
    }

    public Integer getCselcount() {
        return cselcount;
    }

    public void setCselcount(Integer cselcount) {
        this.cselcount = cselcount;
    }

    public Integer getCmaxcount() {
        return cmaxcount;
    }

    public void setCmaxcount(Integer cmaxcount) {
        this.cmaxcount = cmaxcount;
    }

    public String getStudytype() {
        return studytype;
    }

    public void setStudytype(String studytype) {
        this.studytype = studytype;
    }

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}
