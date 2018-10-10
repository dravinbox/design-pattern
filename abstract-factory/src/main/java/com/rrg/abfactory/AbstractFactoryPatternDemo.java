package com.rrg.abfactory;

import com.rrg.abfactory.factory.*;
import com.rrg.abfactory.product.color.Blue;
import com.rrg.abfactory.product.color.Color;
import com.rrg.abfactory.product.color.Green;
import com.rrg.abfactory.product.color.Red;
import com.rrg.abfactory.product.shape.Circle;
import com.rrg.abfactory.product.shape.Rectangle;
import com.rrg.abfactory.product.shape.Shape;
import com.rrg.abfactory.product.shape.Square;

/**
 * @ClassName AbstractFactoryPatternDemo
 * @Description TODO
 * @Author Dravin
 * @Date 2018/7/28 上午11:38
 * @Version 1.0
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
//        demo();
        demo2();


    }
    public static void demo(){
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("RED");

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("Green");

        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor("BLUE");

        //调用 Blue 的 fill 方法
        color3.fill();

    }
    public static void demo2(){
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory::new);

        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape(Circle::new);

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape(Rectangle::new);

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape(Square::new);

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory::new);

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor(Red::new);

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor(Green::new);

        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor(Blue::new);

        //调用 Blue 的 fill 方法
        color3.fill();

    }

}
