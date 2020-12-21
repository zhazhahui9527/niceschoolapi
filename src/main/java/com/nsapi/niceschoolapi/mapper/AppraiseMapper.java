package com.nsapi.niceschoolapi.mapper;

import com.nsapi.niceschoolapi.entity.EvaluateVO;
import com.nsapi.niceschoolapi.entity.EvaluateListDB;
import com.nsapi.niceschoolapi.entity.EvaluateRecordDB;
import com.nsapi.niceschoolapi.entity.SelEvaluateVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppraiseMapper {
    //查询全部对应教评的老师
    List<SelEvaluateVO> findEvaTch(SelEvaluateVO selEvaluateVO);

    //查询全部教评题目
    List<EvaluateListDB> findEvaList(EvaluateListDB evaluateListDB);

    //查询教评状态
    int selEvaState(EvaluateRecordDB evaluateRecordDB);

    //添加教评记录
    int addAppraise(EvaluateVO evaluateVO);

    //判断是否有教师成绩记录
    int selTchExamState(EvaluateVO evaluateVO);

    //添加教师分数及教评人数
    int addOneTchExam(EvaluateVO evaluateVO);

    //更新教师分数及教评人数
    int updOneTchExam(EvaluateVO evaluateVO);

    //删除问题
    int deleteEva(Integer elid);

    //编辑问题
    int editEva(EvaluateListDB evaluateListDB);

    //添加问题
    int addEva(EvaluateListDB evaluateListDB);
}
