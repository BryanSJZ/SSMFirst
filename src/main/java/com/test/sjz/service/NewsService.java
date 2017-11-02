package com.test.sjz.service;

import com.test.sjz.entity.NewsWithBLOBs;

/**
 * @author 单继重
 * @since 2017/8/31 16:44
 */
public interface NewsService {
    /**
     * 根据主键ID查询出一条新闻
     * @param id 主键ID
     * @return 新闻实体类
     */
    public NewsWithBLOBs queryById(int id);

    public void delById(int id);
}
