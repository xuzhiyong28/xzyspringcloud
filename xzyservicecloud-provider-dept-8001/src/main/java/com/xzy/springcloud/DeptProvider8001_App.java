package com.xzy.springcloud;/**
 * Created by Administrator on 2018-05-22.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xuzhiyong
 * @createDate 2018-05-22-17:27
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class DeptProvider8001_App {
    public static void main(String[] agrs){
        SpringApplication.run(DeptProvider8001_App.class,agrs);
    }
}
