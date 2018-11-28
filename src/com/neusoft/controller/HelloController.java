package com.neusoft.controller;

import com.neusoft.domain.Dept;
import com.neusoft.mapper.DeptMapper;
import com.neusoft.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/11/28.
 */
@Controller
public class HelloController {

    @Value("${user_name}")
    private String uname;



    @Value("${chengmi_crawl_timer_enable}")
    private Boolean bbb;

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println(uname + bbb);
        Dept dept = helloService.getDeptByID(20);
        System.out.println(dept);
        return "hello";
    }
}
