package com.test5.demo;

import com.test5.demo.controller.UserController;
import com.test5.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    UserController userController;
    @Test
    void contextLoads() {
        userController.find().forEach((user) -> {
            System.out.println(String.format("user={id=%s, name=%s, age=%s, mobile=%s, }", user.getId(), user.getName(), user.getAge(), user.getMobile()));
        });
        User user1 = new User(6, "add_1", "233", "233");
        User user2 = new User(7, "add_2", "666", "666");

        userController.add(user1);
        userController.add(user2);
//        userController.del(6);
//        user2 = new User(7, "add_2_edit", "8888888", "8888888");
//        userController.edit(user2);

    }

}
