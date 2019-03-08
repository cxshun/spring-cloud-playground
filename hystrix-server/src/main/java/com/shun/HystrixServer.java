package com.shun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-03-07 15:31
 **/
@SpringBootApplication
@EnableHystrixDashboard
@EnableDiscoveryClient
public class HystrixServer {

    public static void main(String[] args) {
        SpringApplication.run(HystrixServer.class, args);
    }

}
