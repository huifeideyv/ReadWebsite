package com.rabbit.readwebsite.Dao;

import com.rabbit.readwebsite.POJO.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    @Select("select * from user")
    List<User> findAllUser();
}
