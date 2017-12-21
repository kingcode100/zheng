package com.zheng.crawler.dao.mapper;

import com.zheng.crawler.dao.model.CrawlerProduct;
import com.zheng.crawler.dao.model.CrawlerProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrawlerProductMapper {
    long countByExample(CrawlerProductExample example);

    int deleteByExample(CrawlerProductExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(CrawlerProduct record);

    int insertSelective(CrawlerProduct record);

    List<CrawlerProduct> selectByExample(CrawlerProductExample example);

    CrawlerProduct selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") CrawlerProduct record, @Param("example") CrawlerProductExample example);

    int updateByExample(@Param("record") CrawlerProduct record, @Param("example") CrawlerProductExample example);

    int updateByPrimaryKeySelective(CrawlerProduct record);

    int updateByPrimaryKey(CrawlerProduct record);
}