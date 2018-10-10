package com.rrg.mediator;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午9:34
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args){
        User robert = new User("Robert");
        User john = new User("John");
        robert.sendMessage("Hi! John");
        john.sendMessage("Hello,Robert");
    }
}
