package com.xzy.springcloud.service;

import com.xzy.springcloud.config.MultipartSupportConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2018-07-05.
 * Feign的文件上传
 */
@FeignClient(value = "XZYSERVICECLOUD-DEPT",configuration = MultipartSupportConfig.class,fallbackFactory = UploadClientServiceFallbackFactory.class)
public interface UploadClientService {
    @PostMapping(value = "/upload/uploadFile" , consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String handleFileUpload(@RequestPart(value = "file") MultipartFile file);
}
