package com.xzy.springcloud.controller;/**
 * Created by Administrator on 2018-05-23.
 */

import com.xzy.springcloud.entities.Dept;
import com.xzy.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xuzhiyong
 * @createDate 2018-05-23-16:26
 */
@RestController
public class DeptController {
    @Autowired
    private DeptClientService deptClientService;
    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return this.deptClientService.addDept(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptClientService.findById(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return this.deptClientService.findAll();
    }


}
