package com.kandoka;

import com.kandoka.entity.User;
import com.kandoka.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EblogBackendApplicationTests {

    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
        User user = userService.getById(1L);
        System.out.println(user.toString());
    }

}

