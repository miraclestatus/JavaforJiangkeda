package com.neusoft.springbootsell.repository;


import com.neusoft.springbootsell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTests {


    @Autowired
    OrderMasterRepository repository;
    private final String OPENID = "32233";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("3123");
        orderMaster.setBuyerName("小桂子");
        orderMaster.setBuyerPhone("223323");
        orderMaster.setBuyerAddress("江科大西门");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(3.6));

        OrderMaster result = repository.save(orderMaster);
//        System.out.println(master);
        Assert.assertNotNull(result);

    }



}


