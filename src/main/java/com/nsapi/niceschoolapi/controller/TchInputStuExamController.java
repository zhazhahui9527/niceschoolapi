package com.nsapi.niceschoolapi.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsapi.niceschoolapi.common.config.MySysUser;
import com.nsapi.niceschoolapi.entity.*;
import com.nsapi.niceschoolapi.service.TchInputStuExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TchInputStuExamController {

    @Autowired
    private TchInputStuExamService tchInputStuExamService;

    @RequestMapping("InputStudentExam")
    public String InputStudentExam() {
        return "InputStudentExam";
    }

    /**
     * 获取学生课程
     * @param page
     * @param limit
     * @param stuExamVO
     * @return
     */
    @RequestMapping("selScs")
    @ResponseBody
    public Object selSc(Integer page, Integer limit, StuExamVO stuExamVO) {
        stuExamVO.setTid(Integer.valueOf(MySysUser.loginName()));
        PageHelper.startPage(page, limit);
        List<StuExamVO> stuCourseVOS = tchInputStuExamService.selScs(stuExamVO);
        PageInfo pageInfo = new PageInfo(stuCourseVOS);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        // System.out.print(cs);
        return tableData;
    }

    //下面是下拉框

    /**
     * 获取部系
     * @return
     */
    @RequestMapping("selDes")
    @ResponseBody
    public Object selDes() {
        List<DepartmentDB> departmentDBS = tchInputStuExamService.selDes();
        //System.out.println(departmentDBS);
        return departmentDBS;
    }

    /**
     * 获取专业
     * @param did
     * @return
     */
    @RequestMapping("selMas")
    @ResponseBody
    public Object selMas(Integer did) {
        //System.out.println(did);
        List<MajorDB> majors = tchInputStuExamService.selMas(did);
        //System.out.println(majors);
        return majors;
    }

    /**
     * 获取年级
     * @param mid
     * @return
     */
    @RequestMapping("selGrs")
    @ResponseBody
    public Object selGrs(Integer mid) {
        //System.out.println(mid);
        List<GradeDB> examGradeDBS = tchInputStuExamService.selGrs(mid);
        // System.out.println(gradeDBS);
        return examGradeDBS;
    }

    /**
     * 获取班级
     * @param gid
     * @return
     */
    @RequestMapping("selCls")
    @ResponseBody
    public Object selCls(Integer gid) {
        System.out.println(gid);
        List<ClassInfoDB> classInfoDBS = tchInputStuExamService.selClasss(gid);
        // System.out.println(classinfoDBS);
        return classInfoDBS;
    }

    /**
     * 获取成绩
     * @param stuExamVO
     * @return
     */
    @ResponseBody
    @RequestMapping("selMessage")
    public Object selMessage(StuExamVO stuExamVO) {
        String msg = "";
        int i = tchInputStuExamService.selExam(stuExamVO);
        if (i == 1) {
            msg = "请不要重复导入成绩";
        } else {
            int num = tchInputStuExamService.add(stuExamVO);
            if (num == 1) {
                msg = "添加成功";
            } else {
                msg = "添加失败";
            }
        }
        return msg;
    }

    /**
     * 保存更新
     * @param stuExamDB
     * @return
     */
    @ResponseBody
    @RequestMapping("saveUpdate")
    public Object saveUpdate(StuExamDB stuExamDB) {
        String msg = "";
        int nums = tchInputStuExamService.updateExam(stuExamDB);
        if (nums == 1) {
            msg = "修改成功";
        }
        return msg;
    }
}
