package com.cucci.builder;

/**
 * @author shenyw
 **/
public class BuilderTest {

    public static void main(String[] args) {
        MealA mealA = new MealA();
        KFCWaiter kfcWaiter = new KFCWaiter(mealA);
        kfcWaiter.perpareMeal();
    }
}
