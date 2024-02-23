package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloController
 */
// 请求处理类
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String requestMethodName() {
        return "hello";
    }
}