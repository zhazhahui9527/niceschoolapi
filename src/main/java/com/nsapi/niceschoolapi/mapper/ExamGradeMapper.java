package com.nsapi.niceschoolapi.mapper;

import com.nsapi.niceschoolapi.entity.TchExamDB;
import com.nsapi.niceschoolapi.entity.TeacherDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ExamGradeMapper {
    //  查询学生个人信息
    List<Map> selStudentMessage(String stuid);

    //  查询学生成绩信息
    List<Map> selGrade(Map<String, Object> map);

    //  查询教师个人信息
    List<TeacherDB> selTea(Integer tid);

    //  查询学分
    Integer selCcredit(String stuid);
}