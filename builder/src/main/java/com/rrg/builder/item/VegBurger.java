package com.rrg.builder.item;

/**
 * @ClassName VegBurger
 * @Description TODO
 * @Author Dravin
 * @Date 2018/8/2 下午2:51
 * @Version 1.0
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
