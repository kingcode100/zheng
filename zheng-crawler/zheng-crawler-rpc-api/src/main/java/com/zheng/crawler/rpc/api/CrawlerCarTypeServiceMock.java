package com.zheng.crawler.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.crawler.dao.mapper.CrawlerCarTypeMapper;
import com.zheng.crawler.dao.model.CrawlerCarType;
import com.zheng.crawler.dao.model.CrawlerCarTypeExample;

/**
* 降级实现CrawlerCarTypeService接口
* Created by shuzheng on 2017/12/19.
*/
public class CrawlerCarTypeServiceMock extends BaseServiceMock<CrawlerCarTypeMapper, CrawlerCarType, CrawlerCarTypeExample> implements CrawlerCarTypeService {

}
