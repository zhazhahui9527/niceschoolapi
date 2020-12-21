package com.nsapi.niceschoolapi.mapper;

import com.nsapi.niceschoolapi.entity.CourseTypeDB;
import com.nsapi.niceschoolapi.entity.CourseVO;
import com.nsapi.niceschoolapi.entity.MajorDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    List<CourseVO> selCourse(CourseVO CourseVO);

    List<MajorDB> selMajor();

    List<CourseTypeDB> selCourseType();

    int updateCourse(CourseVO CourseVO);

    int addCourse(CourseVO CourseVO);

    int deleteCourse(Integer cid);

    int renewCourse(Integer cid);

    int selCount(Integer cid);
}
