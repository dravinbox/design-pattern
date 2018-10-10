package com.rrg.builder.item;

import com.rrg.builder.packing.Packing;
import com.rrg.builder.packing.Wrapper;

/**
 * @ClassName Burger
 * @Description TODO
 * @Author Dravin
 * @Date 2018/8/2 下午2:48
 * @Version 1.0
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override
    public String print() {
        return "Name:"+ name() +" Price:"+price()+" Packing:"+ packing().pack()+"\n";
    }
}
