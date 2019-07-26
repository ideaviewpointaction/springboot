package com.example.demo.serviceImp;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImp implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    @Override
    public Page<User> getUsersForPage() {
        return userMapper.getUsersForPage();
    }

    @Override
//    @Cacheable(cacheNames = "users",key="#id")
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
