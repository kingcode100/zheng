package com.zheng.crawler.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.crawler.dao.mapper.CrawlerCarDetailsMapper;
import com.zheng.crawler.dao.mapper.CrawlerCarProductMapper;
import com.zheng.crawler.dao.mapper.CrawlerJointImgMapper;
import com.zheng.crawler.dao.mapper.CrawlerProductMapper;
import com.zheng.crawler.dao.model.*;
import com.zheng.crawler.rpc.api.CrawlerCarDetailsService;
import com.zheng.crawler.rpc.api.CrawlerCarProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* CrawlerCarDetailsService实现
* Created by shuzheng on 2017/12/20.
*/
@Service
@Transactional
@BaseService
public class CrawlerCarDetailsServiceImpl extends BaseServiceImpl<CrawlerCarDetailsMapper, CrawlerCarDetails, CrawlerCarDetailsExample> implements CrawlerCarDetailsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlerCarDetailsServiceImpl.class);

    @Autowired
    CrawlerCarDetailsMapper crawlerCarDetailsMapper;

    @Autowired
    CrawlerCarProductMapper crawlerCarProductMapper;

    @Autowired
    CrawlerProductMapper crawlerProductMapper;

    @Autowired
    CrawlerJointImgMapper crawlerJointImgMapper;

    @Override
    public void addCarDetails(CrawlerCarDetails carDetails,  List<CrawlerProduct> crawlerProductList, List<CrawlerJointImg> jointImgList) {
        if(null == carDetails){
            return;
        }
        CrawlerCarProduct crawlerCarProduct = null;
        crawlerCarDetailsMapper.insertSelective(carDetails);
        if( null != crawlerProductList && crawlerProductList.size() > 0 ){

            //遍历添加详情、产品和产品关联信息
            for(CrawlerProduct item : crawlerProductList){
                CrawlerProduct product = crawlerProductMapper.selectByPrimaryKey(item.getProductId());
                if(null == product){
                    crawlerProductMapper.insertSelective(item);
                }
                crawlerCarProduct = new CrawlerCarProduct();
                crawlerCarProduct.setCarDetailsId(carDetails.getCarDetailsId());
                crawlerCarProduct.setProductId(item.getProductId());
                crawlerCarProductMapper.insert(crawlerCarProduct);
            }
        }

        if(null != jointImgList && jointImgList.size() > 0 ){

            //遍历添加接头信息
            for(CrawlerJointImg item : jointImgList){
                item.setCarDetailsId(carDetails.getCarDetailsId());
                crawlerJointImgMapper.insert(item);
            }
        }
    }
}