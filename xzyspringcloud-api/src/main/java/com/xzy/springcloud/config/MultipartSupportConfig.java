package com.xzy.springcloud.config;/**
 * Created by Administrator on 2018-07-05.
 */

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuzhiyong
 * @createDate 2018-07-05-15:35
 */
@Configuration
public class MultipartSupportConfig {
    public Encoder feignFormEncoder(){
        return new SpringFormEncoder();
    }
}
