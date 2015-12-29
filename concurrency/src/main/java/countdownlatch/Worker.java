package countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by weizwang on 2015/12/29.
 */
public class Worker implements Runnable {
    private CountDownLatch downLatch;
    private String name;
    public Worker(CountDownLatch countDownLatch,String name){
        this.downLatch=countDownLatch;
        this.name=name;
    }
    public void run() {
        doWork();

    }

    private void doWork() {
        System.out.println(name+" is working");
    }
}
