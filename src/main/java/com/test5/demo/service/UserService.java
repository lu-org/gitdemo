package com.test5.demo.service;

import com.test5.demo.entity.User;

import java.util.List;

public interface UserService {
//    public List<User> findAll;
    List<User> find();
    void add(User user);
    void del(Integer id);
    void edit(User user);


//    List<User> find();
}
