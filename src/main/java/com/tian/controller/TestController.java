package com.tian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Creaed by Administrator on 2018/7/31 0031.
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "this is test.";
    }
}
