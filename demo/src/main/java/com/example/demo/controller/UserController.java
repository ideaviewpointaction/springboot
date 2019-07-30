package com.example.demo.controller;

import com.example.demo.entity.TestUser;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
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
        PageHelper.startPage(pageNo, pageSize);
        return userService.getUsers();
//        return userService.getUsers();
    }

    @GetMapping("/usersForPage")
    public PageInfo<User> getUsersForPage(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        //注意PageHelper.startPage(pageNo,pageSize)只对其后的第一个查询管用，第二个查询将不会产生分页
        PageHelper.startPage(pageNo, pageSize);
        Page<User> page = userService.getUsersForPage();
        return new PageInfo<>(page);
//        return userService.getUsers();
    }

    @GetMapping("user/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        logger.info(String.valueOf(id));
        return userService.getUserById(id);
//        return new User("123","刘茂",18);
    }

    @GetMapping(value = "del/{id}", produces = {"application/json;charset=UTF-8"})
    public String delUserById(@PathVariable("id") Long id) {
        userService.evictUser(id);
        return "你好呀";
    }

}
