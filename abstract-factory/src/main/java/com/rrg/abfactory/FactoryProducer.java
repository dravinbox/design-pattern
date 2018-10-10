package com.rrg.abfactory;

import com.rrg.abfactory.factory.AbstractFactory;
import com.rrg.abfactory.factory.ColorFactory;
import com.rrg.abfactory.factory.ShapeFactory;

import java.util.function.Supplier;

/**
 * @ClassName FactoryProducer
 * @Description TODO
 * @Author Dravin
 * @Date 2018/7/28 上午11:45
 * @Version 1.0
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
    public static AbstractFactory getFactory(Supplier<AbstractFactory> supplier){
        return supplier.get();
    }

}
