package com.example.demo.controller;

import com.example.demo.entity.FastJsonTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class FastJsonController {
    @GetMapping("/getFastJson")
    public FastJsonTest getFastJson(){
        FastJsonTest fastJsonTest=new FastJsonTest();
        fastJsonTest.setId(1);
        fastJsonTest.setStr("str111222333");
        fastJsonTest.setDate(new Date());
        fastJsonTest.setIgnore("ignore");
        return fastJsonTest;
    }
}
