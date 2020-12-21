package com.nsapi.niceschoolapi.service;

import com.nsapi.niceschoolapi.entity.NewsInfoDB;

import java.util.List;

public interface NewsService {
    List<NewsInfoDB> findAllNews(NewsInfoDB newsInfoDB);

    int deleteNews(Integer nId);

    int addNews(NewsInfoDB newsInfoDB);

    int editNews(NewsInfoDB newsInfoDB);
}