package com.shun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-02-20 15:17
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "hello:" + name;
    }

}
