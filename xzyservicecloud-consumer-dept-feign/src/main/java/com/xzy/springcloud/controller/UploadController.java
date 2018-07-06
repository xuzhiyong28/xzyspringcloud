package com.xzy.springcloud.controller;/**
 * Created by Administrator on 2018-07-05.
 */

import com.xzy.springcloud.service.UploadClientService;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author xuzhiyong
 * @createDate 2018-07-05-15:48
 */
@RestController
public class UploadController {
    @Autowired
    private UploadClientService uploadClientService;

    @RequestMapping(value = "/consumer/upload")
    public String handleFileUpload() {
        File file = new File("D:\\nginx.conf");
        DiskFileItem fileItem = (DiskFileItem) new DiskFileItemFactory().createItem("file", MediaType.TEXT_PLAIN_VALUE, true, file.getName());
        try {
            InputStream input = new FileInputStream(file);
            OutputStream os = fileItem.getOutputStream();
            IOUtils.copy(input, os);
        } catch (Exception e) {
            new IllegalArgumentException("Invalid file: " + e, e);
        }
        MultipartFile multipartFile = new CommonsMultipartFile(fileItem);
        try{
            uploadClientService.handleFileUpload(multipartFile);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
