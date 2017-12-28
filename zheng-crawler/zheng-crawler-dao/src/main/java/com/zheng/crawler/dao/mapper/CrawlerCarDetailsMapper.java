package com.zheng.crawler.dao.mapper;

import com.zheng.crawler.dao.model.CrawlerCarDetails;
import com.zheng.crawler.dao.model.CrawlerCarDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrawlerCarDetailsMapper {
    long countByExample(CrawlerCarDetailsExample example);

    int deleteByExample(CrawlerCarDetailsExample example);

    int deleteByPrimaryKey(Integer carDetailsId);

    int insert(CrawlerCarDetails record);

    int insertSelective(CrawlerCarDetails record);

    List<CrawlerCarDetails> selectByExample(CrawlerCarDetailsExample example);

    CrawlerCarDetails selectByPrimaryKey(Integer carDetailsId);

    int updateByExampleSelective(@Param("record") CrawlerCarDetails record, @Param("example") CrawlerCarDetailsExample example);

    int updateByExample(@Param("record") CrawlerCarDetails record, @Param("example") CrawlerCarDetailsExample example);

    int updateByPrimaryKeySelective(CrawlerCarDetails record);

    int updateByPrimaryKey(CrawlerCarDetails record);
}