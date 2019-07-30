package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotBuild {

    @GetMapping("/nihao")
    public String hotBUildTest() {
        return "nihao";
    }

}
