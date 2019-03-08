package com.shun.proxy;

import org.springframework.stereotype.Component;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-03-07 18:02
 **/
@Component
public class HelloServiceFallBackImpl implements HelloService{
    @Override
    public String hello(String name) {
        return "This is a fallback method, not business code";
    }
}
