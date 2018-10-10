package com.rrg.builder.item;

import com.rrg.builder.packing.Bottle;
import com.rrg.builder.packing.Packing;

/**
 * @ClassName ColdDrink
 * @Description TODO
 * @Author Dravin
 * @Date 2018/8/2 下午2:51
 * @Version 1.0
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
    @Override
    public String print() {
        return "Name:"+ name() +" Price:"+price()+" Packing:"+ packing().pack()+"\n";
    }
}
