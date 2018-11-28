package com.neusoft.service;

import com.neusoft.domain.Dept;
import com.neusoft.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/11/28.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    DeptMapper deptMapper;

    @Override
    public Dept getDeptByID(int id) {
        return deptMapper.getDeptByID(id);
    }
}
