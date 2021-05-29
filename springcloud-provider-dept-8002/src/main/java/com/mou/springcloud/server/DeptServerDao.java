package com.mou.springcloud.server;

import com.mou.springcloud.pojo.Dept;

import java.util.List;

public interface DeptServerDao {
    public boolean addDept(Dept dept);
    public Dept queryById(Long id);
    public List<Dept> queryAll();
}
