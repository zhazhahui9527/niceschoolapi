package com.nsapi.niceschoolapi.mapper;

import com.nsapi.niceschoolapi.entity.NewsInfoDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsMapper {
    List<NewsInfoDB> findAllNews(NewsInfoDB newsinfoDB);
    int deleteNews(Integer nId);
    int addNews(NewsInfoDB newsinfoDB);
    int editNews(NewsInfoDB newsinfoDB);
}
