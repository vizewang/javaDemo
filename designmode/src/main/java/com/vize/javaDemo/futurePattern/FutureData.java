package com.vize.javaDemo.futurePattern;

import java.util.Date;

/**
 * Created by weizwang on 2015/12/4.
 */
public class FutureData implements Data {
    RealData realData=null;
    boolean isReady=false;

    public synchronized void setRealData(RealData realData){
        if(isReady)
            return;
        this.realData=realData;
        isReady=true;
        notifyAll();
    }

    public synchronized String getResult() throws InterruptedException {
        if(!isReady){
            wait();
        }
        return realData.getResult();
    }
}
