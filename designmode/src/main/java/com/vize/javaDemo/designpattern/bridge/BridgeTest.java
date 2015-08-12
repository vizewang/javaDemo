package com.vize.javaDemo.designpattern.bridge;

/**
 * Created by weizwang on 2015/8/11.
 */
public class BridgeTest {
    public static void main(String[] args) {

        Bridge bridge = new MyBridge();

        /*���õ�һ������*/
        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        /*���õڶ�������*/
        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
