package com.vize.javaDemo.strategy.impl;

import com.vize.javaDemo.strategy.FlyingStragety;

/**
 * Created by vizewang on 2015/8/15.
 */
public class FlyWithWin implements FlyingStragety {
    public void performFly() {
        System.out.println("用翅膀飞行");
    }
}
