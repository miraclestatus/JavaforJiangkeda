package com.neusoft.springbootsell.services.impl;

import com.neusoft.springbootsell.dataobject.ProductInfo;
import com.neusoft.springbootsell.repository.ProductInfoRepository;
import com.neusoft.springbootsell.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return  repository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return null;
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return null;
    }

    @Override
    public void increaseStock(String productId) {

    }

    @Override
    public void decreaseStock(String productId) {

    }
}
