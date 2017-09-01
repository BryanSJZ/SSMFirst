package com.test.sjz.service;

import com.test.sjz.entity.NewsWithBLOBs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

/**
 * 新闻Service层测试类
 * @author 单继重
 * @since 2017/8/31 16:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring-mybatis.xml"})
public class TestNewsService {
    private static Logger logger = Logger.getLogger(String.valueOf(TestNewsService.class));
    @Autowired
    private NewsService newsService;

    @Test
    public void testQueryById() {
        NewsWithBLOBs news = newsService.queryById(1);
        // System.out.println(user.getUserName());
         logger.info("值："+news.getTitle());
        System.out.println(news);
    }
}
