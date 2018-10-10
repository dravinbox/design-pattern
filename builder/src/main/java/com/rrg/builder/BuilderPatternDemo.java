package com.rrg.builder;

/**
 * @ClassName BuilderPatternDemo
 * @Description TODO
 * @Author Dravin
 * @Date 2018/8/2 下午3:23
 * @Version 1.0
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");

        String vegString=vegMeal.showItems();
        System.out.println(vegString);
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        String novegString = nonVegMeal.showItems();
        System.out.println(novegString);
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
