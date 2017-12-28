package com.zheng.crawler.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.crawler.dao.mapper.CrawlerProductMapper;
import com.zheng.crawler.dao.model.CrawlerProduct;
import com.zheng.crawler.dao.model.CrawlerProductExample;
import com.zheng.crawler.rpc.api.CrawlerProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CrawlerProductService实现
* Created by shuzheng on 2017/12/20.
*/
@Service
@Transactional
@BaseService
public class CrawlerProductServiceImpl extends BaseServiceImpl<CrawlerProductMapper, CrawlerProduct, CrawlerProductExample> implements CrawlerProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlerProductServiceImpl.class);

    @Autowired
    CrawlerProductMapper crawlerProductMapper;

}