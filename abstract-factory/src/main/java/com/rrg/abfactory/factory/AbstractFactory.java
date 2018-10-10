package com.rrg.abfactory.factory;

import com.rrg.abfactory.product.color.Color;
import com.rrg.abfactory.product.shape.Shape;

import java.util.function.Supplier;

/**
 * @ClassName AbstractFactory
 * @Description TODO
 * @Author Dravin
 * @Date 2018/7/28 上午11:43
 * @Version 1.0
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Color getColor(Supplier<Color> supplier);
    public abstract Shape getShape(String shape);
    public abstract Shape getShape(Supplier<Shape> supplier);
}
