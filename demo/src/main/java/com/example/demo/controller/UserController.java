package com.example.demo.controller;

import com.example.demo.entity.TestUser;
import com.example.demo.entity.User;
import com.example.demo.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private TestUser testUser;
    @Autowired
    private UserServiceImp userService;

    @GetMapping("/user")
    public String interrupt() {
        return "我是" + testUser.getName() + ",我" + testUser.getAge() + testUser.getCountry() + testUser.getAddress();
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

}
