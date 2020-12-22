package com.nsapi.niceschoolapi.entity;


import java.io.Serializable;

/**
 * 课程类型表
 */

public class CourseTypeDB implements Serializable {

    private Integer ctid; //课程类型编号
    private String ctname; //课程类型名称

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public String getCtname() {
        return ctname;
    }

    public void setCtname(String ctname) {
        this.ctname = ctname;
    }
}
