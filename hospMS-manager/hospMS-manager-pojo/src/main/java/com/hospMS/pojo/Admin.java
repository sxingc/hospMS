package com.hospMS.pojo;

import java.util.Date;

public class Admin {
    private Integer adminId;

    private String adminName;

    private String adminPasswd;

    private Integer roleId;

    private Date adminAddTime;

    private Integer adminStatus;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPasswd() {
        return adminPasswd;
    }

    public void setAdminPasswd(String adminPasswd) {
        this.adminPasswd = adminPasswd == null ? null : adminPasswd.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getAdminAddTime() {
        return adminAddTime;
    }

    public void setAdminAddTime(Date adminAddTime) {
        this.adminAddTime = adminAddTime;
    }

    public Integer getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Integer adminStatus) {
        this.adminStatus = adminStatus;
    }

//    myCode

    public String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getShowAdminAddTime() {
        return showAdminAddTime;
    }

    public void setShowAdminAddTime(String showAdminAddTime) {
        this.showAdminAddTime = showAdminAddTime;
    }

    public String showAdminAddTime;

    public Admin(Integer adminId, String adminName, String adminPasswd, Integer roleId, Date adminAddTime, Integer adminStatus) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPasswd = adminPasswd;
        this.roleId = roleId;
        this.adminAddTime = adminAddTime;
        this.adminStatus = adminStatus;
    }

    public Admin(Integer adminId, String adminName, String adminPasswd, Integer roleId, Integer adminStatus) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPasswd = adminPasswd;
        this.roleId = roleId;
        this.adminStatus = adminStatus;
    }

    public Admin() {
    }
}