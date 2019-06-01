package com.ai.mapper;

import com.ai.pojo.Users;

import java.util.List;

public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
