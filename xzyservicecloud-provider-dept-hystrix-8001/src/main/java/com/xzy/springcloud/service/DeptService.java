package com.xzy.springcloud.service;

import com.xzy.springcloud.entities.Dept;

import java.util.List;

/**
 * Created by Administrator on 2018-05-22.
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
