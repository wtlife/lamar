package com.wtlife.letsgo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wutao
 * @version V1.0
 * @Desc GreetingController
 * @date 2020/7/27
 */
@RestController
@RequestMapping("greet")
public class GreetingController {

    private Logger logger = LoggerFactory.getLogger("greet");

    @GetMapping("hello")
    public String hello(){

        return "Hello,world";
    }

}
