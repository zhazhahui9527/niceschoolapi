package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.TeacherDB;
import com.nsapi.niceschoolapi.mapper.ExamGradeMapper;
import com.nsapi.niceschoolapi.service.ExamGradeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ExamExamGradeServiceImpl implements ExamGradeService {
    @Resource
    private ExamGradeMapper examGradeMapper;

    //  查询学生个人信息
    @Override
    public List<Map> selStudentMessage(String stuid) {
        return examGradeMapper.selStudentMessage(stuid);
    }

    //  查询学生成绩信息
    @Override
    public List<Map> selGrade(String stuid, Integer stime) {
        Map<String, Object> map = new HashMap<>();
        map.put("stime", stime);
        map.put("stuid", stuid);
        return examGradeMapper.selGrade(map);
    }


    //  查询教师个人信息
    @Override
    public List<TeacherDB> selTea(Integer tid) {
        return examGradeMapper.selTea(tid);
    }

    //  查询学分
    @Override
    public Integer selCcredit(String stuid) {
        return examGradeMapper.selCcredit(stuid);
    }
}
