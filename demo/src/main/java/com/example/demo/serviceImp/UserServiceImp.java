package com.example.demo.serviceImp;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.github.pagehelper.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImp implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

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
    @Cacheable(cacheNames = "users", key = "#id")
    public User getUserById(Long id) {
        logger.info("我调用数据库啦");
//        return userMapper.getUserById(id);
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    @CacheEvict(value = "users", key = "#id")
    public void evictUser(Long id) {
        logger.info("我把{}删除啦", id);
    }
}
