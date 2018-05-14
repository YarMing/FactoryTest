package com.example.service

import com.example.model.User
import org.junit.Assert
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
class UserServiceImplTest  {

    @Autowired
    UserServiceImpl userService

    @Test
    @Ignore
    void testInsertUser() {
        User user = new User()
        user.setUsername("banfu")
        user.setPassword("654321")
        Boolean userTrue = userService.insertUser(user)
        Assert.assertEquals(true,userTrue)
    }

    @Test
    @Ignore
    void testDeleteUserById() {
       Boolean delUserById = userService.deleteUserById(8)
        Assert.assertEquals(true,delUserById)
    }

    @Test
    @Ignore
    void testUpdateUser() {
        User user = new User()
        user.setId(1)
        user.setUsername("yanming")
        user.setPassword("654321")
        Boolean updUser = userService.updateUser(user)
        Assert.assertEquals(true,updUser)
    }

    @Test
    @Ignore
    void testSelectUserById() {
        User userById = userService.selectUserById(1)
        Assert.assertEquals("yanming",userById.getUsername())
    }

    @Test

    void testSelectAllUser() {
        List<User> userList = userService.selectAllUser()
        User user = new User()
        user.setId(1)
        user.setUsername("gefanglun")
        user.setPassword("654321")
        Assert.assertEquals(user.getUsername(),userList.get(1).getUsername())
    }

    @Test

    void testSelectUserByUser() {
        User user = new User()
        user.setUsername("yanming")
        user.setPassword("654321")
        User userByUser = userService.selectUserByUser(user)
        Assert.assertEquals(user.getUsername(),userByUser.getUsername())
        Assert.assertEquals(user.getPassword(),userByUser.getPassword())
    }
}
