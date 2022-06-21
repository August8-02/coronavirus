package com.sanley.coronavirus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//登录页面
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String tologin(){
        return "login";
    }
}
