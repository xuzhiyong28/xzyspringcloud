package com.xzy.springcloud;/**
 * Created by Administrator on 2018-05-27.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author xuzhiyong
 * @createDate 2018-05-27-10:27
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {
    public static void main(String[] args){
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }
}
