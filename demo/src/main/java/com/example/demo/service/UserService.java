package com.example.demo.service;

import com.example.demo.entity.User;
import com.github.pagehelper.Page;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    Page<User> getUsersForPage();

    User getUserById(Long id);

    void evictUser(Long userId);
}
