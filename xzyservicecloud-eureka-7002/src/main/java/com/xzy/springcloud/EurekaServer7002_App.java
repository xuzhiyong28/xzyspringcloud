package com.xzy.springcloud;/**
 * Created by Administrator on 2018-05-26.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xuzhiyong
 * @createDate 2018-05-26-9:42
 */
@SpringBootApplication
@EnableEurekaServer //EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7002_App {
    public static void main(String args[]){
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
