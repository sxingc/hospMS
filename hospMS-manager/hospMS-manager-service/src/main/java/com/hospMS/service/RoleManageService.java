package com.hospMS.service;

import com.hospMS.common.pojo.DataTablesResult;

public interface RoleManageService {
    DataTablesResult roleDataTables(int draw, int start, int length);
}
