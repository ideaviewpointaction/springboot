package com.example.demo.controller;

import com.example.demo.entity.MyOrderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MyOrderConfigController
 * @Description
 * @Author gehui
 * @Date 2019/7/11 7:03
 * @Version
 **/
@RestController
public class MyOrderConfigController {

    @Autowired
    private MyOrderConfig myOrderConfig;

    @GetMapping("/myOrderTest")
    public MyOrderConfig getMyOrderConfig(){
        return myOrderConfig;
    }
}
