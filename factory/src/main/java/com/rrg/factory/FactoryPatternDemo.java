package com.rrg.factory;

import com.rrg.factory.impl.Circle;
import com.rrg.factory.impl.Rectangle;
import com.rrg.factory.impl.Square;

/**
 * @ClassName FactoryPatternDemo
 * @Description TODO
 * @Author Dravin
 * @Date 2018/7/28 上午11:12
 * @Version 1.0
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
//        demo();
        demoJava8();

    }
    public static void demo(){
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

    }
    /**
     * @Author Dravin
     * @Description  使用java8提供的接口静态方法作为工厂
     * @Date 上午11:45 2018/8/2
     * @Param []
     * @return void
     **/
    public static void demoJava8(){
        Shape shape1 = IShapeFactory.create(Circle::new);
        shape1.draw();

        Shape shape2 = IShapeFactory.create(Rectangle::new);
        shape2.draw();

        Shape shape3 = IShapeFactory.create(Square::new);
        shape3.draw();

    }
}
