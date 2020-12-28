package com.nsapi.niceschoolapi.service;

import com.nsapi.niceschoolapi.entity.StudentDB;
import com.nsapi.niceschoolapi.entity.PageCount;

import java.util.List;
import java.util.Map;

public interface DropoutService {
    //  查询所有退学信息
    List<Map> selDropout(PageCount pageCount, StudentDB studentDB);

    //  查询所有信息数量
    int selDropoutCount(StudentDB studentDB);

    // 删除退学信息
    int deleteDropout(Integer drid);
}
