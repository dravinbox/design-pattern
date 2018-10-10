package com.rrg.factory.impl;

import com.rrg.factory.Shape;

/**
 * @ClassName Square
 * @Description TODO
 * @Author Dravin
 * @Date 2018/7/28 上午11:16
 * @Version 1.0
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");

    }
}
