package com.shun.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-02-20 15:19
 **/
@FeignClient(name = "feign-provider", fallback = HelloServiceFallBackImpl.class)
public interface HelloService {

    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);

}
