package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpDao;
import com.example.demo.dao.impl.EmpDaoA;
import com.example.demo.pojo.Emp;
import com.example.demo.service.EmpService;

// @Primary // 可以在同名的情况下指定
@Service
public class EmpServiceA implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {
        // 调用 dao获取数据
        List<Emp> eList = empDao.listEmp();
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
        return eList;
    }

}
