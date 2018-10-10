package com.rrg.factory.impl;

import com.rrg.factory.Shape;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author Dravin
 * @Date 2018/7/28 上午11:15
 * @Version 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");

    }
}
