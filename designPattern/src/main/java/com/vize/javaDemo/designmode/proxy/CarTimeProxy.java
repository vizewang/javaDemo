package com.vize.javaDemo.designmode.proxy;

/**
 * Created by vizewang on 2015/7/24.
 */
public class CarTimeProxy implements Moveable {
   private Moveable moveable;
    public CarTimeProxy(Moveable moveable){
        super();
        this.moveable=moveable;
    }
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        moveable.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...汽车行驶时间:" + (endTime - starttime));
    }
}
