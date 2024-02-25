package com.example.demo.dao;

import java.util.List;

import com.example.demo.pojo.Emp;

public interface EmpDao {
    // 获取员工列表数据
    public List<Emp> listEmp();
}
