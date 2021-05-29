package com.mou.springcloud.controller;

import com.mou.springcloud.pojo.Dept;
import com.mou.springcloud.server.DeptServerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptServerDao deptServerDao;

    @PostMapping ("/post/add")
    public boolean addDept(Dept dept){
        return deptServerDao.addDept(dept);
    }
    @GetMapping ("/get/{id}")
    public Dept getDept(@PathVariable("id" )Long id){
        return deptServerDao.queryById(id);
    }
    @GetMapping ("/get/list")
    public List<Dept> getAllDept(){
        return deptServerDao.queryAll();
    }
}
