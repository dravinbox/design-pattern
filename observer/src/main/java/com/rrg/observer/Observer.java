package com.rrg.observer;

/**
 * @ClassName Observer
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午10:39
 * @Version 1.0
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
