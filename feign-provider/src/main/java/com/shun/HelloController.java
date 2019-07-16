package com.shun;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-02-20 15:17
 **/
@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        log.info("here is provider");
        return "hello:" + name + ",by provider";
    }

}
