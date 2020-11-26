package com.neusoft.springbootsell.repository;

import com.neusoft.springbootsell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
}
