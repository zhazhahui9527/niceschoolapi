package com.nsapi.niceschoolapi.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsapi.niceschoolapi.entity.CourseTypeDB;
import com.nsapi.niceschoolapi.entity.CourseVO;
import com.nsapi.niceschoolapi.entity.MajorDB;
import com.nsapi.niceschoolapi.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CourseController {
    @Autowired
    private courseService courseService;

    @RequestMapping("findCourse")
    public String findCourse() {
        return "findCourse";
    }

    @RequestMapping("selCourse")
    @ResponseBody
    public Object selCourse(Integer page, Integer limit, CourseVO CourseVO, String cname) {

        CourseVO.setCname(cname);
        PageHelper.startPage(page, limit);
        List<CourseVO> cs = courseService.selCourse(CourseVO);


        PageInfo pageInfo = new PageInfo(cs);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        System.out.print(cs);
        return tableData;
    }


    @RequestMapping("selMajor")
    @ResponseBody
    public Object selMajor() {
        List<MajorDB> major = courseService.selMajor();
        return major;
    }

    @RequestMapping("selCourseType")
    @ResponseBody
    public Object selCourseType() {
        List<CourseTypeDB> coursetype = courseService.selCourseType();

        return coursetype;
    }

    @RequestMapping("updateCourse")
    @ResponseBody
    public Object updateCourse(CourseVO CourseVO) {
        int update = courseService.updateCourse(CourseVO);
        if (update == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    @RequestMapping("addCourse")
    @ResponseBody
    public Object addCourse(CourseVO CourseVO) {
        int addcou = courseService.addCourse(CourseVO);
        if (addcou == 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }

    }

    @RequestMapping("deleteCourse")
    @ResponseBody
    public Object deleteCourse(Integer cid) {

        int delercou = courseService.selCount(cid);
        if (delercou > 0) {
            return "✖  该课程有人在读不可删除";
        } else {
            int add = courseService.deleteCourse(cid);
            if (add == 1) {
                return "删除成功";
            } else {
                return "删除失败";
            }
        }

    }

    @RequestMapping("renewCourse")
    @ResponseBody
    public Object renewCourse(Integer cid) {
        int add = courseService.renewCourse(cid);
        if (add == 1) {
            return "恢复成功";
        } else {
            return "恢复失败";
        }
    }
}
