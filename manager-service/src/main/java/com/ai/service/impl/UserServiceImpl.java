package com.ai.service.impl;

import com.ai.mapper.UsersMapper;
import com.ai.pojo.Users;
import com.ai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper;

    public void addUser(Users user) {
        this.usersMapper.insertUser(user);
    }
}
