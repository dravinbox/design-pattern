package com.rrg.proxy;

/**
 * @ClassName RealImage
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午10:51
 * @Version 1.0
 */
public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName){
       this.fileName = fileName ;
       loadFromDist(fileName);
    }
    private void loadFromDist(String fileName) {
        System.out.println("Loading "+fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying "+fileName);
    }
}
