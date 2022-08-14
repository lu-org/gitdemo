package com.test5.demo.mapper;
import org.apache.ibatis.annotations.*;
import com.test5.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface Usermapper {
    //通过用户名密码查询用户数据
//    User getByUserNameAndPassword(User user);
//    @Select("select * from user") //查询所有数据
    List<User> find();
//    @Insert("INSERT INTO student (id,name,age,mobile)VALUES(#{id},#{name},#{age},#{mobile});")
//    @Insert("INSERT INTO user (name,age,mobile)VALUES(#{name},#{age},#{mobile});")
//    void add(User user);
//    @Delete("DELETE FROM user WHERE id=#{id}")
//    void del(Integer id);
//    @Update("UPDATE user SET name=#{name},age=#{age},mobile=#{mobile} where id=#{id}")
//    void edit(User user);

    @Insert("INSERT INTO user (name,age,mobile)VALUES(#{name},#{age},#{mobile});")
    void add(User user);
    @Delete("DELETE FROM user WHERE id=#{id}")
    void del(Integer id);
    @Update("UPDATE user SET name=#{name},age=#{age},mobile=#{mobile} where id=#{id}")
    void edit(User user);




//    @Result(column = {
//            @Result(property = "id", column = "id"),
//            @Result(property = "name", column = "name"),
//            @Result(property = "age", column = "age"),
//            @Result(property = "mobile", column = "mobile"),})
//    public List<User> queryList();

//    List<User> findAll();
//    public List<User> selectAll();  //全查学生信息

//    void addUser(User user);
//    @Transactional
//    void updateUserById(User user);

//    @Insert("INSERT into demo (name,age,mobile)VALUES(#{name},#{age},#{mobile})")
//    static Integer save(User entity) {
//        return null;
//    }
//
//    static Integer update(User entity) {
//        return null;
//    }
}
