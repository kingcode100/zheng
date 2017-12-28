package com.zheng.crawler.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.crawler.dao.mapper.CrawlerCarProductMapper;
import com.zheng.crawler.dao.model.CrawlerCarProduct;
import com.zheng.crawler.dao.model.CrawlerCarProductExample;

/**
* 降级实现CrawlerCarProductService接口
* Created by shuzheng on 2017/12/20.
*/
public class CrawlerCarProductServiceMock extends BaseServiceMock<CrawlerCarProductMapper, CrawlerCarProduct, CrawlerCarProductExample> implements CrawlerCarProductService {

}
