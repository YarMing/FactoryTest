package com.example.service

import com.example.model.User

interface UserService {
    Boolean insertUser(User user)
    Boolean deleteUserById(int id)
    Boolean updateUser(User user)
    User selectUserById(int id)
    List<User> selectAllUser()
    Object selectUserByUser(User user)
}