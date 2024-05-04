package com.EasyDrive.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "测试 测试 测试";
    }
}
