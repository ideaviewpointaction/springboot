package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value="userMapper")
public interface UserMapper {

    List<User> getUsers();
}
