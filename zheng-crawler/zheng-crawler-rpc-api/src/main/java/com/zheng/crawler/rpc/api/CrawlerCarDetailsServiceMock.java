package com.zheng.crawler.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.crawler.dao.mapper.CrawlerCarDetailsMapper;
import com.zheng.crawler.dao.model.CrawlerCarDetails;
import com.zheng.crawler.dao.model.CrawlerCarDetailsExample;
import com.zheng.crawler.dao.model.CrawlerJointImg;
import com.zheng.crawler.dao.model.CrawlerProduct;

import java.util.List;

/**
* 降级实现CrawlerCarDetailsService接口
* Created by shuzheng on 2017/12/20.
*/
public class CrawlerCarDetailsServiceMock extends BaseServiceMock<CrawlerCarDetailsMapper, CrawlerCarDetails, CrawlerCarDetailsExample> implements CrawlerCarDetailsService {

    @Override
    public void addCarDetails(CrawlerCarDetails carDetails, List<CrawlerProduct> crawlerProductList, List<CrawlerJointImg> jointImgList) {

    }
}
