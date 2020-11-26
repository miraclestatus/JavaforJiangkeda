package com.neusoft.redbag;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * LuckyMoney 是与数据库表中字段一一对应的实体类
 * JavaBean格式
 */
@Entity
@Data
@NoArgsConstructor
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


}
