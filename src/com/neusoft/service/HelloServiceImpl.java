package com.neusoft.service;

import com.neusoft.domain.Dept;
import com.neusoft.mapper.DeptMapper;
import com.neusoft.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018/11/28.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    DeptMapper deptMapper;

    @Autowired
    EmpMapper empMapper;

    @Value("${age}")
    private Integer age;

    @Override
    @Transactional
    public Dept getDeptByID(int id) {

        System.out.println("ageageage" + age);
        Dept dept = new Dept();
        dept.setDname("develop3");
        deptMapper.addDept(dept);

        int k = 3/0;

        empMapper.deleteByPrimaryKey(7369);

        return deptMapper.getDeptByID(id);


    }
}
