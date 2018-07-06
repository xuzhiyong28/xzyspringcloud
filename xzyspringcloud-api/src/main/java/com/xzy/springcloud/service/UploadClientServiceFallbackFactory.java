package com.xzy.springcloud.service;/**
 * Created by Administrator on 2018-07-05.
 */

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xuzhiyong
 * @createDate 2018-07-05-15:49
 */
@Component
public class UploadClientServiceFallbackFactory implements FallbackFactory<UploadClientService> {
    @Override
    public UploadClientService create(Throwable throwable) {
        return new UploadClientService() {
            @Override
            public String handleFileUpload(MultipartFile file) {
                return "====handleFileUpload处理失败====";
            }
        };
    }
}
