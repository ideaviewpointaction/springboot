package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RandomDataController {


    @GetMapping("getRandomData")
    public Map<String, String> getRandomData(){
        return new HashMap<>();
    }
}
