package com.example.contorller


import com.example.model.User
import com.example.service.UserServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody



@Controller
@RequestMapping(value = "/admin")
class UserHandler {


    @Autowired
    UserServiceImpl userService



    HashMap<Object,User> map = new HashMap<Object,User>()

    //工具
    @Autowired
    void mapUser(){
        List<User> userList=userService.selectAllUser()

        for(int i =0;i<userList.size();i++){
            map.put(i, userList.get(i))
        }

    }




    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    Object insert(User user){

//        List<User> userList=userService.selectAllUser()
//        HashMap<Object,User> map = new HashMap<Object,User>()
//        for(int i =0;i<userList.size();i++){
//            map.put(i, userList.get(i))
//        }


        int k=1

        for (int j =0;j<map.size();j++){
            if (user.getUsername()==map.get(j).getUsername())
            {
                return map.get(j)
                k=0
            }
        }
        if (k==1){
            return "null"
        }








    }

}
