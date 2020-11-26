package com.neusoft.springbootsell.repository;

import com.neusoft.springbootsell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {
}
