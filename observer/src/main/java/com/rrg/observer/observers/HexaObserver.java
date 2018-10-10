package com.rrg.observer.observers;

import com.rrg.observer.Observer;
import com.rrg.observer.Subject;

/**
 * @ClassName HexaObserver
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午10:41
 * @Version 1.0
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}

