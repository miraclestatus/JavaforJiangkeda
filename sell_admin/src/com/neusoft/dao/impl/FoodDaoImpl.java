package com.neusoft.dao.impl;

import com.neusoft.dao.FoodDao;
import com.neusoft.domain.Food;

import java.util.List;

public class FoodDaoImpl implements FoodDao {
    @Override
    public List<Food> listFoodByBusinessId(Integer businessId) {
        return null;
    }

    @Override
    public int saveFood(Food food) {
        return 0;
    }

    @Override
    public int updateFood(Food food) {
        return 0;
    }

    @Override
    public int removeFood(Integer foodId) {
        return 0;
    }

    @Override
    public Food getFoodById(Integer foodId) {
        return null;
    }
}
