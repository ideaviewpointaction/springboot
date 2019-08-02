package com.example.demo.controller;

import com.example.demo.entity.AppSystemProperties;
import com.example.demo.entity.RandomData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConfigurationController {

    @Autowired
    private RandomData randomData;

    @Autowired
    private AppSystemProperties appSystemProperties;

    @GetMapping("config/randomMap")
    public Map<String,Map<String,String>> getRandomMap(){
        return randomData.getMap();
    }

    @GetMapping("config/appSystem")
    public AppSystemProperties getAppSystemProperties(){
        return this.appSystemProperties;
    }
}
