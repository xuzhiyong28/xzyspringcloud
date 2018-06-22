package com.xzy.springcloud;/**
 * Created by Administrator on 2018-05-22.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xuzhiyong
 * @createDate 2018-05-22-19:59
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_App {
    public static void main(String[] agrs){
        SpringApplication.run(DeptConsumer80_App.class,agrs);
    }
}
