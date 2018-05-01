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
    String insertUser(User user) {

        String message = ""

        int i = userDao.insertUser(user)
        if (i>0)
            message = "插入成功"
        else
            message = "插入失败"
        return message
    }

    @Override
    int deleteUserById(int id) {
        return 0
    }

    @Override
    int updateUser(User user) {
        return 0
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
