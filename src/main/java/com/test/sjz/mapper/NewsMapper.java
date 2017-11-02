package com.test.sjz.mapper;


import com.test.sjz.entity.News;
import com.test.sjz.entity.NewsWithBLOBs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsMapper {
    @Delete("DELETE FROM t_news WHERE id = #{id}")
    int deleteByPrimaryKey(Integer id);

    int insert(NewsWithBLOBs record);

    int insertSelective(NewsWithBLOBs record);

    NewsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewsWithBLOBs record);

    int updateByPrimaryKey(News record);
}