package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.User;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * 这里在这里不加component的时候 service会显示报错，不过在项目中并不会报错，
 * 这里的Component可以去掉
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> getUsers();

    Page<User> getUsersForPage();

    User getUserById(Long id);
}
