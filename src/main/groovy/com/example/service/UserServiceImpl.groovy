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
