package com.xzy.springcloud.config;/**
 * Created by Administrator on 2018-05-23.
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuzhiyong
 * @createDate 2018-05-23-16:25
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //springCloud Ribbon是基于NetFlix Ribbon实现的一套客户端 负载均衡的工具
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean //采用Ribbon的随机算法
    public IRule myRule(){
        return new RandomRule();
    }
}
