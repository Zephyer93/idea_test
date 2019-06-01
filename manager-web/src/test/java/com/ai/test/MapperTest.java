package com.ai.test;

import com.ai.mapper.UsersMapper;
import com.ai.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class MapperTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUsers(){
        Users user = new Users();
        user.setUsername("张三");
        user.setUserage(34);
        this.usersMapper.insertUser(user);
    }
}
