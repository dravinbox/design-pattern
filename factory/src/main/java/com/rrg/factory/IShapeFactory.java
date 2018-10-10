package com.rrg.factory;

import java.util.function.Supplier;

/**
 * @ClassName IShapeFactory
 * @Description TODO
 * @Author Dravin
 * @Date 2018/8/2 上午11:39
 * @Version 1.0
 */
public interface IShapeFactory {
    /**
     * @Author Dravin
     * @Description  java8新特性，静态方法 ，可以实现
     * @Date 上午11:43 2018/8/2
     * @Param [supplier]
     * @return com.rrg.factory.Shape
     **/
    static Shape create(Supplier<Shape> supplier){
        return supplier.get();
    }
}
