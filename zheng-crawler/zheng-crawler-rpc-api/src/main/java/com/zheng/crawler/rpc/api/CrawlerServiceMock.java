package com.zheng.crawler.rpc.api;

/**
 * 降级实现DemoService接口
 * Created by shuzheng on 2017/4/1.
 */
public class CrawlerServiceMock implements CrawlerService {

    @Override
    public String sayHello(String name) {
        return null;
    }

}
