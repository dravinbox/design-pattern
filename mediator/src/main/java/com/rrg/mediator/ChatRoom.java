package com.rrg.mediator;

import java.util.Date;

/**
 * @ClassName ChatRoom
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午9:31
 * @Version 1.0
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()+" ["+user.getName()+ "]: " +message);
    }
}
