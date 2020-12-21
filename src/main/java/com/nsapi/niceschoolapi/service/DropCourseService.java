package com.nsapi.niceschoolapi.service;

import com.nsapi.niceschoolapi.entity.CourseVO;

import java.util.List;

public interface DropCourseService {
    List<CourseVO> seledCourse(String cname, Integer sid);

    int dropcou(Integer sid, Integer cid);

    int updatecou(Integer cid);
}
