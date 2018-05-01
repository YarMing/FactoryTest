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

        String message = userServiceImpl.insertUser()
        println message
        return "insert"
    }


    //按用户名密码查询用户实现登录
    @RequestMapping("/selectUser")
    Object selectUserByUser(User user){
        Object message = userServiceImpl.selectUserByUser(user)

        if(message.getClass().getName()=="com.example.model.User") {
            def username = message.getUsername()
            def password = message.getPassword()
            String username1 = user.username
            String password1 = user.password

            if (password1==password&&username1==username)
            return "homepage"
            else
                return "error"

        }else {

            println message
                return "error"
        }

    }

}
