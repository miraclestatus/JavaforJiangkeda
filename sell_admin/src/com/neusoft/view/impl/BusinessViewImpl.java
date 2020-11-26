package com.neusoft.view.impl;

import com.neusoft.dao.BusinessDao;
import com.neusoft.dao.impl.BusinessDaoImpl;
import com.neusoft.domain.Business;
import com.neusoft.view.BusinessView;

import java.util.List;
import java.util.Scanner;

public class BusinessViewImpl implements BusinessView {

    private Scanner input = new Scanner(System.in);

    @Override
    public void listAllBusinesses() {
        BusinessDao dao = new BusinessDaoImpl();
        List<Business> list = dao.listBusiness(null, null);
        System.out.println("商家编号" + "\t" + "商家名称" + "\t" + "商家地址" + "\t" + "商家备注" + "\t" + "商家配送费" + "\t" + "商家起送费");
        for (Business b : list) {
            System.out.println(b.getBusinessId() + "\t" + b.getBusinessName() + "\t" + b.getBusinessAddress() + "\t" + b.getBusinessExplain() + "\t" + b.getDeliveryPrice() + "\t" + b.getStartPrice());
        }

    }

    @Override
    public void selectBusinesses() {
        String businessName = "";
        String inputStr = "";
        String businessAddress = "";
        System.out.println("请输入是否输入商家名称关键词(y/n):");
        inputStr = input.next();
        if (inputStr.equals("y")) {
            System.out.println("请输入商家名称关键词");
            businessName = input.next();
        }

        System.out.println("请输入是否输入商家地址关键词(y/n):");
        inputStr = input.next();
        if (inputStr.equals("y")) {
            System.out.println("请输入商家地址关键词");
            businessAddress = input.next();
        }
        BusinessDaoImpl dao = new BusinessDaoImpl();
        List<Business> list = dao.listBusiness(businessName, businessAddress);
        System.out.println("商家编号" + "\t" + "商家名称" + "\t" + "商家地址" + "\t" + "商家备注" + "\t" + "商家配送费" + "\t" + "商家起送费");
        for (Business b : list) {
            System.out.println(b.getBusinessId() + "\t" + b.getBusinessName() + "\t" + b.getBusinessAddress() + "\t" + b.getBusinessExplain() + "\t" + b.getDeliveryPrice() + "\t" + b.getStartPrice());
        }

    }

    @Override
    public void saveBusiness() {
        System.out.println("请输入新商家的名称");
        String businessName = input.next();
        BusinessDao dao = new BusinessDaoImpl();
        int businessId = dao.saveBusiness(businessName);
        // 根据id进行查询， 然后进行回显
        if (businessId > 0) {
            System.out.println("保存成功");
            Business business = dao.getBusinessById(businessId);
            System.out.println(business);
        } else {
            System.out.println("新建商家失败");
        }

    }

    @Override
    public void removeBusiness() {
        System.out.println("请输入要删除的商家id");
        int id = input.nextInt();
        BusinessDao dao = new BusinessDaoImpl();
        System.out.println("确认要删除吗(y/n)");
        if (input.next().equals("y")) {
            int i = dao.removeBusiness(id);
            if (i == 1) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        }

    }

    @Override
    public Business login() {
        System.out.println("请输入商家编号");
        Integer businessId = input.nextInt();

        System.out.println("请输入密码");
        String password = input.next();

        BusinessDaoImpl dao = new BusinessDaoImpl();

        return dao.getBusinessByIdAndPassword(businessId, password);
    }

    @Override
    public void updatePassword(Integer businessId) {
        BusinessDao dao = new BusinessDaoImpl();
        Business business = dao.getBusinessById(businessId);

        System.out.println("请输入旧密码");
        String oldPass = input.next();
        System.out.println("请输入新密码");
        String newPass = input.next();
        System.out.println("请再次输入新密码");
        String beginNewPass = input.next();
        // 进行密码校验
        if (!business.getPassword().equals(oldPass)) {
            System.out.println("你的密码蒙错了，请重新输入");
        } else if (!newPass.equals(beginNewPass)) {
            System.out.println("两次密码不一致请重新输入");
        } else {
            int res = dao.updateBusinessPassword(businessId, newPass);
            if (res > 0) {
                System.out.println("修改密码成功！");
            } else {
                System.out.println("修改密码失败！");
            }
        }

    }
}
