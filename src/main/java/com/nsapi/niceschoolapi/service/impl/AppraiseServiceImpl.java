package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.EvaluateVO;
import com.nsapi.niceschoolapi.entity.EvaluateListDB;
import com.nsapi.niceschoolapi.entity.EvaluateRecordDB;
import com.nsapi.niceschoolapi.entity.SelEvaluateVO;
import com.nsapi.niceschoolapi.mapper.AppraiseMapper;
import com.nsapi.niceschoolapi.service.AppraiseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AppraiseServiceImpl implements AppraiseService {
    @Resource
    private AppraiseMapper appraiseMapper;

    //查询全部对应教评的老师
    @Override
    public List<SelEvaluateVO> findEvaTch(SelEvaluateVO selEvaluateVO) {
        return appraiseMapper.findEvaTch(selEvaluateVO);
    }

    //查询全部教评题目
    @Override
    public List<EvaluateListDB> findEvaList(EvaluateListDB evaluateListDB) {
        return appraiseMapper.findEvaList(evaluateListDB);
    }

    //查询教评状态
    @Override
    public int selEvaState(EvaluateRecordDB evaluateRecordDB) {
        return appraiseMapper.selEvaState(evaluateRecordDB);
    }

    //添加教评
    @Override
    public int addAppraise(EvaluateVO evaluateVO) {
        return appraiseMapper.addAppraise(evaluateVO);
    }

    //判断是否有教师成绩记录
    @Override
    public int selTchExamState(EvaluateVO evaluateVO) {
        return appraiseMapper.selTchExamState(evaluateVO);
    }

    //添加教师分数及教评人数
    @Override
    public int addOneTchExam(EvaluateVO evaluateVO) {
        return appraiseMapper.addOneTchExam(evaluateVO);
    }

    //更新教师分数及教评人数
    @Override
    public int updOneTchExam(EvaluateVO evaluateVO) {
        return appraiseMapper.updOneTchExam(evaluateVO);
    }

    //删除问题
    @Override
    public int deleteEva(Integer elid) {
        return appraiseMapper.deleteEva(elid);
    }

    //编辑问题
    @Override
    public int editEva(EvaluateListDB evaluateListDB) {
        return appraiseMapper.editEva(evaluateListDB);
    }

    //添加问题
    @Override
    public int addEva(EvaluateListDB evaluateListDB) {
        return appraiseMapper.addEva(evaluateListDB);
    }
}