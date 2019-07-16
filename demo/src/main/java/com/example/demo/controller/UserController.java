package com.example.demo.controller;

import com.example.demo.entity.TestUser;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private TestUser testUser;
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String interrupt() {
        return "我是" + testUser.getName() + ",我" + testUser.getAge() + testUser.getCountry() + testUser.getAddress();
    }

    @GetMapping("/users")
    public List<User> getUsers(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        //注意PageHelper.startPage(pageNo,pageSize)只对其后的第一个查询管用，第二个查询将不会产生分页
        PageHelper.startPage(pageNo,pageSize);
        return userService.getUsers();
//        return userService.getUsers();
    }

    @GetMapping("/usersForPage")
    public PageInfo<User> getUsersForPage(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        //注意PageHelper.startPage(pageNo,pageSize)只对其后的第一个查询管用，第二个查询将不会产生分页
        PageHelper.startPage(pageNo,pageSize);
        Page<User> page= userService.getUsersForPage();
        return new PageInfo<>(page);
//        return userService.getUsers();
    }

}
