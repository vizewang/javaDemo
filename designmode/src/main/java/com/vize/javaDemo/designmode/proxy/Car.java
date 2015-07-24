package com.vize.javaDemo.designmode.proxy;

import java.util.Random;

/**
 * Created by vizewang on 2015/7/24.
 */
public class Car implements Moveable {
    public void move() {

        try {
            System.out.println("汽车行驶中...");
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
