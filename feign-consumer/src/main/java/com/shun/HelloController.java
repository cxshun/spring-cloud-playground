package com.shun;

import com.shun.proxy.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-02-20 15:19
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("hello")
    public String hello(@RequestParam("name") String name) {
        return helloService.hello(name);
    }

}
