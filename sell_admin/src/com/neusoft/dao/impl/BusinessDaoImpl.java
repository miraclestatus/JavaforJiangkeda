package com.neusoft.dao.impl;

import com.neusoft.dao.BusinessDao;
import com.neusoft.domain.Business;
import com.neusoft.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BusinessDaoImpl  implements BusinessDao {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    @Override
    public List<Business> listBusiness() {
        ArrayList<Business> list = new ArrayList<>();
        String sql = "select * from business";
        try {
            conn = JDBCUtils.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                Business business = new Business();
                String businessName = rs.getString(3);
                business.setBusinessName(businessName);
                list.add(business);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
