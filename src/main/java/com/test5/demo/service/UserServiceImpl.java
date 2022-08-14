package com.test5.demo.service;

import com.test5.demo.entity.User;
import com.test5.demo.mapper.Usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private Usermapper usermapper;

    @Override
    public void add(User user) {
        usermapper.add(user);

    }

    @Override
    public void del(Integer id) {
        usermapper.del(id);

    }

    @Override
    public void edit(User user) {
        usermapper.edit(user);
        }

//    @Override
    public List<User> find(){
        return usermapper.find();

    }
}
