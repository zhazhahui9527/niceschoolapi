package com.nsapi.niceschoolapi.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsapi.niceschoolapi.entity.*;
import com.nsapi.niceschoolapi.service.SchoolManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("schoolManage")
public class SchoolManageController extends BaseController {
    @Autowired
    private SchoolManageService schoolManageService;

    /**
     * 进入班级管理页面
     */
    @RequestMapping("classManage")
    public String classManage() {
        return "view/schoolManage/classManage";
    }

    /**
     * 进入年级管理页面
     */
    @RequestMapping("gradeManage")
    public String gradeManage() {
        return "view/schoolManage/gradeManage";
    }

    /**
     * 进入专业管理页面
     */
    @RequestMapping("majorManage")
    public String majorManage() {
        return "view/schoolManage/majorManage";
    }

    /**
     * 进入院系管理页面
     */
    @RequestMapping("departmentManage")
    public String departmentManage() {
        return "view/schoolManage/departmentManage";
    }

    /*******************************************************************院系管理*********************************************************************/

    /**
     * 添加院系
     */
    @RequestMapping("addDepartment")
    @ResponseBody
    public Object addDepartment(DepartmentDB departmentDB) {
        int check = schoolManageService.checkOneDpm(departmentDB);
        if (check > 0) {
            return false;
        } else {
            int r = schoolManageService.addOneDpm(departmentDB);
            if (r == 1) {
                return true;
            } else {
                return false;
            }
        }

    }

    /**
     * 获取院系列表
     */
    @RequestMapping("findDepartment")
    @ResponseBody
    public Object findDepartment(SchoolManageVO schoolManageVO, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<SchoolManageVO> listAll = schoolManageService.findAllDpm(schoolManageVO);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> dpmData = new HashMap<String, Object>();
        dpmData.put("code", 0);
        dpmData.put("msg", "");
        dpmData.put("count", pageInfo.getTotal());
        dpmData.put("data", pageInfo.getList());
        return dpmData;
    }


