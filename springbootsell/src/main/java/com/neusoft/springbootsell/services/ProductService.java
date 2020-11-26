package com.neusoft.springbootsell.services;

import com.neusoft.springbootsell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    // 查询一个商品
    ProductInfo findOne(String productId);
    // 查询所有商品
    List<ProductInfo> findUpAll();
    // 分页查询所有商品
    Page<ProductInfo> findAll(Pageable pageable);
    // 新增商品
    ProductInfo save(ProductInfo productInfo);
    // 上架
    void increaseStock(String productId);
    // 下架
    void decreaseStock(String productId);
    // 加库存

    // 减库存



}
