package com.xzy.springcloud.controller;/**
 * Created by Administrator on 2018-07-05.
 */

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xuzhiyong
 * @createDate 2018-07-05-15:24
 */
@RestController
public class UploadController {

    @PostMapping(value = "/upload/uploadFile" , consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(@RequestPart(value = "file") MultipartFile file){
        return file.getName();
    }
}
