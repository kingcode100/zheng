package com.zheng.crawler.rpc.api;

import com.zheng.common.base.BaseService;
import com.zheng.crawler.dao.model.*;

import java.util.List;

/**
* CrawlerCarDetailsService接口
* Created by shuzheng on 2017/12/20.
*/
public interface CrawlerCarDetailsService extends BaseService<CrawlerCarDetails, CrawlerCarDetailsExample> {

    /**
     * 添加洗车详情
     * @param carDetails
     * @param crawlerProductList
     * @param jointImgList
     */
    void addCarDetails(CrawlerCarDetails carDetails,  List<CrawlerProduct> crawlerProductList, List<CrawlerJointImg> jointImgList );
}