package com.shun.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-03-08 17:08
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
public class TurbineServer {

    public static void main(String[] args) {
        SpringApplication.run(TurbineServer.class, args);
    }

}
