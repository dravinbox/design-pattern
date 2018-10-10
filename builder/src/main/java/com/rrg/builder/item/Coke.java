package com.rrg.builder.item;

import com.rrg.builder.packing.Packing;

/**
 * @ClassName Coke
 * @Description TODO
 * @Author Dravin
 * @Date 2018/8/2 下午2:53
 * @Version 1.0
 */
public  class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
