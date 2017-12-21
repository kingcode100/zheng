package com.zheng.crawler.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.crawler.dao.mapper.CrawlerProductMapper;
import com.zheng.crawler.dao.model.CrawlerProduct;
import com.zheng.crawler.dao.model.CrawlerProductExample;

/**
* 降级实现CrawlerProductService接口
* Created by shuzheng on 2017/12/20.
*/
public class CrawlerProductServiceMock extends BaseServiceMock<CrawlerProductMapper, CrawlerProduct, CrawlerProductExample> implements CrawlerProductService {

}
