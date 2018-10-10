package com.rrg.abfactory.factory;

import com.rrg.abfactory.product.color.Color;
import com.rrg.abfactory.product.shape.Circle;
import com.rrg.abfactory.product.shape.Rectangle;
import com.rrg.abfactory.product.shape.Shape;
import com.rrg.abfactory.product.shape.Square;

import java.util.function.Supplier;

/**
 * @ClassName ShapeFactory
 * @Description TODO
 * @Author Dravin
 * @Date 2018/7/28 上午11:44
 * @Version 1.0
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Color getColor(Supplier<Color> supplier) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Shape getShape(Supplier<Shape> supplier) {
        return supplier.get();
    }
}
