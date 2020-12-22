package com.nsapi.niceschoolapi.entity;

/**
 * 查询教师成绩
 */
public class SelTchExamVO {
    private String tname; //教师姓名
    private String tid; //教师编号

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
