package com.rrg.singleton;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Dravin
 * @Date 2018/9/13 下午9:45
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("counter1="+Singleton.counter1);
        System.out.println("counter2="+Singleton.counter2);
    }
}
