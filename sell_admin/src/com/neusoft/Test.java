package com.neusoft;

import com.neusoft.dao.impl.BusinessDaoImpl;
import com.neusoft.domain.Business;

public class Test {
    public static void main(String[] args) {
        BusinessDaoImpl dao = new BusinessDaoImpl();


//        int businessid = dao.saveBusiness("江科大食堂");
//        System.out.println("id" + businessid);

//        dao.removeBusiness(10016);
//        Business business = new Business();
//        business.setBusinessName("真好吃");
//        business.setBusinessAddress("dasdas");
//        business.setBusinessExplain("dasdas");
//        business.setDeliveryPrice(5.);
//        business.setStartPrice(2.);
//        business.setBusinessId(10012);
//        dao.updateBusiness(business);
        Business b = dao.getBusinessById(10005);
        System.out.println(b);

    }
}
