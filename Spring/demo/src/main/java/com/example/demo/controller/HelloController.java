package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    @RequestMapping("/xys")
    public String requestMethodName() {
        return "xys";
    }

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

    @RequestMapping("/arrayParam")
    public String requestMethodName(String[] name) {
        System.out.println(Arrays.toString(name));
        return Arrays.toString(name);
    }

    @RequestMapping("/listParam")
    public String lsitParam(@RequestParam List<String> list) {
        System.out.println(list);
        return "OK";
    }

    @RequestMapping("/dateParam")
    public String requestMethodName(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime upDateTime) {
        System.out.println(upDateTime);
        return "OK";
    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {
        System.out.println(user);
        return "OK";
    }

    // 使用Integer是因为要允许存在参数为空或者不确定路径参数是否总是有效
    // 使用封装好的包装类就会允许参数为空值
    @RequestMapping("/pathParam/{id}/{name}")
    public String jsonParam(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id + ":" + name);
        return "OK";
    }
}