package com.hospMS.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospMS.common.pojo.DataTablesResult;
import com.hospMS.common.pojo.HospMSResult;
import com.hospMS.mapper.AdminMapper;
import com.hospMS.mapper.RoleMapper;
import com.hospMS.pojo.Admin;
import com.hospMS.pojo.AdminExample;
import com.hospMS.service.AdminManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Chen on 2018/1/12.
 */
@Service
public class AdminManageServiceImpl implements AdminManageService {
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private RoleMapper roleMapper;

    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public DataTablesResult adminDataTables(int draw, int start, int length) {
        Integer page_num=(start/length)+1;
        PageHelper.startPage(page_num,length);
        AdminExample example=new AdminExample();
        List<Admin> list=adminMapper.selectByExample(example);
        for (Admin admin:list){
            admin.setRoleName(roleMapper.selectByPrimaryKey(admin.getRoleId()).getRoleName());
            admin.setShowAdminAddTime(simpleDateFormat.format(admin.getAdminAddTime()));
        }
        PageInfo<Admin> pageInfo = new PageInfo<Admin>(list);
        int recordsTotal=(int) pageInfo.getTotal();
        DataTablesResult result=new DataTablesResult(draw,recordsTotal,recordsTotal,pageInfo.getList());
        return result;
    }

    @Override
    public HospMSResult deleteAdmins(List<String> list) {
        adminMapper.deleteAdmins(list);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult deleteAdminById(int id) {
        adminMapper.deleteByPrimaryKey(id);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult adminStart(int adminId) {
        Admin admin= adminMapper.selectByPrimaryKey(adminId);
        int status=admin.getAdminStatus();
        if (status!=0){
            admin.setAdminStatus(0);
            adminMapper.updateByPrimaryKey(admin);
            System.out.println(adminMapper.selectByPrimaryKey(adminId).getAdminStatus());
            return HospMSResult.ok();
        }else {
            return HospMSResult.format("yiqiyong");
        }

    }

    @Override
    public HospMSResult adminStop(int adminId) {
        Admin admin= adminMapper.selectByPrimaryKey(adminId);
        int status=admin.getAdminStatus();
        if(status!=1){
            admin.setAdminStatus(1);
            adminMapper.updateByPrimaryKey(admin);
            return HospMSResult.ok();

        }else{
            return HospMSResult.format("yijinyong");
        }
    }

    @Override
    public HospMSResult adminAdd(String adminName, String password,int roleId, int status) {
//        if (adminId!=0){
//            Admin admin=new Admin(adminId,adminName,password,roleId,status);
//            adminMapper.updateByPrimaryKey(admin);
//            return HospMSResult.ok();
//        } else {
            Admin admin=new Admin(0,adminName,password,roleId,new Date(),0);
            adminMapper.insert(admin);
            return HospMSResult.ok();
//        }
    }
}
