package com.neusoft.springbootsell.dataobject;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 商品类目
 */
@Entity
@Data
@NoArgsConstructor
@DynamicUpdate
public class ProductCategory {

    /** 类目id */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字 */
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;

    /** 创建时间*/
    private Date createTime;

    /** 更新时间*/
    private Date updateTime;


    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
