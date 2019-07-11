package com.example.demo.controller;

//import ch.qos.logback.classic.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${pocket.name}")
    private String name;

    @Value("${pocket.age}")
    private Integer age;

    @Value("${pocket.country}")
    private String country;

    @Value("${pocket.address}")
    private String address_liumao;

    @GetMapping("/hellow")
    public String hellow(){
        String str="hellow, my name is"+name+",I'm"+age+". I live in "+address_liumao;

        logger.info(str);
        return str;
    }





}
