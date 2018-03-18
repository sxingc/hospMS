package com.hospMS.controller;

import com.hospMS.common.pojo.DataTablesResult;
import com.hospMS.common.pojo.HUIDateGridResult;
import com.hospMS.common.pojo.HospMSResult;
import com.hospMS.pojo.Admin;
import com.hospMS.service.AdminManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chen on 2018/1/12.
 */
@Controller
public class AdminManageControllor {
    @Autowired
    private AdminManageService adminManageService;

    @RequestMapping(value = "/manage/list/adminList" ,method = RequestMethod.POST)
    @ResponseBody
    private DataTablesResult adminDataTables(int draw,int start,int length){
        DataTablesResult result=adminManageService.adminDataTables(draw,start,length);
        return result;
    }

    @RequestMapping(value = "/manage/delete/deleteAdmins" ,method = RequestMethod.POST)
    @ResponseBody
    private HospMSResult deleteAdmins(String ids){
        System.out.println("===========================");
        System.out.println(ids);
        List<String> list = getList(ids);
        HospMSResult result=adminManageService.deleteAdmins(list);
        return result;
    }

    @RequestMapping(value = "/manage/delete/deleteAdminById" ,method = RequestMethod.POST)
    @ResponseBody
    private HospMSResult deleteAdminById(Integer adminId){
        HospMSResult result=adminManageService.deleteAdminById(adminId);
        return result;
    }

    @RequestMapping(value = "/manage/edit/adminStart" ,method = RequestMethod.POST)
    @ResponseBody
    private HospMSResult adminStart(Integer adminId){
        HospMSResult result=adminManageService.adminStart(adminId);
        return result;
    }

    @RequestMapping(value = "/manage/edit/adminStop" ,method = RequestMethod.POST)
    @ResponseBody
    private HospMSResult adminStop(Integer adminId){
        HospMSResult result=adminManageService.adminStop(adminId);
        return result;
    }

    @RequestMapping(value = "/manage/edit/adminAdd" ,method = RequestMethod.GET)
    @ResponseBody
    private Integer adminAdd(String adminName, String password,int roleId){
        HospMSResult result=adminManageService.adminAdd(adminName,password,roleId,0);
        return 0;
    }

    public List<String> getList(String id) {
        List<String> list = new ArrayList<String>();
        String[] str = id.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        return list;
    }


}
