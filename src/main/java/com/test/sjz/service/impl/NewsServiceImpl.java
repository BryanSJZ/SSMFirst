package com.test.sjz.service.impl;

import com.test.sjz.entity.NewsWithBLOBs;
import com.test.sjz.mapper.NewsMapper;
import com.test.sjz.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 单继重
 * @since 2017/8/31 16:45
 */
@Service("newsService")
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    public NewsWithBLOBs queryById(int id) {
        return newsMapper.selectByPrimaryKey(id);
    }
}
