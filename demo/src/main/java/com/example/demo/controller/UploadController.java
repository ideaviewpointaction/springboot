package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/upload")
    public String upload() {
        return "upload";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file){
        if(file.isEmpty()){
            return "文件为空";
        }
        String filename = file.getOriginalFilename();
        String localPath="/home/liumao/testUpload";
        String filePathStr=localPath+filename;
        File filePath = new File(filePathStr);
        try {
            file.transferTo(filePath);
            return "上传文件成功";
        } catch (IOException e) {
            logger.error("文件上传失败");
            return "文件上传失败";
        }
    }

}
