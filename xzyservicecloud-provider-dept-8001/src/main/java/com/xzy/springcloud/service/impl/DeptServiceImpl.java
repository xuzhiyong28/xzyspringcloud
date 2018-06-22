package com.xzy.springcloud.service.impl;/**
 * Created by Administrator on 2018-05-22.
 */

import com.xzy.springcloud.dao.DeptDao;
import com.xzy.springcloud.entities.Dept;
import com.xzy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuzhiyong
 * @createDate 2018-05-22-18:45
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
