package com.vize.javaDemo.adapter;

/**
 * Created by vizewang on 2015/8/16.
 */
public class TwoPlugAdapter implements ThreePlugIf {
    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug twoPlug) {
        this.plug=twoPlug;
    }

    public void powerWithThree() {
        System.out.println("通过转化");
        plug.powerWithTwo();
    }
}
