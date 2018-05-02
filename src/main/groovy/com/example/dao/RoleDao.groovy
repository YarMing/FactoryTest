package com.example.dao

import com.example.model.Role

interface RoleDao {
    int insertRole(Role user)
    int deleteRoleById(int id)
    int updateRole(Role user)
    Role selectRoleById(int id)
    List<Role> selectAllRole()
    Role selectUserByRole(Role user)

}