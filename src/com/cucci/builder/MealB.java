package com.cucci.builder;

/**
 * @author shenyw
 **/
public class MealB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("汉堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("果汁");
    }
}
