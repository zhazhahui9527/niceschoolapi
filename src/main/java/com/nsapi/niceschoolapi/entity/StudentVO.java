package com.nsapi.niceschoolapi.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 学生信息关联表：StudentDB、DepartmentDB、MajorDB、GradeDB、ClassinfoDB
 */

public class StudentVO implements Serializable {
    private Integer did; //院系编号
    private String dname; //院系名称
    private Integer dcount; //院系人数
    private Integer mid; //专业
    private String mname; //专业名称
    private Integer mcount; //专业人数
    private Integer gid; //年级编号
    private String gname; //年级名称
    private Integer gcount; //年级人数
    private Integer classid; //班级编号
    private String classname; //班级名称
//    private Date begintime; //开班时间
//    private Date endtime; //闭班时间
    private Integer ccount; //班级人数
    private Integer sid; //学生编号
    private String stuid; //学生学号
    private String sname; //学生名字
    private String sgender; //学生性别
    private Date sbirthday; //出生年月
    private Integer pid; //政治面貌编号
    private String snation; //民族
    private String scardid; //身份证号
    private String sphone; //手机号
    private String saddress; //家庭住址
    private Date entertime; //入学时间
    private Date leavetime; //毕业时间
    private Integer stustate; //学生状态
    private Integer isDel; //逻辑删除
    private String tid; //教师编号

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getDcount() {
        return dcount;
    }

    public void setDcount(Integer dcount) {
        this.dcount = dcount;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Integer getMcount() {
        return mcount;
    }

    public void setMcount(Integer mcount) {
        this.mcount = mcount;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Integer getGcount() {
        return gcount;
    }

    public void setGcount(Integer gcount) {
        this.gcount = gcount;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

//    public Date getBegintime() {
//        return begintime;
//    }
//
//    public void setBegintime(Date begintime) {
//        this.begintime = begintime;
//    }
//
//    public Date getEndtime() {
//        return endtime;
//    }
//
//    public void setEndtime(Date endtime) {
//        this.endtime = endtime;
//    }

    public Integer getCcount() {
        return ccount;
    }

    public void setCcount(Integer ccount) {
        this.ccount = ccount;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public Date getEntertime() {
        return entertime;
    }

    public void setEntertime(Date entertime) {
        this.entertime = entertime;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    public Integer getStustate() {
        return stustate;
    }

    public void setStustate(Integer stustate) {
        this.stustate = stustate;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
}
