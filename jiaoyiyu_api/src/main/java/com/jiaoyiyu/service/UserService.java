package com.jiaoyiyu.service;

import com.jiaoyiyu.bean.User;

public interface UserService {
    User checkUser(String username, String password);
}
