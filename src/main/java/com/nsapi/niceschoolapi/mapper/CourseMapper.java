package com.nsapi.niceschoolapi.mapper;

import com.nsapi.niceschoolapi.entity.CourseTypeDB;
import com.nsapi.niceschoolapi.entity.CourseVO;
import com.nsapi.niceschoolapi.entity.MajorDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    List<CourseVO> selCourse(CourseVO CourseVO);
    List<MajorDB> selJson();
    List<CourseTypeDB> selCoutu();
    int update(CourseVO CourseVO);
    int addcou(CourseVO CourseVO);
    int delcou(Integer cid);
    int hfcou(Integer cid);
    int delercou(Integer cid);
}
