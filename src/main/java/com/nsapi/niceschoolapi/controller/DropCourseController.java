package com.nsapi.niceschoolapi.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsapi.niceschoolapi.common.config.MySysUser;
import com.nsapi.niceschoolapi.entity.CourseVO;
import com.nsapi.niceschoolapi.service.DropCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DropCourseController {
    @Autowired
    private DropCourseService dropCourseService;

    @RequestMapping("exitCourse")
    public String exitCourse() {
        return "exitCourse";
    }

    @RequestMapping("selDropCourse")
    @ResponseBody
    public Object sel(Integer page, Integer limit, String cname) {

        Integer sid = Integer.valueOf(MySysUser.loginName());

        System.out.println(cname);
        PageHelper.startPage(page, limit);
        List<CourseVO> cs = dropCourseService.seledCourse(cname, sid);
        PageInfo pageInfo = new PageInfo(cs);
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

    @RequestMapping("dropCourse")
    @ResponseBody
    public Object dropCourse(Integer cid) {
        Integer sid = Integer.valueOf(MySysUser.loginName());
        int dropcou = dropCourseService.dropcou(sid, cid);
        int updatecou = dropCourseService.updatecou(cid);
        if (dropcou > 0 && updatecou > 0) {
            return "退课成功";
        } else {
            return "退课失败,请稍后再试或联系管理员";
        }
    }
}
