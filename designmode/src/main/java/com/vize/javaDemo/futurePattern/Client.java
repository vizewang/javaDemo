package com.vize.javaDemo.futurePattern;

/**
 * Created by weizwang on 2015/12/4.
 */
public class Client {
    public Data request(final String string){
        final FutureData futureData=new FutureData();
        new Thread(new Runnable() {
            public void run() {
                RealData realData=new RealData(string);
                futureData.setRealData(realData);
            }
        }).start();
        return futureData;
    }
}
