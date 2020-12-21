package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.CourseTypeDB;
import com.nsapi.niceschoolapi.entity.CourseVO;
import com.nsapi.niceschoolapi.entity.MajorDB;
import com.nsapi.niceschoolapi.mapper.CourseMapper;
import com.nsapi.niceschoolapi.service.courseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements courseService {
    @Resource
    private CourseMapper CourseMapper;

    @Override
    public List<CourseVO> selCourse(CourseVO CourseVO) {
        return CourseMapper.selCourse(CourseVO);
    }

    @Override
    public List<MajorDB> selMajor() {
        return CourseMapper.selMajor();
    }

    @Override
    public List<CourseTypeDB> selCourseType() {
        return CourseMapper.selCourseType();
    }

    @Override
    public int updateCourse(CourseVO CourseVO) {
        return CourseMapper.updateCourse(CourseVO);
    }

    @Override
    public int addCourse(CourseVO CourseVO) {
        return CourseMapper.addCourse(CourseVO);
    }

    @Override
    public int deleteCourse(Integer cid) {
        return CourseMapper.deleteCourse(cid);
    }

    @Override
    public int renewCourse(Integer cid) {
        return CourseMapper.renewCourse(cid);
    }

    @Override
    public int selCount(Integer cid) {
        return CourseMapper.selCount(cid);
    }
}
