package com.cucci.builder;

/**
 * 建造者类
 *
 * @author shenyw@citycloud.com.cn
 **/
public abstract class MealBuilder extends Meal {
    Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}
