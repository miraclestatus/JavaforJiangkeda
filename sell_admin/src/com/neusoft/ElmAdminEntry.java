package com.neusoft;

import com.neusoft.dao.BusinessDao;
import com.neusoft.dao.impl.BusinessDaoImpl;
import com.neusoft.domain.Admin;
import com.neusoft.domain.Business;
import com.neusoft.view.AdminView;
import com.neusoft.view.BusinessView;
import com.neusoft.view.impl.AdminViewImpl;
import com.neusoft.view.impl.BusinessViewImpl;

import java.util.List;
import java.util.Scanner;

/**
 * 饿了么管理入口程序
 */
public class ElmAdminEntry {
    public static void main(String[] args) {
         run();
    }
    public static void run(){

        Scanner input =  new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("---------饿了么后台管理系统----------");
        System.out.println("-----------------------------------");

        AdminView adminView = new AdminViewImpl();
        BusinessView businessView = new BusinessViewImpl();
        Admin admin = adminView.login();
        int menu = 0;
        if (admin != null){
            System.out.println("登录成功");
            while (menu != 5){
                System.out.println("1. 查看所有商家   2. 搜索商家    3. 新建商家    4.删除商家   5. 退出系统");
                System.out.println("请输入你要选择的序号");
                menu = input.nextInt();
                switch (menu){
                    case 1:
                        businessView.listAllBusinesses();
                        break;
                    case 2:
                        businessView.selectBusinesses();
                        break;
                    case 3:
                        System.out.println("搜索商家");
                        break;
                    case 4:
                        System.out.println("搜索商家");
                        break;
                    case 5:
                        System.out.println("欢迎下次登录");
                        break;
                    default:
                        System.out.println("没有这个选项");
                        break;

                }
            }

        }else {
            System.out.println("登录失败, 用户名密码错误");
        }
    }
}
