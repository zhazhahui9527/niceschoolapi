package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.NewsInfoDB;
import com.nsapi.niceschoolapi.mapper.NewsMapper;
import com.nsapi.niceschoolapi.service.NewsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;
    @Override
    public List<NewsInfoDB> findAllNews(NewsInfoDB newsinfoDB) {
        return newsMapper.findAllNews(newsinfoDB);
    }

    @Override
    public int deleteNews(Integer nId) {
        return newsMapper.deleteNews(nId);
    }

    @Override
    public int addNews(NewsInfoDB newsinfoDB) {
        return newsMapper.addNews(newsinfoDB);
    }

    @Override
    public int editNews(NewsInfoDB newsinfoDB) {
        return newsMapper.editNews(newsinfoDB);
    }
}