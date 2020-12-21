package com.nsapi.niceschoolapi.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 查询教评教师
 * 用到 教师表、学生表、教师授课表、班级表、
 */

public class SelEvaluateVO implements Serializable {
    private int tid; //教师编号
    private String tchid; //教师工号
    private String tname; //姓名
    private String tgender; //性别
    private Date tbirthday; //出生年月
    private int pid; //政治面貌编号
    private String tnation; //民族
    private String tcardid; //身份证号
    private String tphone; //手机号
    private String taddress; //家庭住址
    private int tchstate; //教师状态
    private int exam;
    private int count;
    private int mid;
    private int sid; //学生编号
    private String stuid; //学号
    private String stupwd;
    private String sname; //姓名
    private String sgender; //性别
    private Date sbirthday; //出生年月
    private String snation; //民族
    private String scardid; //身份证号
    private String sphone; //手机号
    private String saddress; //家庭住址
    private int stustate; //学生状态
    private int classid; //班级编号
    private int scid; //学生选课记录编号
    private int cid; //课程编号
    private int giid;
    private String pname; //政治面貌名称
    private Date gitime;
    private String gaddress;
    private String cname; //课程名称
    private int ccredit;
    private int cperiod;
    private int cstate;
    private int cselount;
    private int cmaxcount;
    private int cyid;
    private int gid;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTchid() {
        return tchid;
    }

    public void setTchid(String tchid) {
        this.tchid = tchid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTgender() {
        return tgender;
    }

    public void setTgender(String tgender) {
        this.tgender = tgender;
    }

    public Date getTbirthday() {
        return tbirthday;
    }

    public void setTbirthday(Date tbirthday) {
        this.tbirthday = tbirthday;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTnation() {
        return tnation;
    }

    public void setTnation(String tnation) {
        this.tnation = tnation;
    }

    public String getTcardid() {
        return tcardid;
    }

    public void setTcardid(String tcardid) {
        this.tcardid = tcardid;
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }

    public int getTchstate() {
        return tchstate;
    }

    public void setTchstate(int tchstate) {
        this.tchstate = tchstate;
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getStupwd() {
        return stupwd;
    }

    public void setStupwd(String stupwd) {
        this.stupwd = stupwd;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public Date getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getSnation() {
        return snation;
    }

    public void setSnation(String snation) {
        this.snation = snation;
    }

    public String getScardid() {
        return scardid;
    }

    public void setScardid(String scardid) {
        this.scardid = scardid;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public int getStustate() {
        return stustate;
    }

    public void setStustate(int stustate) {
        this.stustate = stustate;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getGiid() {
        return giid;
    }

    public void setGiid(int giid) {
        this.giid = giid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getGitime() {
        return gitime;
    }

    public void setGitime(Date gitime) {
        this.gitime = gitime;
    }

    public String getGaddress() {
        return gaddress;
    }

    public void setGaddress(String gaddress) {
        this.gaddress = gaddress;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCcredit() {
        return ccredit;
    }

    public void setCcredit(int ccredit) {
        this.ccredit = ccredit;
    }

    public int getCperiod() {
        return cperiod;
    }

    public void setCperiod(int cperiod) {
        this.cperiod = cperiod;
    }

    public int getCstate() {
        return cstate;
    }

    public void setCstate(int cstate) {
        this.cstate = cstate;
    }

    public int getCselount() {
        return cselount;
    }

    public void setCselount(int cselount) {
        this.cselount = cselount;
    }

    public int getCmaxcount() {
        return cmaxcount;
    }

    public void setCmaxcount(int cmaxcount) {
        this.cmaxcount = cmaxcount;
    }

    public int getCyid() {
        return cyid;
    }

    public void setCyid(int cyid) {
        this.cyid = cyid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }
}
