package com.rrg.observer.observers;

import com.rrg.observer.Observer;
import com.rrg.observer.Subject;

/**
 * @ClassName OctalObserver
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午10:40
 * @Version 1.0
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
