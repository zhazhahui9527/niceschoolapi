package com.nsapi.niceschoolapi.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsapi.niceschoolapi.common.config.MySysUser;
import com.nsapi.niceschoolapi.entity.EvaluateVO;
import com.nsapi.niceschoolapi.entity.EvaluateListDB;
import com.nsapi.niceschoolapi.entity.EvaluateRecordDB;
import com.nsapi.niceschoolapi.entity.SelEvaluateVO;
import com.nsapi.niceschoolapi.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("appraise")
public class AppraiseController extends BaseController {

    @Autowired
    private AppraiseService appraiseService;

    /**
     * 进入查询教评教师页面
     */
    @RequestMapping("evaTeacher")
    public String evaTeacher() {
        return "view/appraise/evaTeacher";
    }

    /**
     * 进入教评问题管理页面
     */
    @RequestMapping("evaManage")
    public String evaManage() {
        return "view/appraise/evaManage";
    }

    /**
     * 添加问题
     */
    @RequestMapping("addEva")
    @ResponseBody
    public Object addEva(EvaluateListDB evaluateListDB) {
        int r = appraiseService.addEva(evaluateListDB);
        if (r == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 删除问题
     */
    @RequestMapping("deleteEva")
    @ResponseBody
    public Object deleteEva(Integer elid) {
        int r = appraiseService.deleteEva(elid);
        if (r == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 编辑问题
     */
    @RequestMapping("editEva")
    @ResponseBody
    public Object editEva(EvaluateListDB evaluateListDB) {
        int r = appraiseService.editEva(evaluateListDB);
        if (r == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取教评教师列表
     */
    @RequestMapping("findEvaTch")
    @ResponseBody
    public Object findEvaTch(SelEvaluateVO selEvaluateVO) {
        selEvaluateVO.setStuid(MySysUser.loginName());
        List<SelEvaluateVO> listAll = appraiseService.findEvaTch(selEvaluateVO);
        Map<String, Object> tchData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tchData.put("code", 0);
        tchData.put("msg", "");
        tchData.put("data", listAll);
        return tchData;
    }

    /**
     * 获取教评题目列表
     */
    @RequestMapping("findEvaList")
    @ResponseBody
    public Object findEvaList(EvaluateListDB evaluateListDB, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<EvaluateListDB> listAll = appraiseService.findEvaList(evaluateListDB);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tmData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tmData.put("code", 0);
        tmData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tmData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tmData.put("data", pageInfo.getList());
        return tmData;
    }

    /**
     * 查询教评状态
     */
    @RequestMapping("selEvaState")
    @ResponseBody
    public Object selEvaState(EvaluateRecordDB evaluateRecordDB) {
        evaluateRecordDB.setStuid(MySysUser.loginName());
        int r = appraiseService.selEvaState(evaluateRecordDB);
        if (r > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 提交教评
     */
    @RequestMapping("addAppraise")
    @ResponseBody
    public Object addAppraise(EvaluateVO evaluateVO) {
        evaluateVO.setStuid(MySysUser.loginName());
        //判断成绩是否存在
        int res1 = appraiseService.selTchExamState(evaluateVO);
        if (res1 > 0) {
            //添加记录
            int res_addAppraise = appraiseService.addAppraise(evaluateVO);
            //更新成绩
            int res_updOneTchExam = appraiseService.updOneTchExam(evaluateVO);
            if (res_addAppraise == 1 && res_updOneTchExam == 1) {
                return true;
            } else {
                return false;
            }
        } else if (res1 == 0) {
            //添加记录
            int res_addAppraise = appraiseService.addAppraise(evaluateVO);
            evaluateVO.setPcount(1);
            evaluateVO.setExam(evaluateVO.getErscore());
            //新增成绩
            int res_addOneTchExam = appraiseService.addOneTchExam(evaluateVO);

            if (res_addAppraise == 1 && res_addOneTchExam == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }


    }

}
