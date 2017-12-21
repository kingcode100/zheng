package com.zheng.crawler.dao.mapper;

import com.zheng.crawler.dao.model.CrawlerCarProduct;
import com.zheng.crawler.dao.model.CrawlerCarProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrawlerCarProductMapper {
    long countByExample(CrawlerCarProductExample example);

    int deleteByExample(CrawlerCarProductExample example);

    int deleteByPrimaryKey(Integer carProductId);

    int insert(CrawlerCarProduct record);

    int insertSelective(CrawlerCarProduct record);

    List<CrawlerCarProduct> selectByExample(CrawlerCarProductExample example);

    CrawlerCarProduct selectByPrimaryKey(Integer carProductId);

    int updateByExampleSelective(@Param("record") CrawlerCarProduct record, @Param("example") CrawlerCarProductExample example);

    int updateByExample(@Param("record") CrawlerCarProduct record, @Param("example") CrawlerCarProductExample example);

    int updateByPrimaryKeySelective(CrawlerCarProduct record);

    int updateByPrimaryKey(CrawlerCarProduct record);
}