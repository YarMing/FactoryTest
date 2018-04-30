package com.example.service

import com.example.model.User

interface UserService {
    String insertUser(User user)
    int deleteUserById(int id)
    int updateUser(User user)
    User selectUserById(int id)
    List<User> selectAllUser()
    Object selectUserByUser(User user)
}