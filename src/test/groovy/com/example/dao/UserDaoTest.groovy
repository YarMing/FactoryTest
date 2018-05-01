package com.example.dao

import com.example.model.User
import org.junit.Assert
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
class UserDaoTest{

    @Autowired
    UserDao userDao

    @Test
    @Ignore
    void testInsertUser() {
        User user = new User()
        user.setUsername("fanyiguan")
        user.setPassword("654321")
        int addUser = userDao.insertUser(user)
        Assert.assertEquals(1,addUser)

    }

    @Test
    @Ignore
    void testDeleteUserById() {
        int delUser = userDao.deleteUserById(12)
        Assert.assertEquals(1,delUser)

    }

    @Test
    @Ignore
    void testUpdateUser() {
        User user = new User()
        user.setId(2)
        user.setUsername("caoyunrui")
        user.setPassword("123456")
        int updUser = userDao.updateUser(user)
        Assert.assertEquals(1,updUser)
    }

    @Test
    @Ignore
    void testSelectUserById() {
      User user  = userDao.selectUserById(1)
        Assert.assertEquals("yanming", user.getUsername())
    }

    @Test
    @Ignore
    void testSelectAllUser() {
        List<User> userList = userDao.selectAllUser()
        Assert.assertEquals(6,userList.size())
    }

    @Test
    @Ignore
    void testSelectUserByUser() {
        User user = new User()
        user.setUsername("yanming")
        user.setPassword("654321")
        User seleuser = userDao.selectUserByUser(user)
        Assert.assertEquals("yanming",seleuser.getUsername())
    }
}
