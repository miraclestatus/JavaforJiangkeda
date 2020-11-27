package com.neusoft.springbootsell.repository;

import com.neusoft.springbootsell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    // categoryType
    List<ProductCategory> findByCategoryTypeIn(List<Integer> catergoryList);
}
