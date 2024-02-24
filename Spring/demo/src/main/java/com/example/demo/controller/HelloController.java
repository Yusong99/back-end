package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * HelloController
 */
// 请求处理类
// @RestController
// public class HelloController {
// @RequestMapping("/hello")
// public String requestMethodName(HttpServletRequest request) {
// String name = request.getParameter("name");
// String age = request.getParameter("age");
// return name + age;
// }
// }
// springboot方法
@RestController
public class HelloController {
    @RequestMapping("/hello")
    // 对于简单参数来说get和post都一样
    public String requestMethodName(@RequestParam(name = "name1", required = false) String name, Integer age) {
        return name + ":" + age;
    }

    @RequestMapping("/pojo")
    public String requestMethodName(User user) {
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/complexPojo")
    public String complexPojo(User user) {
        System.out.println(user);
        return "OK";
    }
}