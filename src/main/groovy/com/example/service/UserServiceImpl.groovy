package com.example.service

import com.example.dao.UserDao
import com.example.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao

    @Override
    Boolean insertUser(User user) {

       return true
    }

    @Override
    Boolean deleteUserById(int id) {
        return true
    }

    @Override
    Boolean updateUser(User user) {
        return true
    }

    @Override
    User selectUserById(int id) {
        return null
    }

    @Override
    List<User> selectAllUser() {
        return null
    }

    @Override
    Object selectUserByUser(User user) {
        String message = ""
        User user1 = userDao.selectUserByUser(user)
        if (user1!=null) {
            message = "查询成功"
            println message
            return user1
        }
        else {
            message = "查询失败"
            println message
            return message
        }
    }
}
