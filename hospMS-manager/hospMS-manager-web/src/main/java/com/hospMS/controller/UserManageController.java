
package com.hospMS.controller;

import com.hospMS.common.pojo.HUIDateGridResult;
import com.hospMS.common.pojo.HospMSResult;
import com.hospMS.pojo.*;
import com.hospMS.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

 /*Created by Chen on 2017/10/16.*/


@Controller
@RequestMapping("/manage/")
public class UserManageController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private UserManageService userManageService;


    @RequestMapping("/list/userList")
    @ResponseBody
    private HUIDateGridResult getUserList(int page, int rows){
        HUIDateGridResult result= userManageService.getUsersList(page,rows);
        return result;
    }

    @RequestMapping("/list/roleList")
    @ResponseBody
    private HUIDateGridResult getRoleList(int page, int rows){
        HUIDateGridResult result= userManageService.getRolesList(page,rows);
        return result;
    }


    @RequestMapping(value="/delete/deleteUser/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
    public HospMSResult deleteUserById(@PathVariable("ids") String ids) {
        List<String> list = getList(ids);
        HospMSResult result= userManageService.deleteUsers(list);
        return result;
    }

/*    @RequestMapping(value="/delete/deleteRole/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
    public HospMSResult deleteRoleById(@PathVariable("ids") String ids) {
        List<String> list = getList(ids);
        HospMSResult result= userManageService.deleteRoles(list);
        return result;
    }*/



    @RequestMapping(value="/add/addUser/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult addUser(User user){
        HospMSResult result = userManageService.addUser(user);
        return result;
    }

/*    @RequestMapping(value="/add/addRole/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult addRole(Role role){
        HospMSResult result = userManageService.addRole(role);
        return result;
    }*/




    @RequestMapping(value="/edit/editUser/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult editUser(User user){
        HospMSResult result = userManageService.editUser(user);
        return result;
    }

/*    @RequestMapping(value="/edit/editRole/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult editRole(Role role){
        HospMSResult result = userManageService.editRole(role);
        return result;
    }*/

 

    public List<String> getList(String id) {
        List<String> list = new ArrayList<String>();
        String[] str = id.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        return list;
    }

/*    @RequestMapping(value = "/query/queryRole",method = RequestMethod.GET)
    @ResponseBody
    public HashMap<Integer,String> queryRole(){

        HashMap<Integer,String> map=userManageService.queryRole();
        return map;
    }*/

/*    @RequestMapping(value = "/query/queryRole",method = RequestMethod.GET)
    @ResponseBody
    public List<Role> queryRole(){
        List<Role>  queryRole=userManageService.queryRole();
        return queryRole;
    }
    */
}