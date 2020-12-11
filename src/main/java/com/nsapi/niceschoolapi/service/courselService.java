package com.nsapi.niceschoolapi.service;

import com.nsapi.niceschoolapi.entity.CourseTypeDB;
import com.nsapi.niceschoolapi.entity.CourseVO;
import com.nsapi.niceschoolapi.entity.MajorDB;

import java.util.List;

public interface courselService {
    List<CourseVO> selCourse(CourseVO CourseVO);
    List<MajorDB> selJson();
    List<CourseTypeDB> selCoutu();
    int update(CourseVO CourseVO);
    int addcou(CourseVO CourseVO);
    int delcou(Integer cid);
    int hfcou(Integer cid);
    int delercou(Integer cid);
}
