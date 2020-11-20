package com.neusoft;

import com.neusoft.dao.impl.BusinessDaoImpl;
import com.neusoft.domain.Business;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        BusinessDaoImpl dao = new BusinessDaoImpl();
        List<Business> businessList = dao.listBusiness();
        for(Business b : businessList){
            System.out.println(b);
        }
    }
}
