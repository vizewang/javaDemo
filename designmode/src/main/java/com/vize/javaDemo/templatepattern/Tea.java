package com.vize.javaDemo.templatepattern;

/**
 * Created by vizewang on 2015/8/15.
 */
public class Tea extends RefreshBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    @Override
    protected void brew() {
        System.out.println("用80度的热水浸泡茶叶5分钟");
    }
}
