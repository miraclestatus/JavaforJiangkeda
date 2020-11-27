package com.neusoft.springbootsell.services.impl;

import com.neusoft.springbootsell.dataobject.ProductInfo;
import com.neusoft.springbootsell.enums.PayStatusEnum;
import com.neusoft.springbootsell.enums.ProductStatusEnum;
import com.neusoft.springbootsell.enums.ResultEnum;
import com.neusoft.springbootsell.exception.SellException;
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
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        Page<ProductInfo> productInfoPage = repository.findAll(pageable);
        // TODO
        return productInfoPage;
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);

    }

    @Override
    public ProductInfo onSale(String productId) {
        // 查一下
        ProductInfo productInfo = repository.findOne(productId);
        // 判断
        if (productInfo == null){
            throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
        }
        if (productInfo.getProductStatus() == ProductStatusEnum.UP.getCode()){
            throw new SellException(ResultEnum.PRODUCT_STATUS_ERROR);
        }
        // 更改值
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());

        return repository.save(productInfo);
    }

    @Override
    public ProductInfo offSale(String productId) {
        // 查一下
        ProductInfo productInfo = repository.findOne(productId);
        // 判断
        if (productInfo == null){
            throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
        }
        if (productInfo.getProductStatus() == ProductStatusEnum.DOWN.getCode()){
            throw new SellException(ResultEnum.PRODUCT_STATUS_ERROR);
        }
        // 更改值
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());

        return repository.save(productInfo);
    }

    @Override
    public void increaseStock(String productId) {
        // TODO
    }

    @Override
    public void decreaseStock(String productId) {

    }
}
