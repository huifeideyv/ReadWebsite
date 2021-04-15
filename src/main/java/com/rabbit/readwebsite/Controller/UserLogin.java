package com.rabbit.readwebsite.Controller;

import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;

@Controller
@RequestMapping("/user")
public class UserLogin {
@RequestMapping("/login")
    public String login(){
    return "ReadingLogin.html";
}
}
