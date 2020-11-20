package com.neusoft;

import com.neusoft.domain.Admin;
import com.neusoft.view.AdminView;
import com.neusoft.view.impl.AdminViewImpl;

/**
 * 饿了么管理入口程序
 */
public class ElmAdminEntry {
    public static void main(String[] args) {
        AdminView adminView = new AdminViewImpl();
        Admin admin = adminView.login();
        if (admin != null){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
