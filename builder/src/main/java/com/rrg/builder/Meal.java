package com.rrg.builder;

import com.rrg.builder.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName Meal
 * @Description TODO
 * @Author Dravin
 * @Date 2018/8/2 下午2:55
 * @Version 1.0
 */
public class Meal {
    private List<Item> items= new ArrayList();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        return (float) items.stream().mapToDouble(Item::price).sum();
    }
    public String showItems(){
        Stream<String> stringSteam=items.stream().map(Item::print);
        return stringSteam.reduce(String::concat).orElse("none");
    }
}
