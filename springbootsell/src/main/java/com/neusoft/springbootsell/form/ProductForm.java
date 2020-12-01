package com.neusoft.springbootsell.form;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductForm {

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productIcon;

    private String productDescription;

    private Integer categoryType;
}
