package com.neusoft.dao.impl;

import com.neusoft.dao.AdminDao;
import com.neusoft.domain.Admin;
import com.neusoft.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDaoImpl implements AdminDao {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    @Override
    public Admin getAdminByNameAndPassword(String adminName, String password) {
        Admin admin = null;
        String sql = "select * from admin where adminName = ? and password = ? ";
        try {
            conn = JDBCUtils.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setString(1, adminName);
            pst.setString(2, password);
            rs = pst.executeQuery();
            while (rs.next()){
                admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, pst, conn);
        }

        return admin;
    }
}
