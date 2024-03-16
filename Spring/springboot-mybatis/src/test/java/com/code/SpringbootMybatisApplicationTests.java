package com.code;

import com.code.mapper.UserMapper;
import com.code.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testListUser() {
        List<User> userList = userMapper.list();
        userList.forEach(System.out::println);
    }
}
