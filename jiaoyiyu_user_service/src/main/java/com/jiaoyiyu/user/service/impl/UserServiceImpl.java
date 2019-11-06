package com.jiaoyiyu.user.service.impl;

import com.jiaoyiyu.bean.User;
import com.jiaoyiyu.service.UserService;
import com.jiaoyiyu.user.mapper.UserMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User checkUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return (User) userMapper.selectOne(user);
    }
}
