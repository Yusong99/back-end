package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dao.EmpDao;
import com.example.demo.pojo.Emp;
import com.example.demo.utils.XmlParserUtils;

/**
 * EmpDaoA
 */
@Component
public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
        // 加载并解析xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> eList = XmlParserUtils.parse(file, Emp.class);
        return eList;
    }
}