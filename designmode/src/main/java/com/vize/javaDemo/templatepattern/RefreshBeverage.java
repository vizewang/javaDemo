package com.vize.javaDemo.templatepattern;

/**
 * Created by vizewang on 2015/8/15.
 */
public abstract class RefreshBeverage {
    public final void prepareBeverageTemplate(){
        boilWater();
        brew();
        pourInCup();
        if(isCustomerWantsConfiments())
        addCondiments();
    }

    protected boolean isCustomerWantsConfiments() {
        return true;
    }

    protected abstract void addCondiments();
    private void pourInCup() {
        System.out.println("将饮料倒入杯中");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("将水煮沸");
    }
}
