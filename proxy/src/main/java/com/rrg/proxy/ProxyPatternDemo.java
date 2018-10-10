package com.rrg.proxy;

/**
 * @ClassName ProxyPatternDemo
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午10:55
 * @Version 1.0
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
