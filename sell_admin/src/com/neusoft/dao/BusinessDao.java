package com.neusoft.dao;

import com.neusoft.domain.Business;

import java.util.List;

public interface BusinessDao {
    // 所有商家列表
    public List<Business> listBusiness();
    // 保存商家 返回值是 保存商家时自动生成的那个主键id
//    public void saveBusiness(Business business);
    public int saveBusiness(String businessName);
    // 删除商家
    public int removeBusiness(String businessName);
    // 修改商家
    public int supdateBusiness(Business business);
    // 通过id查询
    public Business getBusinessById();



}
