package com.rrg.observer.observers;

import com.rrg.observer.Observer;
import com.rrg.observer.Subject;

/**
 * @ClassName BinaryObserver
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午10:39
 * @Version 1.0
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
