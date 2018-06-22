package com.xzy.springcloud;/**
 * Created by Administrator on 2018-05-26.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xuzhiyong
 * @createDate 2018-05-26-10:57
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.xzy.springcloud")
@ComponentScan("com.xzy.springcloud")
public class DeptConsumer80_Feign_App {
    public static void main(String[] agrs){
        SpringApplication.run(DeptConsumer80_Feign_App.class,agrs);
    }
}
