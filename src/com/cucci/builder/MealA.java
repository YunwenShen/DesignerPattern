package com.cucci.builder;

/**
 * @author shenyw@citycloud.com.cn
 **/
public class MealA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
