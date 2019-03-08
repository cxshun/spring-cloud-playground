package com.shun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-02-20 15:23
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class FeignProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignProviderApplication.class, args);
    }

}
