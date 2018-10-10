package com.rrg.factory;

import com.rrg.factory.impl.Circle;
import com.rrg.factory.impl.Rectangle;
import com.rrg.factory.impl.Square;

/**
 * @ClassName ShapeFactory
 * @Description TODO
 * @Author Dravin
 * @Date 2018/7/28 上午11:17
 * @Version 1.0
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else{
            return null;
        }

    }
}
