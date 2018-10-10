package com.rrg.abfactory.factory;

import com.rrg.abfactory.product.color.Blue;
import com.rrg.abfactory.product.color.Color;
import com.rrg.abfactory.product.color.Green;
import com.rrg.abfactory.product.color.Red;
import com.rrg.abfactory.product.shape.Shape;

import java.util.function.Supplier;

/**
 * @ClassName ColorFactory
 * @Description TODO
 * @Author Dravin
 * @Date 2018/7/28 上午11:44
 * @Version 1.0
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Color getColor(Supplier<Color> supplier) {
        return supplier.get();
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Shape getShape(Supplier<Shape> supplier) {
        return null;
    }
}
