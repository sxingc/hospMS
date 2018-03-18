package com.hospMS.service;

import com.hospMS.common.pojo.HUIDateGridResult;
import com.hospMS.common.pojo.HospMSResult;
import com.hospMS.pojo.*;

import java.util.List;

/**
 * Created by Chen on 2017/12/26.
 */
public interface UserManageService {
    HUIDateGridResult getRolesList(int page, int rows);

    HUIDateGridResult getUsersList(int page, int rows);


    HospMSResult deleteUsers(List<String> list);

//    HospMSResult deleteRoles(List<String> list);


    HospMSResult addUser(User user);

//    HospMSResult addRole(Role role);


    HospMSResult editUser(User user);

//    HospMSResult editRole(Role role);

//    String getRoleNameById(Integer roleId);

//    HashMap<Integer,String> queryRole();
//    String queryRole();
//    List<Role> queryRole();

//    List<Role> RoleList();

}
