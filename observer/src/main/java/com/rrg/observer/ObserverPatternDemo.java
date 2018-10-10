package com.rrg.observer;

import com.rrg.observer.observers.BinaryObserver;
import com.rrg.observer.observers.HexaObserver;
import com.rrg.observer.observers.OctalObserver;

/**
 * @ClassName ObserverPatternDemo
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午10:41
 * @Version 1.0
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
