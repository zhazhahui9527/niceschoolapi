package com.nsapi.niceschoolapi.entity;

/**
 * 查询所有学生
 * 成绩关联表：classInfoDB,GradeDB,MajorDB,DepartmentDB,StuExamDB
 */
public class SelAllExamVO {
    private String classname; //班级名称
    private String gname; //年级名称
    private String mname; //专业名称
    private String dname; //系部名称
    private Integer stime; //成绩时间

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getStime() {
        return stime;
    }

    public void setStime(Integer stime) {
        this.stime = stime;
    }
}
