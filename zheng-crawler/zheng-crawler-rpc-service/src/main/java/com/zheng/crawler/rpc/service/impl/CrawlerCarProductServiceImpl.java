package com.zheng.crawler.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.crawler.dao.mapper.CrawlerCarProductMapper;
import com.zheng.crawler.dao.model.CrawlerCarProduct;
import com.zheng.crawler.dao.model.CrawlerCarProductExample;
import com.zheng.crawler.rpc.api.CrawlerCarProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CrawlerCarProductService实现
* Created by shuzheng on 2017/12/20.
*/
@Service
@Transactional
@BaseService
public class CrawlerCarProductServiceImpl extends BaseServiceImpl<CrawlerCarProductMapper, CrawlerCarProduct, CrawlerCarProductExample> implements CrawlerCarProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlerCarProductServiceImpl.class);

    @Autowired
    CrawlerCarProductMapper crawlerCarProductMapper;

}