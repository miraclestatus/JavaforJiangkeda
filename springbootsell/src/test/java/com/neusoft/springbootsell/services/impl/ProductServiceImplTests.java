package com.neusoft.springbootsell.services.impl;

import com.neusoft.springbootsell.dataobject.ProductInfo;
import com.neusoft.springbootsell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTests {
    @Autowired
    private  ProductServiceImpl productService;

    @Test
    public void findOne(){
        ProductInfo productInfo = productService.findOne("123456");
        System.out.println(productInfo);
        Assert.assertEquals("123456", productInfo.getProductId());
    }
    @Test
    public void findUpAll(){
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertNotEquals(0, list.size());
    }
    @Test
    public void findAll(){
//        PageRequest pageRequest = PageRequest.of(0, 2);
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<ProductInfo> productInfoPage = productService.findAll(pageRequest);
        Assert.assertNotEquals(0, productInfoPage.getTotalElements());

    }
    @Test
    public void save(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("3223232");
        productInfo.setProductName("麻辣烫");
        productInfo.setProductPrice(new BigDecimal(15));
        productInfo.setProductStock(2323);
        productInfo.setProductDescription("老好吃了");
        productInfo.setProductIcon("htppxxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo res = productService.save(productInfo);
        Assert.assertNotNull(res);

    }

    @Test
    public void onSale(){
        ProductInfo sale = productService.onSale("3223232");
        Assert.assertEquals(ProductStatusEnum.UP.getCode(), sale.getProductStatus());
    }

    @Test
    public void offSale(){
        ProductInfo sale = productService.offSale("3223232");
        Assert.assertEquals(ProductStatusEnum.DOWN.getCode(), sale.getProductStatus());
    }

}
