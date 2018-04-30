package com.example.contorller

import com.example.model.User
import com.example.service.UserServiceImp
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("/admin")
class AdminHandler {

    @Autowired
    UserServiceImp userServiceImp


    //实现登录
    @RequestMapping("/selectUser")
    Object selectUserByUser(User user){
        Object message = userServiceImp.selectUserByUser(user)

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
    //模拟工厂模式实现
    @RequestMapping("/insert")
    Object insertUser(User user){

        String message = userServiceImp.insertUser(user)
        println message
        return "insert"
    }
}
