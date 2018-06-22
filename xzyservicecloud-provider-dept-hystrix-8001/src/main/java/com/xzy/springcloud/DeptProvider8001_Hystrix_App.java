package com.xzy.springcloud;/**
 * Created by Administrator on 2018-05-26.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xuzhiyong
 * @createDate 2018-05-26-12:55
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注入到eurek服务中
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker //对hystrix熔断器的支持
public class DeptProvider8001_Hystrix_App {
    public static void main(String agrs[]){
        SpringApplication.run(DeptProvider8001_Hystrix_App.class,agrs);
    }
}
