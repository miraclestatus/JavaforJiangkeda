package com.neusoft;

import com.neusoft.utils.JDBCUtils;
import sun.security.krb5.SCDynamicStoreConfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 模拟用户登录程序
 */
public class JDBCDemo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到王者峡谷");
        System.out.println("请输入你的用户名");
        String userName = scanner.next();
        System.out.println("请输入你的密码");
        String password = scanner.next();

        boolean flag = login(userName, password);
        if (flag){
            System.out.println("欢迎回来，即将进入游戏");
        }else {
            System.out.println("用户名或密码错误，请重新登录");
        }
    }

    /**
     * 用户登录
     * @param userName
     * @param password
     * @return
     */
    public static boolean login(String userName,  String password){
        // 参数校验
        if (userName == null || password == null){
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = '"+userName+"' and password='"+password+"'";
//            System.out.println(sql);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 走到这里说明有异常，需要返回true
        return false;
    }
}
