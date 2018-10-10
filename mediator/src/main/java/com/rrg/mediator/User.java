package com.rrg.mediator;

/**
 * @ClassName User
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午9:31
 * @Version 1.0
 */
public class User {
    private String name;
    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
