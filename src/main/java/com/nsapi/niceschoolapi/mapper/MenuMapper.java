package com.nsapi.niceschoolapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nsapi.niceschoolapi.entity.Menu;
import java.util.List;
import java.util.Map;

import com.nsapi.niceschoolapi.entity.ShowMenuVO;

public interface MenuMapper extends BaseMapper<Menu> {

    List<ShowMenuVO> selectShowMenuByUser(Map<String,Object> map);

    List<Menu> getMenus(Map<String,Object> map);
}