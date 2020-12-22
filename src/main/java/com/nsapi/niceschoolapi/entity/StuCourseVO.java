package com.nsapi.niceschoolapi.entity;

/**
 * 学生课程关联表：StuCourseDB、StudentDB、CourseDB、ClassInfoDB
 */
public class StuCourseVO {
    private Integer scid; //学生课程编号
    private Integer sid; //学生编号
    private Integer cid; //课程编号
    private String stuid; //学生学号
    private String sname; //学生姓名
    private String cname; //课程名称
    private Integer classid; //班级编号
    private String classname; //班级名称
    private String studytype; //修读类型
    private Integer isDel; //逻辑删除

    public String getStudytype() {
        return studytype;
    }

    public void setStudytype(String studytype) {
        this.studytype = studytype;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }


}
