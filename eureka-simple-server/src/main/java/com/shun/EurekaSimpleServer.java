package com.shun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-03-19 11:31
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableEurekaServer
public class EurekaSimpleServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSimpleServer.class, args);
    }

}
