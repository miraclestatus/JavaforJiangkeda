package com.neusoft.springbootsell.controller;

import com.neusoft.springbootsell.dataobject.ProductInfo;
import com.neusoft.springbootsell.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 卖家商品控制
 */
@Controller
@RequestMapping("/seller/product")
public class SellerProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/list")
    public ModelAndView list(@RequestParam(value = "page", defaultValue = "1") Integer page,
                             @RequestParam(value = "size", defaultValue = "5")Integer size,
                             Map<String, Object> map){

        PageRequest pageRequest = new PageRequest(page - 1, size);
        Page<ProductInfo> productInfoPage = productService.findAll(pageRequest);
        map.put("productInfoPage", productInfoPage);
        map.put("currrentPage",page);
        map.put("size",size);
        return new  ModelAndView("product/list", map);
    }

}
