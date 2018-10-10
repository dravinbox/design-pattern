package com.rrg.builder.item;

/**
 * @ClassName Pepsi
 * @Description TODO
 * @Author Dravin
 * @Date 2018/8/2 下午2:54
 * @Version 1.0
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
