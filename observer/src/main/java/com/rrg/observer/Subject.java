package com.rrg.observer;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subject
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午10:38
 * @Version 1.0
 */

public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
