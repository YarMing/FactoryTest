package com.example.contorller

import com.alibaba.fastjson.JSONObject
import com.example.model.User
import com.example.service.UserServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import javax.servlet.http.HttpServletRequest


@Controller
@RequestMapping(value = "/admin")
class UserHandler {

    @Autowired
    UserServiceImpl userService

    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    Object insert(HttpServletRequest request){
        String params = request.getParameter("name")
        User user =JSONObject.parseObject(params,User.class)
        User userSelect=userService.selectUserByUser(user)

        return userSelect


    }

}
