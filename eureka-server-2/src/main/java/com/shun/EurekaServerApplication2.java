package com.shun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-02-19 15:00
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableEurekaServer
public class EurekaServerApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication2.class, args);
    }

}
