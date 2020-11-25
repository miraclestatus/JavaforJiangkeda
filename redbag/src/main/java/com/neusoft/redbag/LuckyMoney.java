package com.neusoft.redbag;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 *LuckyMoney 是与数据库表中字段一一对应的实体类
 * JavaBean格式
 */
@Entity
public class LuckyMoney {
    // @Data lombok插件的一个注解，标识此注解的实体类不用自己写get和set方法了
    // @Entity 指定该类是实体类、@Id 代表主键 @GeneratedValue代表自增长
    @Id
    @GeneratedValue
    private Integer id;
    // 红包金额
    private BigDecimal money;
    // 发红包的人
    private String producer;
    // 收红包的人
    private String consumer;
    public LuckyMoney(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}
