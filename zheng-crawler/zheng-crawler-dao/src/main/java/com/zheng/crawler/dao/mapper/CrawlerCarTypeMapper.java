package com.zheng.crawler.dao.mapper;

import com.zheng.crawler.dao.model.CrawlerCarType;
import com.zheng.crawler.dao.model.CrawlerCarTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrawlerCarTypeMapper {
    long countByExample(CrawlerCarTypeExample example);

    int deleteByExample(CrawlerCarTypeExample example);

    int deleteByPrimaryKey(Integer carTypeId);

    int insert(CrawlerCarType record);

    int insertSelective(CrawlerCarType record);

    List<CrawlerCarType> selectByExample(CrawlerCarTypeExample example);

    CrawlerCarType selectByPrimaryKey(Integer carTypeId);

    int updateByExampleSelective(@Param("record") CrawlerCarType record, @Param("example") CrawlerCarTypeExample example);

    int updateByExample(@Param("record") CrawlerCarType record, @Param("example") CrawlerCarTypeExample example);

    int updateByPrimaryKeySelective(CrawlerCarType record);

    int updateByPrimaryKey(CrawlerCarType record);
}