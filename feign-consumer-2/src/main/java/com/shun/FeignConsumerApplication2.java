package com.shun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-02-20 15:20
 **/
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
public class FeignConsumerApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication2.class, args);
    }

}