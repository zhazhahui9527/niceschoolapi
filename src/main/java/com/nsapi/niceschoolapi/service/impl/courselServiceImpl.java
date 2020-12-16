package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.CourseTypeDB;
import com.nsapi.niceschoolapi.entity.CourseVO;
import com.nsapi.niceschoolapi.entity.MajorDB;
import com.nsapi.niceschoolapi.mapper.CourseMapper;
import com.nsapi.niceschoolapi.service.courselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class courselServiceImpl implements courselService {
    @Resource
    private CourseMapper CourseMapper;
    @Override
    public List<CourseVO> selCourse(CourseVO CourseVO) {
        return CourseMapper.selCourse(CourseVO);
    }

    @Override
    public List<MajorDB> selJson() {
        return CourseMapper.selJson();
    }

    @Override
    public List<CourseTypeDB> selCoutu() {
        return CourseMapper.selCoutu();
    }

    @Override
    public int update(CourseVO CourseVO) {
        return CourseMapper.update(CourseVO);
    }

    @Override
    public int addcou(CourseVO CourseVO) {
        return CourseMapper.addcou(CourseVO);
    }

    @Override
    public int delcou(Integer cid) {
        return CourseMapper.delcou(cid);
    }

    @Override
    public int hfcou(Integer cid) {
        return CourseMapper.hfcou(cid);
    }

    @Override
    public int delercou(Integer cid) {
        return CourseMapper.delercou(cid);
    }
}
