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
    public List<NewsInfoDB> findAllNews(NewsInfoDB newsInfoDB) {
        return newsMapper.findAllNews(newsInfoDB);
    }

    @Override
    public int deleteNews(Integer nId) {
        return newsMapper.deleteNews(nId);
    }

    @Override
    public int addNews(NewsInfoDB newsInfoDB) {
        return newsMapper.addNews(newsInfoDB);
    }

    @Override
    public int editNews(NewsInfoDB newsInfoDB) {
        return newsMapper.editNews(newsInfoDB);
    }
}