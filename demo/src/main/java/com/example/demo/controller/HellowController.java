package com.example.demo.controller;

//import ch.qos.logback.classic.Logger;

import com.example.demo.entity.RandomData;
import com.example.demo.serviceImp.TestLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@ConfigurationProperties(prefix = "liumao")
public class HellowController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TestLog testLog;

    @Autowired
    private RandomData randomData;

    @Value("${pocket.name}")
    private String name;

    @Value("${pocket.age}")
    private Integer age;

//    @Value("${pocket.country}")
//    private String country;

    @Value("${pocket.address}")
    private String address_liumao;

    public String getAage() {
        return aage;
    }

    public void setAage(String aage) {
        this.aage = aage;
    }

    private String aage;

    @GetMapping("/hellow")
    public String hellow() {
        String str = "hellow, my name is" + name + ",I'm" + age + ". I live in " + address_liumao+"country="+aage;
//       String str="random="+randomValue;
        testLog.hellow();
        logger.info(str);
        return str;
    }

    @GetMapping("/hellow2")
    public RandomData hellow2() {
       return this.randomData;
    }

    @GetMapping("/hellow3")
    public Map<String, String> hellow3() {
//        return randomData.getMap();
        return null;
    }


}
