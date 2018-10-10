package com.rrg.builder.item;

import com.rrg.builder.packing.Packing;

/**
 * @ClassName ChickenBurger
 * @Description TODO
 * @Author Dravin
 * @Date 2018/8/2 下午2:53
 * @Version 1.0
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }


}
