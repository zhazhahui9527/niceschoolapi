package com.nsapi.niceschoolapi.service;

import com.nsapi.niceschoolapi.entity.*;

import java.util.List;
import java.util.Map;

public interface StudentService {
    //  查询所有学生
    public List<Map> selStudent(StudentVO studentVO, PageCount pageCount);

    //  查询教师所教学生
    public List<Map> tchSelStudent(StudentVO studentVO, PageCount pageCount);

    //  查询教师所教学生信息总条数
    public int tchSelCount(StudentVO studentVO);

    //  查询信息总条数
    public int selCount(StudentVO studentVO);

    //  根据id查询一条学生信息
    public List<StudentDB> selStudentById(Integer id);

    //  查询班级
    public List<ClassInfoDB> selClass();

    //  查询政治面貌表
    public List<PoliticsTypeDB> selPolitics();

    //  修改学生信息
    public int updateStudent(StudentDB studentDB);

    //  查询院系
    public List<DepartmentDB> selDepartment();

    //  根据院系查询专业
    public List<MajorDB> selMajorDB(Integer did);

    //  根据专业查询年级
    List<GradeDB> selGradeDB(Integer mid);

    //  根据年级查询班级
    List<ClassInfoDB> selClassInfoDB(Integer gid);
}
