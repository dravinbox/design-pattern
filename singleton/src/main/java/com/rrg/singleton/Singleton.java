package com.rrg.singleton;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author Dravin
 * @Date 2018/9/13 下午9:42
 * @Version 1.0
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    public static int counter1;
    public static int counter2=0;

    private Singleton(){
        counter1++;
        counter2++;
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
