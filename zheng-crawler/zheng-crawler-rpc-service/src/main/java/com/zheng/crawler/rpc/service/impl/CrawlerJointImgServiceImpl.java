package com.zheng.crawler.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.crawler.dao.mapper.CrawlerJointImgMapper;
import com.zheng.crawler.dao.model.CrawlerJointImg;
import com.zheng.crawler.dao.model.CrawlerJointImgExample;
import com.zheng.crawler.rpc.api.CrawlerJointImgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CrawlerJointImgService实现
* Created by shuzheng on 2017/12/20.
*/
@Service
@Transactional
@BaseService
public class CrawlerJointImgServiceImpl extends BaseServiceImpl<CrawlerJointImgMapper, CrawlerJointImg, CrawlerJointImgExample> implements CrawlerJointImgService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlerJointImgServiceImpl.class);

    @Autowired
    CrawlerJointImgMapper crawlerJointImgMapper;

}