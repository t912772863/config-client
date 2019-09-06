package com.tian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Creaed by Administrator on 2018/7/31 0031.
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${test}")
    private String test;

    @GetMapping("/test")
    public String test(){
        return "this is test: "+ test;
    }
}
