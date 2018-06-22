package com.xzy.springcloud.service;/**
 * Created by Administrator on 2018-05-26.
 */

import com.xzy.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xuzhiyong
 * @createDate 2018-05-26-13:13
 * 定义熔断机制，可以统一在一个接口上使用
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                //这些同理
                return false;
            }

            @Override
            public Dept findById(Long id) {
                return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> findAll() {
                return null;
            }
        };
    }
}
