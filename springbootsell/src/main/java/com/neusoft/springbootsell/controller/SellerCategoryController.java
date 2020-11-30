package com.neusoft.springbootsell.controller;


import com.neusoft.springbootsell.dataobject.ProductCategory;
import com.neusoft.springbootsell.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/seller/category")
public class SellerCategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ModelAndView list(Map<String, Object> map){
        List<ProductCategory> list = categoryService.findAll();
        for(ProductCategory p: list){
            System.out.println(p);
        }
        // 将list添加到map中
        map.put("categoryList", list);
        return new ModelAndView("category/list", map);
    }



}
