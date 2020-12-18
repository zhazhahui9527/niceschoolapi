package com.nsapi.niceschoolapi.service;

import com.nsapi.niceschoolapi.entity.*;

import java.util.List;

public interface TchInputStuExamService {
    List<DepartmentDB> selDes();
    List<MajorDB> selMas(Integer did);
    List<GradeDB> selGrs(Integer mid);
    List<ClassInfoDB> selClasss(Integer gid);
    List<StuExamVO> selScs(StuExamVO stuExamVO);
    int add(StuExamVO stuExamVO);
    int selExam(StuExamVO stuExamVO);
    int updateExam(StuExamDB stuExamDB);
}
