package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private User user;

    @GetMapping("/user")
    public String interrupt(){
        return "我是"+user.getName()+",我"+user.getAge()+user.getCountry()+user.getAddress();
    }

}
