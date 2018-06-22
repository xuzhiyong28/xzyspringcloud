
package com.xzy.springcloud.service;

import com.xzy.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2018-05-26.
 */
@FeignClient(value = "XZYSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/add" , method = RequestMethod.GET)
    public boolean addDept(Dept dept);


    @RequestMapping(value = "/dept/get/{id}" , method = RequestMethod.GET)
    public Dept findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list" , method = RequestMethod.GET)
    public List<Dept> findAll();
}
