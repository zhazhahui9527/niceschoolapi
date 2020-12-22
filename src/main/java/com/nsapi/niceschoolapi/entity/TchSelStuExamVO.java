package com.nsapi.niceschoolapi.entity;

/**
 * 教师查询学生成绩
 * 关联表：TeacherDB、StuExamDB、GradeDB、ClassDB、StudentDB
 */
public class TchSelStuExamVO {
    private String tid; //教师编号
    private Integer stime; //成绩时间
    private String gname; //年级名称
    private Integer classid; //班级编号
    private String classname; //班级名称
    private String sname; //学生姓名

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public Integer getStime() {
        return stime;
    }

    public void setStime(Integer stime) {
        this.stime = stime;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}
