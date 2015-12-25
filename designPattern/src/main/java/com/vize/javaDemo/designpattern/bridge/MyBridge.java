package com.vize.javaDemo.designpattern.bridge;

/**
 * Created by weizwang on 2015/8/11.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
