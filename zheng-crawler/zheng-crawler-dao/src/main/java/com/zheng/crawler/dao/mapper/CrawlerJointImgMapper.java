package com.zheng.crawler.dao.mapper;

import com.zheng.crawler.dao.model.CrawlerJointImg;
import com.zheng.crawler.dao.model.CrawlerJointImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrawlerJointImgMapper {
    long countByExample(CrawlerJointImgExample example);

    int deleteByExample(CrawlerJointImgExample example);

    int deleteByPrimaryKey(Integer jointImgId);

    int insert(CrawlerJointImg record);

    int insertSelective(CrawlerJointImg record);

    List<CrawlerJointImg> selectByExample(CrawlerJointImgExample example);

    CrawlerJointImg selectByPrimaryKey(Integer jointImgId);

    int updateByExampleSelective(@Param("record") CrawlerJointImg record, @Param("example") CrawlerJointImgExample example);

    int updateByExample(@Param("record") CrawlerJointImg record, @Param("example") CrawlerJointImgExample example);

    int updateByPrimaryKeySelective(CrawlerJointImg record);

    int updateByPrimaryKey(CrawlerJointImg record);
}