package com.zheng.crawler.rpc.service.impl;

import com.zheng.crawler.rpc.api.CrawlerService;

/**
 * 实现DemoService接口
 * Created by shuzheng on 2017/4/1.
 */
public class CrawlerServiceImpl implements CrawlerService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }

}