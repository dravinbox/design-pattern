package com.rrg.builder;

import com.rrg.builder.item.ChickenBurger;
import com.rrg.builder.item.Coke;
import com.rrg.builder.item.Pepsi;
import com.rrg.builder.item.VegBurger;

/**
 * @ClassName MealBuilder
 * @Description TODO
 * @Author Dravin
 * @Date 2018/8/2 下午3:23
 * @Version 1.0
 */

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
