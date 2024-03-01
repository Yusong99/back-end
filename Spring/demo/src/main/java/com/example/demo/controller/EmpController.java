package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Emp;
import com.example.demo.service.EmpService;
import com.example.demo.service.impl.EmpServiceA;
import com.example.demo.utils.XmlParserUtils;
import com.itheima.pojo.Result;

import jakarta.annotation.Resource;

@RestController
public class EmpController {

    // @RequestMapping("/listEmp")
    // public Result list() {
    // // 加载并解析xml
    // String file =
    // this.getClass().getClassLoader().getResource("emp.xml").getFile();
    // System.out.println(file);
    // List<Emp> eList = XmlParserUtils.parse(file, Emp.class);

    // // 对数据转换
    // eList.stream().forEach(emp -> {
    // String gender = emp.getGender();
    // if ("1".equals(gender)) {
    // emp.setGender("男");
    // } else if ("2".equals(gender)) {
    // emp.setGender("女");
    // }
    // String job = emp.getJob();
    // if ("1".equals(job)) {
    // emp.setJob("讲师");
    // } else if ("2".equals(job)) {
    // emp.setGender("班主任");
    // } else if ("3".equals(job)) {
    // emp.setJob("就业指导");
    // }
    // });
    // // 响应数据
    // return Result.success(eList);
    // }
    // @Qualifier("empServiceB") // 用于在不止一个Service的情况下指定，首字母小写
    // @Autowired
    @Resource(name = "empServiceA")
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
        // 调用service 获取数据
        List<Emp> eList = empService.listEmp();
        return Result.success(eList);
    }
}
