package com.example.contorller

import com.example.model.User
import com.example.service.UserServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("/admin")
class AdminHandler {

    @Autowired
    UserServiceImpl userServiceImpl


    //插入用户
    @RequestMapping("/insert")
    Object insertUser(){

    }


    //按用户名密码查询用户实现登录
    @RequestMapping("/selectUser")
    Object selectUserByUser(User user){


    }

}
