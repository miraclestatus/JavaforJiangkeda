package com.neusoft.springbootsell.services.impl;

import com.neusoft.springbootsell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTests {
    @Autowired
    private  ProductServiceImpl productService;

    @Test
    public void findOne(){
        ProductInfo productInfo = productService.findOne("123456");
//        System.out.println(productInfo);
        Assert.assertEquals("123456", productInfo.getProductId());
    }
}
