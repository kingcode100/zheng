package com.zheng.crawler.dao.mapper;

import com.zheng.crawler.dao.model.CrawlerCarBrand;
import com.zheng.crawler.dao.model.CrawlerCarBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrawlerCarBrandMapper {
    long countByExample(CrawlerCarBrandExample example);

    int deleteByExample(CrawlerCarBrandExample example);

    int deleteByPrimaryKey(Integer carBrandId);

    int insert(CrawlerCarBrand record);

    int insertSelective(CrawlerCarBrand record);

    List<CrawlerCarBrand> selectByExample(CrawlerCarBrandExample example);

    CrawlerCarBrand selectByPrimaryKey(Integer carBrandId);

    int updateByExampleSelective(@Param("record") CrawlerCarBrand record, @Param("example") CrawlerCarBrandExample example);

    int updateByExample(@Param("record") CrawlerCarBrand record, @Param("example") CrawlerCarBrandExample example);

    int updateByPrimaryKeySelective(CrawlerCarBrand record);

    int updateByPrimaryKey(CrawlerCarBrand record);
}