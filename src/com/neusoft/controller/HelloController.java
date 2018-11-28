package com.neusoft.controller;

import com.neusoft.domain.Dept;
import com.neusoft.mapper.DeptMapper;
import com.neusoft.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/11/28.
 */
@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello()
    {
//        System.out.println("hello");
        Dept dept = helloService.getDeptByID(20);
        System.out.println(dept);
        return "hello";
    }
}
