package com.zheng.crawler.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.crawler.dao.mapper.CrawlerCarTypeMapper;
import com.zheng.crawler.dao.model.CrawlerCarType;
import com.zheng.crawler.dao.model.CrawlerCarTypeExample;
import com.zheng.crawler.rpc.api.CrawlerCarTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CrawlerCarTypeService实现
* Created by shuzheng on 2017/12/19.
*/
@Service
@Transactional
@BaseService
public class CrawlerCarTypeServiceImpl extends BaseServiceImpl<CrawlerCarTypeMapper, CrawlerCarType, CrawlerCarTypeExample> implements CrawlerCarTypeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlerCarTypeServiceImpl.class);

    @Autowired
    CrawlerCarTypeMapper crawlerCarTypeMapper;

}