package com.example.contorller

import com.alibaba.fastjson.JSONArray
import com.alibaba.fastjson.JSONObject
import com.example.model.User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody



@Controller
@RequestMapping("/admin")
class UserHandler {

    @RequestMapping("/insert")
    @ResponseBody
    Object insert(@RequestBody  String params){
        println "测试的"+ params

    }

}
