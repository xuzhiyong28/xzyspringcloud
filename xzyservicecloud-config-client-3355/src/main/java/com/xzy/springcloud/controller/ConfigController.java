package com.xzy.springcloud.controller;/**
 * Created by Administrator on 2018-07-06.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuzhiyong
 * @createDate 2018-07-06-10:12
 */
@RestController
/***
 * 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中
 * 在web中执行 http://localhost:port/refresh就能实现自动刷新配置
 */
@RefreshScope
public class ConfigController {
    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String form(){
        return this.hello;
    }
}
