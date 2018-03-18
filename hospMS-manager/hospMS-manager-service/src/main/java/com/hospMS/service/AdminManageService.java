package com.hospMS.service;

import com.hospMS.common.pojo.DataTablesResult;
import com.hospMS.common.pojo.HUIDateGridResult;
import com.hospMS.common.pojo.HospMSResult;
import com.hospMS.pojo.Admin;

import java.util.List;

/**
 * Created by Chen on 2018/1/12.
 */
public interface AdminManageService {
    DataTablesResult adminDataTables(int draw,int start,int length);

    HospMSResult deleteAdmins(List<String> list);

    HospMSResult deleteAdminById(int id);

    HospMSResult adminStart(int adminId);

    HospMSResult adminStop(int adminId);

    HospMSResult adminAdd(String adminName,String password,int roleId,int status);

}