    /**
     * 编辑院系
     */
    @RequestMapping("editDepartment")
    @ResponseBody
    public Object editDepartment(DepartmentDB departmentDB) {
        int check = schoolManageService.checkOneDpm(departmentDB);
        if (check > 0) {
            return false;
        } else {
            int r = schoolManageService.editOneDpm(departmentDB);
            if (r == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 删除院系
     *
     * @param did
     * @return
     */
    @RequestMapping("deleteDpm")
    @ResponseBody
    public Object deleteDpm(Integer did) {
        int r = schoolManageService.delOneDpm(did);
        if (r == 1) {
            return true;
        } else {
            return false;
        }
    }

    /*******************************************************************专业管理*********************************************************************/

    /**
     * 添加专业
     */
    @RequestMapping("addMajor")
    @ResponseBody
    public Object addMajor(MajorDB majorDB) {
        int check = schoolManageService.checkOneMajor(majorDB);
        if (check > 0) {
            return false;
        } else {
            int r = schoolManageService.addOneMajor(majorDB);
            if (r == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 获取专业列表
     */
    @RequestMapping("findMajor")
    @ResponseBody
    public Object findMajor(SchoolManageVO schoolManageVO, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<SchoolManageVO> listAll = schoolManageService.findAllMajor(schoolManageVO);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> majorData = new HashMap<String, Object>();
        majorData.put("code", 0);
        majorData.put("msg", "");
        majorData.put("count", pageInfo.getTotal());
        majorData.put("data", pageInfo.getList());
        return majorData;
    }


    /**
     * 编辑专业
     */
    @RequestMapping("editMajor")
    @ResponseBody
    public Object editMajor(MajorDB majorDB) {
        int check = schoolManageService.checkOneMajor(majorDB);
        if (check > 0) {
            return false;
        } else {
            int r = schoolManageService.editOneMajor(majorDB);
            if (r == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 删除专业
     *
     * @param mid
     * @return
     */
    @RequestMapping("deleteMajor")
    @ResponseBody
    public Object deleteMajor(Integer mid) {
        int r = schoolManageService.delOneMajor(mid);
        if (r == 1) {
            return true;
        } else {
            return false;
        }
    }
    /*******************************************************************年级管理*********************************************************************/

    /**
     * 添加年级
     */
    @RequestMapping("addGrade")
    @ResponseBody
    public Object addGrade(GradeDB examGradeDB) {
        int check = schoolManageService.checkOneGrade(examGradeDB);
        if (check > 0) {
            return false;
        } else {
            int r = schoolManageService.addOneGrade(examGradeDB);
            if (r == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 获取年级列表
     */
    @RequestMapping("findGrade")
    @ResponseBody
    public Object findGrade(SchoolManageVO schoolManageVO, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<SchoolManageVO> listAll = schoolManageService.findAllGrade(schoolManageVO);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> gradeData = new HashMap<String, Object>();
        gradeData.put("code", 0);
        gradeData.put("msg", "");
        gradeData.put("count", pageInfo.getTotal());
        gradeData.put("data", pageInfo.getList());
        return gradeData;
    }

    /**
     * 级联获取专业列表
     */
    @RequestMapping("jlSelMajor")
    @ResponseBody
    public Object jlSelMajor(SchoolManageVO schoolManageVO, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<SchoolManageVO> listAll = schoolManageService.jlSelMajor(schoolManageVO);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> jlmajorData = new HashMap<String, Object>();
        jlmajorData.put("code", 0);
        jlmajorData.put("msg", "");
        jlmajorData.put("count", pageInfo.getTotal());
        jlmajorData.put("data", pageInfo.getList());
        return jlmajorData;
    }


    /**
     * 编辑年级
     */
    @RequestMapping("editGrade")
    @ResponseBody
    public Object editGrade(GradeDB examGradeDB) {
        int check = schoolManageService.checkOneGrade(examGradeDB);
        if (check > 0) {
            return false;
        } else {
            int r = schoolManageService.editOneGrade(examGradeDB);
            if (r == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 删除年级
     *
     * @param gid
     * @return
     */
    @RequestMapping("deleteGrade")
    @ResponseBody
    public Object deleteGrade(Integer gid) {
        int r = schoolManageService.delOneGrade(gid);
        if (r == 1) {
            return true;
        } else {
            return false;
        }
    }
/*******************************************************************班级管理*********************************************************************/

    /**
     * 添加班级
     */
    @RequestMapping("addClass")
    @ResponseBody
    public Object addClass(ClassInfoDB classinfoDB) {
        int check = schoolManageService.checkOneClass(classinfoDB);
        if (check > 0) {
            return false;
        } else {
            int r = schoolManageService.addOneClass(classinfoDB);
            if (r == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 获取班级列表
     */
    @RequestMapping("findAllClass")
    @ResponseBody
    public Object findAllClass(SchoolManageVO schoolManageVO, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<SchoolManageVO> listAll = schoolManageService.findAllClass(schoolManageVO);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> classData = new HashMap<String, Object>();
        classData.put("code", 0);
        classData.put("msg", "");
        classData.put("count", pageInfo.getTotal());
        classData.put("data", pageInfo.getList());
        return classData;
    }

    /**
     * 级联获取年级列表
     */
    @RequestMapping("jlSelGrade")
    @ResponseBody
    public Object jlSelGrade(SchoolManageVO schoolManageVO, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<SchoolManageVO> listAll = schoolManageService.jlSelGrade(schoolManageVO);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> jlgradeData = new HashMap<String, Object>();
        jlgradeData.put("code", 0);
        jlgradeData.put("msg", "");
        jlgradeData.put("count", pageInfo.getTotal());
        jlgradeData.put("data", pageInfo.getList());
        return jlgradeData;
    }


    /**
     * 编辑班级
     */
    @RequestMapping("editClass")
    @ResponseBody
    public Object editClass(ClassInfoDB classinfoDB) {
        int check = schoolManageService.checkOneClass(classinfoDB);
        if (check > 0) {
            return false;
        } else {
            int r = schoolManageService.editOneClass(classinfoDB);
            if (r == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 删除班级
     *
     * @param classid
     * @return
     */
    @RequestMapping("deleteClass")
    @ResponseBody
    public Object deleteClass(Integer classid) {
        int r = schoolManageService.delOneClass(classid);
        if (r == 1) {
            return true;
        } else {
            return false;
        }
    }
/*******************************************************************条件查询*********************************************************************/

    /**
     * 条件查询班级
     */
    @RequestMapping("tjSelClass")
    @ResponseBody
    public Object tjSelClass(SchoolManageVO schoolManageVO, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<SchoolManageVO> listAll = schoolManageService.tjSelClass(schoolManageVO);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> classData = new HashMap<String, Object>();
        classData.put("code", 0);
        classData.put("msg", "");
        classData.put("count", pageInfo.getTotal());
        classData.put("data", pageInfo.getList());
        return classData;
    }

    /**
     * 条件查询院系
     */
    @RequestMapping("tjSelDepartment")
    @ResponseBody
    public Object tjSelDepartment(SchoolManageVO schoolManageVO, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<SchoolManageVO> listAll = schoolManageService.tjSelDpm(schoolManageVO);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> dpmData = new HashMap<String, Object>();
        dpmData.put("code", 0);
        dpmData.put("msg", "");
        dpmData.put("count", pageInfo.getTotal());
        dpmData.put("data", pageInfo.getList());
        return dpmData;
    }

    /**
     * 条件查询专业
     */
    @RequestMapping("tjSelMajor")
    @ResponseBody
    public Object tjSelMajor(SchoolManageVO schoolManageVO, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<SchoolManageVO> listAll = schoolManageService.tjSelMajor(schoolManageVO);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> majorData = new HashMap<String, Object>();
        majorData.put("code", 0);
        majorData.put("msg", "");
        majorData.put("count", pageInfo.getTotal());
        majorData.put("data", pageInfo.getList());
        return majorData;
    }

    /**
     * 条件查询年级
     */
    @RequestMapping("tjSelGrade")
    @ResponseBody
    public Object tjSelGrade(SchoolManageVO schoolManageVO, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<SchoolManageVO> listAll = schoolManageService.tjSelGrade(schoolManageVO);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> gradeData = new HashMap<String, Object>();
        gradeData.put("code", 0);
        gradeData.put("msg", "");
        gradeData.put("count", pageInfo.getTotal());
        gradeData.put("data", pageInfo.getList());
        return gradeData;
    }


}
