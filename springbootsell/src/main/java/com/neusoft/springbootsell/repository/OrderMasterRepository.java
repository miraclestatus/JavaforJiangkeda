package com.neusoft.springbootsell.repository;

import com.neusoft.springbootsell.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
