package com.vize.javaDemo.futurePattern;

/**
 * Created by weizwang on 2015/12/4.
 */
public class RealData implements Data{
    protected String data;
    public RealData(String data) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.data = data;
    }

    public String getResult() throws InterruptedException {
        return data;
    }
}
