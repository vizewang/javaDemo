package com.vize.javaDemo.strategy;

/**
 * Created by vizewang on 2015/8/15.
 */
public abstract class Duck {
    public abstract void display();

    private FlyingStragety flyingStragety;

    public void setFlyingStragety(FlyingStragety flyingStragety) {
        this.flyingStragety = flyingStragety;
    }

    public void fly() {
        flyingStragety.performFly();
    }
}
