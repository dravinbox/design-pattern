package com.rrg.builder.item;

import com.rrg.builder.packing.Packing;

import java.util.function.Supplier;

/**
 * @ClassName Item
 * @Description TODO
 * @Author Dravin
 * @Date 2018/8/2 下午2:44
 * @Version 1.0
 */
public interface Item {
    String name();
    float price();
    Packing packing();
    String print();


}
