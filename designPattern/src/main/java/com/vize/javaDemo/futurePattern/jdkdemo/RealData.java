package com.vize.javaDemo.futurePattern.jdkdemo;

import java.util.concurrent.Callable;

/**
 * Created by weizwang on 2015/12/4.
 */
public class RealData implements Callable<String> {

    protected String data;
    public RealData(String data){
        this.data=data;
    }
    public String call() throws Exception {
        Thread.sleep(1000);
        return data;
    }
}
