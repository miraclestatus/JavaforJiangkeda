package com.neusoft.dao;

import com.neusoft.domain.Business;

import java.util.List;

public interface BusinessDao {
    // 所有商家列表
    public List<Business> listBusiness(String businessName, String businessAddress);
    // 保存商家 返回值是 保存商家时自动生成的那个主键id
//    public void saveBusiness(Business business);
    public int saveBusiness(String businessName);
    // 删除商家
    public int removeBusiness(int businessId);
    // 修改商家
    public int updateBusiness(Business business);
    // 通过id查询
    public Business getBusinessById(Integer businessId);
    // 通过id和password进行查询返回 Business对象
    public Business getBusinessByIdAndPassword(Integer businessId, String password);



}
