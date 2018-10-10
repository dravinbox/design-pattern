package com.rrg.factory.impl;

import com.rrg.factory.Shape;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author Dravin
 * @Date 2018/7/28 上午11:16
 * @Version 1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");

    }
}
