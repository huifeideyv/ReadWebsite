package com.rabbit.readwebsite.Controller;

import com.rabbit.readwebsite.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;

@Controller
@RequestMapping("/user")
public class UserLogin {
    @Autowired
    UserDao userDao;
@RequestMapping("/login")
    public String login(){
    System.out.println(userDao.findAllUser());
    return "ReadingLogin.html";
}
}
