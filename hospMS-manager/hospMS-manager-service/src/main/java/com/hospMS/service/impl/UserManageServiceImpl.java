package com.hospMS.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospMS.common.pojo.HUIDateGridResult;
import com.hospMS.common.pojo.HospMSResult;
import com.hospMS.mapper.*;
import com.hospMS.pojo.*;
import com.hospMS.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManageServiceImpl implements UserManageService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserMapper userMapper;
//    list

    @Override
    public HUIDateGridResult getRolesList(int page, int rows) {
        RoleExample example = new RoleExample();
        PageHelper.startPage(page,rows);
        List<Role> list=roleMapper.selectByExample(example);
        HUIDateGridResult result = new HUIDateGridResult();
        result.setRows(list);
        PageInfo<Role> pageInfo = new PageInfo<Role>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    @Override
    public HUIDateGridResult getUsersList(int page, int rows) {
        UserExample example = new UserExample();
        PageHelper.startPage(page,rows);
        List<User> list=userMapper.selectByExample(example);
        HUIDateGridResult result = new HUIDateGridResult();
        result.setRows(list);
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }


//    delete

    @Override
    public HospMSResult deleteUsers(List<String> list) {
        userMapper.deleteUsers(list);
        return HospMSResult.ok();
    }

/*    @Override
    public HospMSResult deleteRoles(List<String> list) {
        roleMapper.deleteRoles(list);
        return HospMSResult.ok();
    }*/


//    add

    @Override
    public HospMSResult addUser(User user) {
        user.setUserId(0);
        userMapper.insert(user);
        return HospMSResult.ok();
    }

/*    @Override
    public HospMSResult addRole(Role role) {
        role.setRoleId(0);
        roleMapper.insert(role);
        return HospMSResult.ok();
    }*/


//    edit

    @Override
    public HospMSResult editUser(User user) {
        userMapper.updateByPrimaryKey(user);
        return HospMSResult.ok();
    }

/*    @Override
    public HospMSResult editRole(Role role) {
        roleMapper.updateByPrimaryKey(role);
        return HospMSResult.ok();
    }*/


/*
    @Override
    public String getRoleNameById(Integer roleId) {
        String roleName=roleMapper.selectByPrimaryKey(roleId).getRoleName();
        return roleName;
    }

    @Override
    public List<Role> queryRole() {
        RoleExample example = new RoleExample();
        List<Role> queryRole=roleMapper.selectByExample(example);
        return queryRole;
    }

    @Override
    public List<Role> RoleList() {
        RoleExample example = new RoleExample();
        List<Role> roleList=roleMapper.selectByExample(example);
        return roleList;
    }
*/

/*    @Override
    public String queryRole() {
        RoleExample example = new RoleExample();
        List<Role> queryRole=roleMapper.selectByExample(example);
        String string=null;
        for (Role role:queryRole){
            string= JsonUtils.objectToJson(role);
        }
        return string;
    }*/

/*    @Override
    public HashMap<Integer,String> queryRole() {
        RoleExample example = new RoleExample();
        List<Role> queryRole=roleMapper.selectByExample(example);
        HashMap<Integer,String> map=new HashMap<Integer, String>();
        for (Role role:queryRole)
            map.put(role.getRoleId(),role.getRoleName());
        return map;
    }*/
}
