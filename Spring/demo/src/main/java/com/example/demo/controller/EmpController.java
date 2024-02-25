package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Emp;
import com.example.demo.utils.XmlParserUtils;
import com.itheima.pojo.Result;

@RestController
public class EmpController {

    @RequestMapping("/listEmp")
    public Result list() {
        // 加载并解析xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> eList = XmlParserUtils.parse(file, Emp.class);

        // 对数据转换
        eList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }
            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setGender("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });
        // 响应数据
        return Result.success(eList);
    }
}
