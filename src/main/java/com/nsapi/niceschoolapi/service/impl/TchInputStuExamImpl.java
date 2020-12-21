package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.*;
import com.nsapi.niceschoolapi.mapper.TchInputStuExamMapper;
import com.nsapi.niceschoolapi.service.TchInputStuExamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TchInputStuExamImpl implements TchInputStuExamService {
    @Resource
    private TchInputStuExamMapper tchInputStuExamMapper;

    @Override
    public List<DepartmentDB> selDes() {
        return tchInputStuExamMapper.selDes();
    }

    @Override
    public List<MajorDB> selMas(Integer did) {
        return tchInputStuExamMapper.selMas(did);
    }

    @Override
    public List<GradeDB> selGrs(Integer mid) {
        return tchInputStuExamMapper.selGrs(mid);
    }

    @Override
    public List<ClassInfoDB> selClasss(Integer gid) {
        return tchInputStuExamMapper.selClasss(gid);
    }

    @Override
    public List<StuExamVO> selScs(StuExamVO stuExamVO) {
        return tchInputStuExamMapper.selScs(stuExamVO);
    }

    @Override
    public int add(StuExamVO stuExamVO) {
        return tchInputStuExamMapper.add(stuExamVO);
    }

    @Override
    public int selExam(StuExamVO stuExamVO) {
        return tchInputStuExamMapper.selExam(stuExamVO);
    }


    @Override
    public int updateExam(StuExamDB stuExamDB) {
        return tchInputStuExamMapper.updateExam(stuExamDB);
    }
}
