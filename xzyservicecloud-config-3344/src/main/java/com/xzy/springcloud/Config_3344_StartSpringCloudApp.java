package com.xzy.springcloud;/**
 * Created by Administrator on 2018-07-06.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author xuzhiyong
 * @createDate 2018-07-06-9:04
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {
    public static void main(String agrs[]){
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,agrs);
    }
}
