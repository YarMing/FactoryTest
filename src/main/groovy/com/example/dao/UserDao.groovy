package com.example.dao

import com.example.model.User

interface UserDao {
    int insertUser(User user)
    int deleteUserById(int id)
    int updateUser(User user)
    User selectUserById(int id)
    List<User> selectAllUser()
    User selectUserByUser(User user)
}