package com.vize.javaDemo.designmode.proxy;

/**
 * Created by vizewang on 2015/7/24.
 */
public class CarLogProxy implements Moveable {
   private Moveable moveable;
    public CarLogProxy(Moveable moveable){
        super();
        this.moveable=moveable;
    }
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("日志开始...");
        moveable.move();
        long endTime = System.currentTimeMillis();
        System.out.println("日志结束");
    }
}
