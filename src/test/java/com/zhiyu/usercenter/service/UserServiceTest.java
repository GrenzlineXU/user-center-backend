package com.zhiyu.usercenter.service;

import com.zhiyu.usercenter.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class UserServiceTest {

    @Resource
    private  UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("dogyu");
        user.setUserAccount("233233233");
        user.setAvatarUrl("https://pic.code-nav.cn/user_avatar/1862093549342486530/thumbnail/J0ON2SQYHTilekyQ.jpg");
        user.setGender(0);
        user.setUserPassword("12345678");
        user.setPhone("123");
        user.setEmail("456");
        user.setGunCode("8");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);

    }
}