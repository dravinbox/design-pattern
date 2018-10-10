package com.rrg.proxy;

/**
 * @ClassName ProxyImage
 * @Description TODO
 * @Author Dravin
 * @Date 2018/10/10 上午10:53
 * @Version 1.0
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    public ProxyImage(String fileName){
       this.fileName = fileName;
    }


    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();

    }
}
