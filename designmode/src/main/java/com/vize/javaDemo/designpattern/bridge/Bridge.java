package com.vize.javaDemo.designpattern.bridge;

/**
 * Created by weizwang on 2015/8/11.
 */
public abstract class Bridge {
    private Sourceable source;
    public void method(){
        source.method();
    }
    public Sourceable getSource(){
        return source;
    }
    public void setSource(Sourceable source){
        this.source=source;
    }
}
