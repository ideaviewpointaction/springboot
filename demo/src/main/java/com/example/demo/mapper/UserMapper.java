package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 这里在这里不加component的时候 service会显示报错，不过在项目中并不会报错，
 * 这里的Component可以去掉
 */
//@Component(value="userMapper")
public interface UserMapper {

    List<User> getUsers();

    Page<User> getUsersForPage();
}
