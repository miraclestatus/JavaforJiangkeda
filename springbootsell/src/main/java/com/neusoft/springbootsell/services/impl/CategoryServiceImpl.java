package com.neusoft.springbootsell.services.impl;

import com.neusoft.springbootsell.dataobject.ProductCategory;
import com.neusoft.springbootsell.services.CategoryService;

import java.util.List;

public class CategoryServiceImpl  implements CategoryService {
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return null;
    }

    @Override
    public List<ProductCategory> findAll() {
        return null;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return null;
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return null;
    }
}
