package com.neusoft.springbootsell.controller;

import com.neusoft.springbootsell.dataobject.ProductCategory;
import com.neusoft.springbootsell.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/")
    public List<ProductCategory> hello(){
        List<ProductCategory> list = categoryService.findAll();
        for (ProductCategory p:list){
            System.out.println(p);
        }
//        return "hello";
        return list;
    }
}
