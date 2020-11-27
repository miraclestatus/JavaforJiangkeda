package com.neusoft.springbootsell.services;

import com.neusoft.springbootsell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    public ProductCategory findOne(Integer categoryId);

    public List<ProductCategory> findAll();

    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    public ProductCategory save(ProductCategory productCategory);


}
