package com.xzy.springcloud.config;/**
 * Created by Administrator on 2018-05-26.
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuzhiyong
 * @createDate 2018-05-26-11:14
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced ////Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
