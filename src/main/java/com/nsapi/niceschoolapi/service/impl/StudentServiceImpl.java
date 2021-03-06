package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.*;
import com.nsapi.niceschoolapi.mapper.StudentMapper;
import com.nsapi.niceschoolapi.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    //  查询所有学生
    @Override
    public List<Map> selStudent(StudentVO studentVO, PageCount pageCount) {
        int begin = pageCount.getLimit() * (pageCount.getPage() - 1);
        int end = pageCount.getLimit() * pageCount.getPage() - begin;
        Map<String, Object> map = new HashMap<>();
        map.put("begin", begin);
        map.put("end", end);
        map.put("stuid", studentVO.getStuid());
        map.put("sname", studentVO.getSname());
        map.put("did", studentVO.getDid());
        map.put("mid", studentVO.getMid());
        map.put("gid", studentVO.getGid());
        map.put("classid", studentVO.getClassid());
        return studentMapper.selStudent(map);
    }

    //教师查询所教学生
    @Override
    public List<Map> tchSelStudent(StudentVO studentVO, PageCount pageCount) {
        int begin = pageCount.getLimit() * (pageCount.getPage() - 1);
        int end = pageCount.getLimit() * pageCount.getPage() - begin;
        Map<String, Object> map = new HashMap<>();
        map.put("begin", begin);
        map.put("end", end);
        map.put("stuid", studentVO.getStuid());
        map.put("sname", studentVO.getSname());
        map.put("did", studentVO.getDid());
        map.put("mid", studentVO.getMid());
        map.put("gid", studentVO.getGid());
        map.put("classid", studentVO.getClassid());
        map.put("tid",studentVO.getTid());
        return studentMapper.tchSelStudent(map);
    }

    //  查询教师所教学生信息总条数
    @Override
    public int tchSelCount(StudentVO studentVO) {
        return studentMapper.tchSelCount(studentVO);
    }

    //  查询信息总条数
    @Override
    public int selCount(StudentVO studentVO) {
        return studentMapper.selCount(studentVO);
    }

    //  根据id查询一条学生信息
    @Override
    public List<StudentDB> selStudentById(Integer id) {
        return studentMapper.selStudentById(id);
    }

    //  查询班级
    @Override
    public List<ClassInfoDB> selClass() {
        return studentMapper.selClass();
    }

    //  查询政治面貌表
    @Override
    public List<PoliticsTypeDB> selPolitics() {
        return studentMapper.selPolitics();
    }

    //  修改学生信息
    @Override
    public int updateStudent(StudentDB studentDB) {
        return studentMapper.updateStudent(studentDB);
    }


    //  查询院系
    @Override
    public List<DepartmentDB> selDepartment() {
        return studentMapper.selDepartment();
    }


    //  根据院系查询专业
    @Override
    public List<MajorDB> selMajorDB(Integer did) {
        return studentMapper.selMajorDB(did);
    }

    //  根据专业查询年级
    @Override
    public List<GradeDB> selGradeDB(Integer mid) {
        return studentMapper.selGradeDB(mid);
    }

    //  根据年级查询班级
    @Override
    public List<ClassInfoDB> selClassInfoDB(Integer gid) {
        return studentMapper.selClassInfoDB(gid);
    }

}
