package com.test5.demo.controller;
import com.test5.demo.entity.User;
import com.test5.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Component
@Controller
@RestController
@RequestMapping("/stu")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("del")
    public String del(Integer id){
        userService.del(id);
        return "user/jump";
    }

    @RequestMapping("edit")
    public String edit(User user){
        userService.edit(user);
        return "user/jump";
    }

//    @RequestMapping("add")
//    public String add(User user){
//        userService.add(user);
//        return "user/jump";
//    }

    @RequestMapping("add")
    public String add(){
        User user3 = new User(6, "Make",16,123);
        userService.add(user3);
        return "user/jump";
    }


    @RequestMapping("find")
    public List<User> find(){
        return userService.find();
    }


//    @PostMapping
//    public String addUser(@RequestBody User user){
//        userService.addUser(user);
//        return "success";
//    }
//    @PutMapping
//    public String updateUser(@RequestBody User user){
//        userService.updateUser(user);
//        return "success";
//    }
//    @GetMapping("/{id}")
//    public String getUserById(@RequestBody User user){
//        userService.updateUser(user);
//        return "success";
//    }


////    @PostMapping("/save")
//    public Integer save(@RequestBody User entity){
//        return UserService.save(entity);
//    }

}
