package com.neusoft.domain;

/**
 * @author Eric Lee
 * @date 2020/8/7 09:44
 * 用户表实体类
 */
public class Admin {
    private  Integer adminId;
    private  String adminName;
    private  String password;

    public Admin() {
    }

    public Admin(Integer adminId, String adminName, String password) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.password = password;
    }

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
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
