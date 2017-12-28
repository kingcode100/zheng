package com.zheng.crawler.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.crawler.dao.mapper.CrawlerCarBrandMapper;
import com.zheng.crawler.dao.model.CrawlerCarBrand;
import com.zheng.crawler.dao.model.CrawlerCarBrandExample;
import com.zheng.crawler.rpc.api.CrawlerCarBrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CrawlerCarBrandService实现
* Created by shuzheng on 2017/12/19.
*/
@Service
@Transactional
@BaseService
public class CrawlerCarBrandServiceImpl extends BaseServiceImpl<CrawlerCarBrandMapper, CrawlerCarBrand, CrawlerCarBrandExample> implements CrawlerCarBrandService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlerCarBrandServiceImpl.class);

    @Autowired
    CrawlerCarBrandMapper crawlerCarBrandMapper;

}