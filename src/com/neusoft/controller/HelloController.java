package com.neusoft.controller;

import com.neusoft.domain.Dept;
import com.neusoft.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/11/28.
 */
@Controller
public class HelloController {

    @Autowired
    DeptMapper deptMapper;

    @RequestMapping("/hello")
    public String hello()
    {
//        System.out.println("hello");
        Dept dept = deptMapper.getDeptByID(20);
        System.out.println(dept);
        return "hello";
    }
}
