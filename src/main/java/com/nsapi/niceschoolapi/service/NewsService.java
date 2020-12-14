package com.nsapi.niceschoolapi.service;

import com.nsapi.niceschoolapi.entity.NewsInfoDB;

import java.util.List;

public interface NewsService {
    List<NewsInfoDB> findAllNews(NewsInfoDB newsinfoDB);
    int deleteNews(Integer nId);
    int addNews(NewsInfoDB newsinfoDB);
    int editNews(NewsInfoDB newsinfoDB);
}