package com.vize.javaDemo.futurePattern;

/**
 * Created by weizwang on 2015/12/4.
 */
public class Application {
    private static long l;
    public static void main(String[] args) throws InterruptedException {
        Client client=new Client();
        Data data=client.request("name");
//        Thread.sleep(2000);
        System.out.println("数据="+data.getResult());

        System.out.println(String.valueOf(l));
    }
}
