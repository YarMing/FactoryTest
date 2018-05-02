package com.example.service

import com.example.dao.UserDao
import com.example.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao

    //插入用户业务
    @Override
    Boolean insertUser(User user) {
        if(user.getUsername()!=null&& !"".equals(user.getUsername())){
            try {
                int addUser = userDao.insertUser(user)
                if (addUser>0){
                    return true
                }else {
                    throw RuntimeException("插入用户失败！")
                }
            }catch (Exception e)
            {
                throw RuntimeException ("插入用户失败！"+e.getMessage())
            }

        }else {
            throw new RuntimeException("用户名不能为空！")
        }

    }

    @Override
    Boolean deleteUserById(int id) {
        if (id!=0){
            try {
                int delUserById = userDao.deleteUserById(id)
                if (delUserById!=0){
                    return true
                }else
                {
                    throw RuntimeException("用户查询失败！")
                }
            }catch (Exception e){
                throw RuntimeException("用户查询失败！"+e.getMessage())
            }


    }else {
        throw RuntimeException("用户编号不能为空！")
    }

    }

    @Override
    Boolean updateUser(User user) {
        if (user.getUsername()!=null&&!"".equals(user.getUsername()&&user.getPassword()!=null&&!"".equals(user.getPassword())))
        {
            try {
                int updUser = userDao.updateUser(user)
                if (updUser!=null){
                    return true
                }else {
                    throw RuntimeException("用户修改失败！")
                }
            }catch (Exception e){
                throw RuntimeException("用户修改失败！"+e.getMessage())
            }


        }else {
            throw RuntimeException("用户名或密码不能为空！")
        }
    }

    @Override
    User selectUserById(int id) {
        if (id!=0){
            try {
                User userById = userDao.selectUserById(id)
                if (userById!=null){
                    return userById
                }else
                {
                    throw RuntimeException("用户查询失败！")
                }
            }catch (Exception e){
                throw RuntimeException("用户查询失败！"+e.getMessage())
            }

        }else {
            throw RuntimeException("用户编号不能为空！")
        }
    }

    @Override
    List<User> selectAllUser() {
        try {
            List<User> userList = userDao.selectAllUser()
            if (userList!=null){
                return userList
            }else {
                throw RuntimeException("查询用户信息失败！")
            }
        }catch (Exception e){
            throw RuntimeException("查询用户信息失败！"+e.getMessage())
        }

        return
    }

    @Override
    User selectUserByUser(User user) {
        if(user.getUsername()!=null&&!"".equals(user.getUsername()&&user.getPassword()!=null&&!"".equals(user.getPassword())))
        {
            try {
                User userByUser = userDao.selectUserByUser(user)
                if (userByUser!=null){
                    return userByUser
                }else {
                    throw RuntimeException("查询用户失败！")
                }


            }catch (Exception e){
                throw RuntimeException("查询用户失败！"+e.getMessage())
            }


        }else {
            throw RuntimeException("用户名和密码不能为空")
        }
    }
}
