package com.neusoft.domain;

/**
 * @author Eric Lee
 * @date 2020/8/7 14:39
 * 商品实体类
 */
public class Food {
    private Integer foodId;
    private String foodName;
    private String foodExplain;
    private Double foodPrice;
    private Integer businessId;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public void setFoodExplain(String foodExplain) {
        this.foodExplain = foodExplain;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", foodExplain='" + foodExplain + '\'' +
                ", foodPrice=" + foodPrice +
                ", businessId=" + businessId +
                '}';
    }
}
