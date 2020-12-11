package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.CourseTypeDB;
import com.nsapi.niceschoolapi.entity.CourseVO;
import com.nsapi.niceschoolapi.entity.MajorDB;
import com.nsapi.niceschoolapi.service.courselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class courselServiceImpl implements courselService {
    @Resource
    private com.nsapi.niceschoolapi.mapper.courseMapperl courseMapperl;
    @Override
    public List<CourseVO> selCourse(CourseVO CourseVO) {
        return courseMapperl.selCourse(CourseVO);
    }

    @Override
    public List<MajorDB> selJson() {
        return courseMapperl.selJson();
    }

    @Override
    public List<CourseTypeDB> selCoutu() {
        return courseMapperl.selCoutu();
    }

    @Override
    public int update(CourseVO CourseVO) {
        return courseMapperl.update(CourseVO);
    }

    @Override
    public int addcou(CourseVO CourseVO) {
        return courseMapperl.addcou(CourseVO);
    }

    @Override
    public int delcou(Integer cid) {
        return courseMapperl.delcou(cid);
    }

    @Override
    public int hfcou(Integer cid) {
        return courseMapperl.hfcou(cid);
    }

    @Override
    public int delercou(Integer cid) {
        return courseMapperl.delercou(cid);
    }
}
