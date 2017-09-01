package com.test.sjz.mapper;


import com.test.sjz.entity.News;
import com.test.sjz.entity.NewsWithBLOBs;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsWithBLOBs record);

    int insertSelective(NewsWithBLOBs record);

    NewsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewsWithBLOBs record);

    int updateByPrimaryKey(News record);
}